
public class StringClassTest {
	
	int sum;
	public static void main(String[] args){
		
		// string test
		String 			test1 = new String("String123");
		String			test4 = new String("String123");
		
		if(test1.equals(test4)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		
		
		StringBuilder	test2 = new StringBuilder("StringBuilder123");
		StringBuffer	test3 = new StringBuffer("StringBuffer123");
		
		// primitive type test
		byte b = 127;
		int i = 300;
		byte b2 = (byte) (i/3);
		byte b3 = (byte)329;
		
//		System.out.print(b3);
//		System.out.print(b2);
		
		// variable scope test
		StringClassTest a = new StringClassTest();
		// instance variable change by object call.
		a.sumMethod(10,20);
		System.out.print(a.sum);
		
		
	}
	
	public int sumMethod(int x, int y){
		sum = x + y;
		return sum;
	}
	
}
