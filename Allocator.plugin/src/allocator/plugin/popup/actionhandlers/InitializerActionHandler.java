package allocator.plugin.popup.actionhandlers;

import java.util.HashMap;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;

import allocator.matrices.BandwithMatrix;
import allocator.matrices.CommunicationMatrix;
import allocator.matrices.NodeNames;
import allocator.matrices.PairwiseComparisonMatrix;
import allocator.matrices.PlatformCommunicationMatrix;
import allocator.matrices.ResourceAvailabilityMatrix;
import allocator.matrices.ResourceConsumptionMatrix;
import AllocatorMetamodel.HWNode;
import AllocatorMetamodel.SWLink;
import AllocatorMetamodel.SWNode;
import AllocatorMetamodel.provider.AllocatorMetamodelItemProviderAdapterFactory;

//import com.google.gson.Gson;

public class InitializerActionHandler {
	
	ComposedAdapterFactory adapterFactory;
	AdapterFactoryEditingDomain editingDomain;
	AllocatorMetamodel.System modelRoot;
	Shell shell;

	public InitializerActionHandler(ISelection selection, Shell shell) {
		this.shell = shell;
		if(selection instanceof StructuredSelection){
			StructuredSelection ss = (StructuredSelection) selection;
			Object so = ss.getFirstElement();
			if(so instanceof IFile){
				IFile file = (IFile) so;
				InitializeIFile(file);
			}
		}
	}
	
	public void InitializeIFile(IFile file){
		
		// Create an adapter factory that yields item providers.
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		
		//adapterFactory.addAdapterFactory(new HardwareItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new AllocatorMetamodelItemProviderAdapterFactory());
		
		// Create the command stack that will notify this editor as commands are executed.
		BasicCommandStack commandStack = new BasicCommandStack();
		
		// Create the editing domain with a special command stack.
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());
		
