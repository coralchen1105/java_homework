import java.util.*;

public class SimpleDotCom {
	
	private ArrayList<String> locationCells;

	
	
	
	public void setLocationCells(ArrayList<String> locationCells){
		this.locationCells = locationCells;
	}
	
	public ArrayList<String> getLocationCells(){
		return locationCells;
	}
	
	public String checkLocationCells(String userInput){
		int index = locationCells.indexOf(userInput);
		String result = "miss";
		
		if(index>=0){
			
			locationCells.remove(index);
			
			if(locationCells.isEmpty()){
				
				result = "kill";
			}else{
				
				result ="hit";
			}
		}else if(index == -1 && locationCells.isEmpty()){
			
			result = "no more hits";
		}
		
		
		return result;
		
	}
	
}
