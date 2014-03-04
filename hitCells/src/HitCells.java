import java.util.*;
public class HitCells {
	public static void main(String[] args){
		
		
		ArrayList<String> cells = new ArrayList<String>(){{
			add("2");
			add("3");
			add("4");
		}};
		
		System.out.println(cells);
		
		CellsLocation myCell = new CellsLocation();
		
		
		myCell.setTargetCells(cells);
		
		myCell.checkHitsOfCell("2");
		System.out.println(cells);
		myCell.checkHitsOfCell("3");
		System.out.println(cells);
		myCell.checkHitsOfCell("2");
		
		
	}
}
