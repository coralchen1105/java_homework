import java.util.*;
public class SimpleDotComGame {

	public static void main(String[] args){
		
		// initialize the cell location
		String result;
		ArrayList<String> iniCells = new ArrayList<String>(); 
		
		iniCells.add("2");
		iniCells.add("3");
		iniCells.add("4");
		
		SimpleDotCom dot = new SimpleDotCom();
		dot.setLocationCells(iniCells);
		
		// get userInput
		String[] userInput = {"1","0","3","4","5","2","2","1"};
		
		for(String eachUserInput: userInput){
			
			result = dot.checkLocationCells(eachUserInput);
			System.out.println(result);
		}
		
	}
	
}
