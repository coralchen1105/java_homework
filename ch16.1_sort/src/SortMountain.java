import java.util.*;
public class SortMountain {

	ArrayList<Mountain> mtn = new ArrayList<Mountain>();
	
	// compare rule (name compare)
	class NameCompare implements Comparator<Mountain>{
		
		public int compare(Mountain one, Mountain two){
			return one.name.compareTo(two.name);
		}
	}
	
	// compare rule (height compare)
	class HeightCompare implements Comparator<Mountain>{
		public int compare(Mountain one, Mountain two){
			return (one.height - two.height);
		}
	}
	
	public void sortMountain(){
		
		mtn.add(new Mountain("long", 123456));
		mtn.add(new Mountain("shout", 178954));
		mtn.add(new Mountain("gine", 142222));
		mtn.add(new Mountain("anoud", 145511));
		
		NameCompare nc = new NameCompare();
		HeightCompare hc = new HeightCompare();
		
		Collections.sort(mtn, nc);
		System.out.println("by name:" + mtn);
		
		Collections.sort(mtn, hc);
		System.out.println("by height:" + mtn);
		
	}
	
	public static void main(String[] args){
		SortMountain sm = new SortMountain();
		sm.sortMountain();
	}
	
}
