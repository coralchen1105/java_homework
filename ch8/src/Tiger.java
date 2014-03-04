
public class Tiger extends Feline{
	
	public Tiger(){
		super(50);
		System.out.println("the first constructor of Tiger class");
	}
	
	public Tiger(int size, String name){
		super(40);
		this.setSize(size);
		this.setName(name);
		
	}
	
	public void eat(){
		System.out.println("I am eating as Tiger!");
	}
	
	public void makeNoise(){
		System.out.println("My noise is as Tiger");
	}
	public void setTigerType(){
		System.out.println("I am Tiger! A Feline");
	}	
}
