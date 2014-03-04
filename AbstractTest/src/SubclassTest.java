
public class SubclassTest extends AbstractTest implements InterfaceMethod{
	
	public SubclassTest(){
		System.out.println("subclass constructor");
	}
	
	// implement abstract class abstract methods
	public void aMethod(){
		//super refer to the immediate super class
		super.dMethod();
		System.out.println("aMethod in Subclass");
	
	}
	
	public int bMethod(){
		return this.a;
	}
	
	public int cMethod(int c){
		return c;
	}
	
	// this method is from interface String cMethod()
	public String cMethod(){
		System.out.println("This is implement interface cMethod()");
		return "cMethod";
	}
	
	public int cMethod(int c, String b){
		this.a = c;
		System.out.println(b);
		return c;
	}
	
	public void fMethod(){
		System.out.println("we change protected method to public, and override that abstract method in superclass");
	}
}
