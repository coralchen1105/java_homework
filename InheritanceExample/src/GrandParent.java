
public class GrandParent {
	// initialize fields
	private int a = 10;
	protected int b = 15;
	static int c = 50;
	final int d = 30;
	
	// GrandParent constructor
	public GrandParent(){
		System.out.println("Grandparent constructor");
	}
	
	// method declaration
	public void aMethod(){
		System.out.println("this is the Grandparent aMethod()");
	}
	
	public static void bMethod(){
		System.out.println("this is the Grandparent static bMethod()");
	}
	
	public void cMethod(int a, int b){
		this.a = a*2;
		this.b = b*2;
	}
	
	public void dMethod(int c){
		c = c*2;
	}
	
	public final void eMethod(){
		System.out.println("this is grandparent final method");
	}
	
}
