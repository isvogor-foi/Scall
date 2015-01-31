package allocator.customization;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import allocator.matrices.BandwithMatrix;
import allocator.matrices.CommunicationMatrix;
import allocator.matrices.NodeNames;
import allocator.matrices.PairwiseComparisonMatrix;
import allocator.matrices.PlatformCommunicationMatrix;
import allocator.matrices.ResourceAvailabilityMatrix;
import allocator.matrices.ResourceConsumptionMatrix;

import com.google.gson.Gson;

public class AllocatorCaller {
	
	private String cmd[];
	CommunicationMatrix communicationMatrix;
	ResourceConsumptionMatrix resourceConsumptionMatrix;
	PlatformCommunicationMatrix platformCommunicationMatrix;
	ResourceAvailabilityMatrix resourceAvailabilityMatrix;
	BandwithMatrix bandwithMatrix;
	PairwiseComparisonMatrix resourceComparisonTable;
	
	public AllocatorCaller() {
		communicationMatrix = CommunicationMatrix.getInstance();
		resourceConsumptionMatrix = ResourceConsumptionMatrix.getInstance();
		platformCommunicationMatrix = PlatformCommunicationMatrix.getInstance();
		resourceAvailabilityMatrix = ResourceAvailabilityMatrix.getInstance();
		bandwithMatrix = BandwithMatrix.getInstance();
		resourceComparisonTable = PairwiseComparisonMatrix.getInstance();
		this.cmd = new String[6];
	}
	
	public Object[] runAllocator() throws IOException{
		
		Gson gson = new Gson();
		
		cmd[0] = gson.toJson(communicationMatrix.getValues());
		cmd[1] = gson.toJson(resourceConsumptionMatrix.getValues());
		cmd[2] = gson.toJson(platformCommunicationMatrix.getValues());
		cmd[3] = gson.toJson(resourceAvailabilityMatrix.getValues());
		cmd[4] = gson.toJson(bandwithMatrix.getValues());
		cmd[5] = gson.toJson(resourceComparisonTable.getValues());

		// LOCAL DISK
		//String pythonScriptPath = AllocatorCaller.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "src/AllocatorPy/AllocatorJava.exe";
		
		//FOR JAR!
		String path = AllocatorCaller.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		path = path.substring(0, path.lastIndexOf("/"));
		String pythonScriptPath = path + "/src/AllocatorPy/AllocatorJava.exe";

		Runtime rt = Runtime.getRuntime();
		
		int components = communicationMatrix.getColumnsCount();
		int platforms = resourceConsumptionMatrix.getColumnsCount();
	
		System.out.println(pythonScriptPath + " " + components + " "+ platforms + " " + this.cmd[0].toString() + " " + this.cmd[1].toString()+ " " + this.cmd[2].toString()+ " " + this.cmd[3].toString()+ " " + this.cmd[4].toString()+ " " + this.cmd[5].toString());
		Process pr = rt.exec(pythonScriptPath + " " + components + " "+ platforms + " " + this.cmd[0].toString() + " " + this.cmd[1].toString()+ " " + this.cmd[2].toString()+ " " + this.cmd[3].toString()+ " " + this.cmd[4].toString()+ " " + this.cmd[5].toString());
		
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String resultString = "";
		resultString = bfr.readLine();
		
		Object[] o = gson.fromJson(resultString, Object[].class);
		
		
		NodeNames nodeNames = NodeNames.getInstance();
		System.out.println(nodeNames.getComponentNames());
		System.out.println(nodeNames.getComputationaUnitNames());
		
		System.out.println(o[0].toString());

		pr.destroy();
		
		return o;
		
	}

}
