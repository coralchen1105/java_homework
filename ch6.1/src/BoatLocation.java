import java.util.*;

public class BoatLocation {
	
	private ArrayList<String> cellLocation;
	private String boatName;
	
	public void setCellLocation(ArrayList<String> userInputLocation){
		this.cellLocation = userInputLocation;
	}
	
	public void setBoatName(String userInputBoatName){
		this.boatName = userInputBoatName;
	}
	
	public ArrayList<String> getCellLocation(){
		return cellLocation;
	}
	
	public String getBoatName(){
		return boatName;
	}
	
	public String checkBoatLocation(String eachCell){
		
		String result= "miss";
		int idx = cellLocation.indexOf(eachCell);
		
		if(idx >= 0){
			
			cellLocation.remove(idx);
			result = "hit";
			
			if(cellLocation.isEmpty()){
				result = "kill";
			}
			
		}
		
		return result;
	}
}