		VerifyModel(URI.createPlatformResourceURI(file.getFullPath().toString(), true));
	}
	

	private void VerifyModel(URI resourceURI) {
		
		// matrices for input 
		CommunicationMatrix communicationMatrix = CommunicationMatrix.getInstance();
		ResourceConsumptionMatrix resourceConsumptionMatrix = ResourceConsumptionMatrix.getInstance();
		PlatformCommunicationMatrix platformCommunicationMatrix = PlatformCommunicationMatrix.getInstance();
		ResourceAvailabilityMatrix resourceAvailabilityMatrix = ResourceAvailabilityMatrix.getInstance();
		BandwithMatrix bandwithMatrix = BandwithMatrix.getInstance();
		PairwiseComparisonMatrix resourceComparisonTable = PairwiseComparisonMatrix.getInstance();
		NodeNames nodeNames = NodeNames.getInstance();
		String[] resourceNames = null;
		
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			resource = editingDomain.getResourceSet().getResource(resourceURI, true);
		} catch (Exception e) {
			// TODO: handle exception
			//ex.printStackTrace();
			System.out.print("Alternate resource loading.");
			resource = editingDomain.getResourceSet().getResource(resourceURI, false);
		}
		
		for (int i = 0; i < resource.getContents().size(); i++) {
			if(resource.getContents().get(i) instanceof AllocatorMetamodel.System){
				modelRoot = (AllocatorMetamodel.System) resource.getContents().get(i);
				
				// model root
				//System.out.println("Model name: " + modelRoot.getName());
				
				// initialize matrices 
				communicationMatrix.setSize(modelRoot.getSoftwares().get(0).getSWNodes().size(), modelRoot.getSoftwares().get(0).getSWNodes().size());
				resourceConsumptionMatrix.setSize(modelRoot.getSoftwares().get(0).getSWNodes().get(0).getSWResources().size(), modelRoot.getSoftwares().get(0).getSWNodes().size(), modelRoot.getPlatforms().get(0).getHWNodes().size());
				platformCommunicationMatrix.setSize(modelRoot.getPlatforms().get(0).getHWNodes().size(), modelRoot.getPlatforms().get(0).getHWNodes().size());
				resourceAvailabilityMatrix.setSize(modelRoot.getSoftwares().get(0).getSWNodes().get(0).getSWResources().size(), modelRoot.getPlatforms().get(0).getHWNodes().size());
				bandwithMatrix.setSize(modelRoot.getPlatforms().get(0).getHWNodes().size(), modelRoot.getPlatforms().get(0).getHWNodes().size());
				nodeNames.clear();
				
				//TODO: Obavezno napraviti provjeru velièine resursa i hardverskih èvorova i javiti prozorom ako ne štima
				//TODO: Obavezno provijeriti raspored resursa (za svaku komponentu moraju biti iste jedinice i vrijednosti)
				
				// software root
				for(AllocatorMetamodel.Software currentSoftware : modelRoot.getSoftwares()){
					//System.out.println("Software platform (name) : " + currentSoftware.getName() + " contains: ");
					// software nodes
					evaluateSoftwareNodes(resourceConsumptionMatrix, currentSoftware);
					// software links
					evaluateSoftwareLinks(communicationMatrix, currentSoftware);	
				}
				
				// hardware root
				for(AllocatorMetamodel.Hardware currentHardware : modelRoot.getPlatforms()){
					//System.out.println("Hardware platform: (name): " + currentHardware.getName() + " contains: ");
					// hardware nodes
					evaluateHardwareNodes(resourceAvailabilityMatrix, currentHardware);
					//hardware links
					evaluateHardwareLinks(platformCommunicationMatrix, bandwithMatrix, currentHardware);
				}
				
				//table.setNodes(modelRoot.getPlatforms().get(0).getHWNodes());
				//table.setLinks(modelRoot.getPlatforms().get(0).getHWLinks());
				
				
				//one implicite resource is communication so add +1 
				resourceComparisonTable.setSize(modelRoot.getPlatforms().get(0).getHWNodes().get(0).getHWResources().size() + 1, modelRoot.getPlatforms().get(0).getHWNodes().get(0).getHWResources().size() + 1);
				
				
				for(int j = 0; j < modelRoot.getPlatforms().get(0).getHWNodes().get(0).getHWResources().size(); j++){
					AllocatorMetamodel.Resource currentResource = modelRoot.getPlatforms().get(0).getHWNodes().get(0).getHWResources().get(j);
					resourceComparisonTable.setRowNames(j, currentResource.getName());
					resourceComparisonTable.setColumnNames(j, currentResource.getName());
				}
				resourceNames = resourceComparisonTable.getRowNames().clone();
				
				resourceComparisonTable.setRowNames(modelRoot.getPlatforms().get(0).getHWNodes().get(0).getHWResources().size(), "Communication");
				resourceComparisonTable.setColumnNames(modelRoot.getPlatforms().get(0).getHWNodes().get(0).getHWResources().size(), "Communication");
				// table resource setup (3 + implicit one)
				
				printMatrices(communicationMatrix, resourceConsumptionMatrix, platformCommunicationMatrix, resourceAvailabilityMatrix, bandwithMatrix);
			}//main if
		} // end main for
		
		// rewrite list to string array and set it to matrices...
		String[] componentNames = new String[nodeNames.getComponentNames().size()];
		String[] compontationalNames = new String[nodeNames.getComputationaUnitNames().size()];
		
		for(int i = 0; i < nodeNames.getComponentNames().size(); i++)
			componentNames[i] = nodeNames.getComponentNames().get(i);
		for(int i = 0; i < nodeNames.getComputationaUnitNames().size(); i++) 
			compontationalNames[i] = nodeNames.getComputationaUnitNames().get(i);

		
		communicationMatrix.setRowNamesArray(componentNames);
		communicationMatrix.setColumnNamesArray(componentNames);
		
		platformCommunicationMatrix.setRowNamesArray(compontationalNames);
		platformCommunicationMatrix.setColumnNamesArray(compontationalNames);
		
		resourceAvailabilityMatrix.setRowNamesArray(resourceNames);
		resourceAvailabilityMatrix.setColumnNamesArray(compontationalNames);
		
		bandwithMatrix.setRowNamesArray(compontationalNames);
		bandwithMatrix.setColumnNamesArray(compontationalNames);
		
		
		printMatrices(communicationMatrix, resourceConsumptionMatrix, platformCommunicationMatrix, resourceAvailabilityMatrix, bandwithMatrix);

	}

	private void printMatrices(CommunicationMatrix communicationMatrix,
			ResourceConsumptionMatrix resourceConsumptionMatrix,
			PlatformCommunicationMatrix platformCommunicationMatrix,
			ResourceAvailabilityMatrix resourceAvailabilityMatrix,
			BandwithMatrix bandwithMatrix) {
		System.out.println("Resource Demand Matrix T: ");
		resourceConsumptionMatrix.printMatrix();
		
		System.out.println("Communication Matrix K: ");
		communicationMatrix.printMatrix();
		
		System.out.println("Platform Communication Matrix C: ");
		platformCommunicationMatrix.printMatrix();
		
		System.out.println("Bandwith Matrix B: ");
		bandwithMatrix.printMatrix();
		
		System.out.println("Resource Availability Matrix R: ");
		resourceAvailabilityMatrix.printMatrix();
	}

	private void evaluateHardwareLinks(
			PlatformCommunicationMatrix platformCommunicationMatrix,
			BandwithMatrix bandwithMatrix,
			AllocatorMetamodel.Hardware currentHardware) {
		for(AllocatorMetamodel.HWLink currentLink : currentHardware.getHWLinks()){
			System.out.print("Computational link (name): " + currentLink.getName());
			System.out.println(" - props: " + currentLink.getValue() + " " + currentLink.getUnit() + ", bandwith: " + currentLink.getBandwith());
			
			platformCommunicationMatrix.setValue(getHWNodeIndexByName(currentHardware.getHWNodes(), currentLink.getHWSrc().getName()), getHWNodeIndexByName(currentHardware.getHWNodes(), currentLink.getHWDesc().getName()), currentLink.getValue());
			platformCommunicationMatrix.setValue(getHWNodeIndexByName(currentHardware.getHWNodes(), currentLink.getHWDesc().getName()), getHWNodeIndexByName(currentHardware.getHWNodes(), currentLink.getHWSrc().getName()), currentLink.getValue());
			
			bandwithMatrix.setValue(getHWNodeIndexByName(currentHardware.getHWNodes(), currentLink.getHWSrc().getName()), getHWNodeIndexByName(currentHardware.getHWNodes(), currentLink.getHWDesc().getName()), currentLink.getBandwith());
			bandwithMatrix.setValue(getHWNodeIndexByName(currentHardware.getHWNodes(), currentLink.getHWDesc().getName()), getHWNodeIndexByName(currentHardware.getHWNodes(), currentLink.getHWSrc().getName()), currentLink.getBandwith());
		}
	}

	private void evaluateHardwareNodes( ResourceAvailabilityMatrix resourceAvailabilityMatrix, AllocatorMetamodel.Hardware currentHardware) {
		NodeNames nodeNames = NodeNames.getInstance();
		
		for(int currentNodeIndex = 0; currentNodeIndex < currentHardware.getHWNodes().size(); currentNodeIndex++){
			HWNode currentNode = currentHardware.getHWNodes().get(currentNodeIndex);
			System.out.println("Computational node (name): " + currentNode.getName());
			nodeNames.addComputationaUnitName(currentNode.getName());
			
			for(int currentResourceIndex = 0; currentResourceIndex < currentNode.getHWResources().size(); currentResourceIndex++){
				String resourceValue = currentNode.getHWResources().get(currentResourceIndex).getValue();
			

				resourceAvailabilityMatrix.setValue(currentResourceIndex, currentNodeIndex, Integer.parseInt(resourceValue));
			}
		}
	}

	private void evaluateSoftwareLinks(CommunicationMatrix communicationMatrix,
			AllocatorMetamodel.Software currentSoftware) {
		for(SWLink currentLink : currentSoftware.getSWLinks()){
			
			System.out.print("Software link (name): " + currentLink.getName());
			System.out.println(" - props: " + currentLink.getValue() + " " + currentLink.getUnit());
			
			//getSWNodeIndexByName(currentSoftware.getSWNodes(), currentLink.getSWSrc().getName());

			communicationMatrix.setValue(getSWNodeIndexByName(currentSoftware.getSWNodes(), currentLink.getSWSrc().getName()), 
										getSWNodeIndexByName(currentSoftware.getSWNodes(), currentLink.getSWDesc().getName()), 
										Integer.parseInt(currentLink.getValue()));

			communicationMatrix.setValue(getSWNodeIndexByName(currentSoftware.getSWNodes(), currentLink.getSWDesc().getName()), 
										getSWNodeIndexByName(currentSoftware.getSWNodes(), currentLink.getSWSrc().getName()), 
										Integer.parseInt(currentLink.getValue()));
		}
	}

	private void evaluateSoftwareNodes(
			ResourceConsumptionMatrix resourceConsumptionMatrix,
			AllocatorMetamodel.Software currentSoftware) {
		// software nodes
		NodeNames nodeNames = NodeNames.getInstance();
		for(int currentNodeIndex = 0; currentNodeIndex < currentSoftware.getSWNodes().size(); currentNodeIndex++){
			SWNode currentNode = currentSoftware.getSWNodes().get(currentNodeIndex);
			System.out.println("Software component (name): " + currentNode.getName());	
			nodeNames.addComponentName(currentNode.getName());
			
			for(int currentResourceIndex = 0; currentResourceIndex < currentNode.getSWResources().size(); currentResourceIndex++){
				String resourceValues = currentNode.getSWResources().get(currentResourceIndex).getValue();
				String[] resourceValue = resourceValues.split(",");
				
				for(int currentValueIndex = 0; currentValueIndex < resourceValue.length; currentValueIndex++){
					resourceConsumptionMatrix.setValue(currentResourceIndex, currentNodeIndex, currentValueIndex, Integer.parseInt(resourceValue[currentValueIndex]));
				}
			}
		}
	}
	
	private int getSWNodeIndexByName(EList<SWNode> nodes, String nodeName){
		for(int i = 0; i < nodes.size(); i++){
			if(nodes.get(i).getName() == nodeName.trim()){
				return i;
			}
		}
		return -1;
	}
	
	private int getHWNodeIndexByName(EList<HWNode> nodes, String nodeName){
		for(int i = 0; i < nodes.size(); i++){
			if(nodes.get(i).getName() == nodeName.trim()){
				return i;
			}
		}
		return -1;
	}
	
	
	
}
