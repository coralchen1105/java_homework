import java.util.*;

public class BoatGame {
	
	private ArrayList<BoatLocation> boatList = new ArrayList<BoatLocation>();
	private int numOfGuess;
	
	
	
	public ArrayList<String> setUseInput(String one, String two, String three){
		ArrayList<String> userInput = new ArrayList<String>();
		userInput.add(one);
		userInput.add(two);
		userInput.add(three);
		
		return userInput;
	}
	
	public void setupGame(){
		
		// create 3 boat location objects
		BoatLocation aBoat = new BoatLocation();
		BoatLocation bBoat = new BoatLocation();
		BoatLocation cBoat = new BoatLocation();
		
		// create 3 names for each boat location object
		aBoat.setBoatName("first Boat");
		bBoat.setBoatName("second Boat");
		cBoat.setBoatName("third Boat");
		
		// add 3 boats objects to boatList
		boatList.add(aBoat);
		boatList.add(bBoat);
		boatList.add(cBoat);
		
		//get userInput into Boat location
		ArrayList<String> aBoatInput = setUseInput("A1", "A2", "A3");
		aBoat.setCellLocation(aBoatInput);
		
		//System.out.println(aBoat.getCellLocation());
		
		ArrayList<String> bBoatInput = setUseInput("B1", "B2", "B3");
		bBoat.setCellLocation(bBoatInput);
		
		//System.out.println(bBoat.getCellLocation());
		
		ArrayList<String> cBoatInput = setUseInput("C1", "C2", "C3");
		cBoat.setCellLocation(cBoatInput);
		
		for(BoatLocation eachBoat: boatList){
			
			System.out.println(eachBoat.getBoatName());
			
			System.out.println(eachBoat.getCellLocation());
		
		}
		
	}
	
	//public void checkUserGuess(String )
	
	public void startGame(){
		String userGuess = "A1";
		
		
	}
	
	public static void main(String[] args){
		BoatGame game = new BoatGame();
		game.setupGame();
	}
	
}
