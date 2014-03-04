import java.util.*;

public class StoreFront {
	
	ArrayList<Item> itemList = new ArrayList<Item>();
	
	public static void main(String[] args){
		StoreFront store = new StoreFront();
		store.addItem(01, "baby cot", 699.00, 12);
		store.addItem(02, "baby pram", 799.00, 30);
		store.addItem(03, "baby bottle", 50.95, 100);
		store.addItem(04, "baby wrap", 90.45, 50);
		
		store.sortItemByPrice();
		store.listItemByName();
		
	}
	
	public void addItem(int id, String name, double price, int quantity){
		Item eachItem = new Item(id, name, price, quantity);
		itemList.add(eachItem);
	}
	
	public void sortItemByPrice(){
		Collections.sort(itemList);
	}
	
	public void listItemByName(){
		for(Item eachItem: itemList){
			System.out.print(eachItem.getName() + " ");
		}
	}
}
