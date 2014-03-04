
public class LoveColor extends Color{
	
	public int d = 10;
	
	public LoveColor(){
		super("red");
		
		System.out.println("subclass");
	}
	
	public void changeSuper(){
		this.e = 15;
	}
	
}
