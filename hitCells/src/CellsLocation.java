import java.util.*;

public class CellsLocation {
	
	// properties
	private  ArrayList<String> targetCells;

	// getter and setter
	
	/**
	 * @param 
	 * @return an array of target cells
	 */
	public ArrayList<String> getTargetCells() {
		return targetCells;
	}
	
	public void setTargetCells(ArrayList<String> targetCells) {
		this.targetCells = targetCells;
	}
	
	
	public void checkHitsOfCell(String usrInput){
		
		String result = "miss";
		
		int index = targetCells.indexOf(usrInput);
		
		System.out.println(index);
		
		if(index >= 0){
			
			targetCells.remove(index);
			
			if(targetCells.isEmpty()){
				result = "kill";
			}else{
				result = "hit";
			}
		}
		
		
		System.out.println(result);
	}
		
}
