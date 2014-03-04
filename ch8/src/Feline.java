
public abstract class Feline extends Animal{
	
	private int number;
	
	public Feline(int number){
		this.number = number;
		System.out.println(this.number);
	}
	
	public void setTypeFeline(){
		System.out.println("I am Feline");
	}
}
