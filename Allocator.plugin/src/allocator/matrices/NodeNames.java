package allocator.matrices;

import java.util.ArrayList;
import java.util.List;

public class NodeNames {
	private List<String> componentNames;
	private List<String> computationalUnitNames;
	private static NodeNames instance;
	
	private NodeNames() {
		componentNames = new ArrayList<String>();
		computationalUnitNames = new ArrayList<String>();
	}
	
	public List<String> getComponentNames() {
		return componentNames;
	}
	public void addComponentName(String name) {
		this.componentNames.add(name);
	}
	public List<String> getComputationaUnitNames() {
		return computationalUnitNames;
	}
	public void addComputationaUnitName(String name) {
		this.computationalUnitNames.add(name);
	}
	
	public void clear(){
		componentNames.clear();
		computationalUnitNames.clear();
	}
	
	public static NodeNames getInstance(){
		if(instance == null){
			instance = new NodeNames();
			return instance;
		}
		else return instance;
	}
	
}
