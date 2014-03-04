
public class Cat extends Feline implements Pet{
	
	public Cat(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

	public void eat(){
		System.out.println("I am eating as Cat!");
	}
	
	public void makeNoise(){
		System.out.println("My noise is as Cat");
	}
	public void setCatType(){
		System.out.println("I am Cat! A Feline");
	}	
	
	public void beFriend(){
		System.out.println("I am Pet to be friend!");
	}
	
	public void beNice(){
		System.out.println("I am Pet to be nice!");
	}
}
