
public class InterfaceTest implements InterfaceExample{
	

	public static void main(String[] args){
		InterfaceTest it = new InterfaceTest();
		it.aMethod();
		System.out.println(it.bMethod());
		System.out.println(a);
	}
	
	//must be public access as interface methods are declared default public
	public void aMethod(){
		System.out.println("this is subclass implement interface aMethod");
	}
	
	public int bMethod(){
		System.out.println("this is subclass implement interface bMethod");
		return 10;
	}
}
