// constructor and overloading test


public class SuperClass {
	
	public SuperClass(){
		System.out.println("this is superclass constructor");
	}
	
	public SuperClass(int i){
		System.out.println("Superclass constructor with one parameter" + i);
	}
	
	public int overloadTest(int i, int j){
		int a = i + j;
		return a;
	}
	 
	protected int overloadTest(int i, int j, int z){
		int b = i + j + z;
		return b;
	}
	
	String overloadTest(String a, String b, String c){
		String d = a + b + c;
		return d;
	}
}
