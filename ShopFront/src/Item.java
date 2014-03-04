import java.util.*;

public class Item implements Comparable<Item> {
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Item(int idIn, String nameIn, double priceIn, int quantityIn){
		this.id = idIn;
		this.name = nameIn;
		this.price = priceIn;
		this.quantity = quantityIn;
		
	}
	
	// set the generic type in the implement type
	public int compareTo(Item obj){
		
//		Item temp = (Item) obj;
		if(this.price > obj.price){
			return -1;
		}else if(this.price < obj.price){
			return 1;
		}else{
			return 0;
		}
		
	}
	
}
