import java.util.*;

/**
 * @author rex
 * 
 */
public class GroupCellsHit {
	private ArrayList<EachGroup> groupCells;
//	private int numberOfHits = 0;
	
	private void setUpGame(){
		
		ArrayList<String> firstCells = new ArrayList<String>();
		firstCells.add("A2");
		firstCells.add("A3");
		firstCells.add("A4");
	
		
		ArrayList<String> secondCells = new ArrayList<String>();
		secondCells.add("D4");
		secondCells.add("D5");
		secondCells.add("D6");
	 
		
		ArrayList<String> thirdCells = new ArrayList<String>();
		thirdCells.add("B0");
		thirdCells.add("C0");
		thirdCells.add("D0");
	
		EachGroup one = new EachGroup("Pet", firstCells);
		EachGroup two = new EachGroup("Ask", secondCells);
		EachGroup three = new EachGroup("Go", thirdCells);
		
		groupCells = new ArrayList<EachGroup>();
		
		groupCells.add(one);
		groupCells.add(two);
		groupCells.add(three);


		
	}
	
	private void startPlaying(){
		while(!groupCells.isEmpty()){
			
			checkUserInput("A2");
			checkUserInput("A3");
			checkUserInput("A4");
			checkUserInput("D4");
			checkUserInput("D5");
			checkUserInput("D6");
			checkUserInput("B0");
			checkUserInput("C0");
			checkUserInput("D0");
			
		}
		
		System.out.println("you sink all!");
		
		
	}
	
	private void checkUserInput(String userInput){
//		numberOfHits++;
		String result = "miss";
		String input = userInput;
		for(EachGroup each: groupCells){
			
			result = each.checkEachGroupLocation(input);
			
			if(result == "hit"){
			   break;
		   }
		   
		   if(result == "kill one"){
			   groupCells.remove(each);
			   break;
		   }
		}
		
		System.out.println(result);
		
		int size = groupCells.size();
		
		System.out.println(size);
		
	}
	
	public static void main(String[] args){
		GroupCellsHit game = new GroupCellsHit();
		game.setUpGame();
		game.startPlaying();
	}
	
}
