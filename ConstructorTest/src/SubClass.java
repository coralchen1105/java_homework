
public class SubClass extends SuperClass{
	public SubClass(int i, String s){
		System.out.println("SubClass with one constructor and two parameters" + i + s);
	}
	
	public static void main(String[] args){
		SubClass sc = new SubClass(1,"subclass");
		int a = sc.overloadTest(10, 20);
		int b = sc.overloadTest(10, 20, 30);
		String c = sc.overloadTest("a", "b", "c");
		
		System.out.println(a + b + c);
	}                                                       
}
