import java.util.*;


public class EachGroup {
	
	// groupName: Name of eachGroup  
	// cellsLocation: pass 3 location numbers to each group
	
	private String groupName;
	private ArrayList<String> cellsLocation;
	
	//constructor
	
	public EachGroup(String groupName, ArrayList<String> cellsLocation){
		this.groupName = groupName;
		this.cellsLocation = cellsLocation;
	}
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public ArrayList<String> getCellsLocation() {
		return cellsLocation;
	}
	public void setCellsLocation(ArrayList<String> cellsLocation) {
		this.cellsLocation = cellsLocation;
	}
	
	public String checkEachGroupLocation(String userInput){
		
		String result ="miss";
		
		int index = cellsLocation.indexOf(userInput);
		
		if(index >= 0){
			cellsLocation.remove(index);
			result = "hit";
			
			if(cellsLocation.isEmpty()){
				result = "kill one";
			}
		}
		
//		System.out.println(result);
		return result;
		
	}
	
}
