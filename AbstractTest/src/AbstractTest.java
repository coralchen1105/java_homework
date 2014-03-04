
public abstract class AbstractTest {
	
	protected int a = 10;
	private String b = "string field";
	
	
	public AbstractTest() {
		System.out.println("this is the abstract class constructor");
	}
	
	public abstract void aMethod();
	public abstract int bMethod();
	public abstract int cMethod(int c);
	
	public void dMethod(){
		System.out.println("This is dMethod in AbstractTest");
	}
	
	public void eMethod(int a){
		this.a = a;
	}
	
	public void eMethod(int a, String b){
		this.a = a;
		this.b = b;
		System.out.println(a + b);
	}
	
	protected abstract void fMethod();
	
	public final void gMethod(){
		System.out.println("This is the final method in super, but can't to be abstract");  
	}
	
}
