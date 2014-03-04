
public class TestMutiException {
	
	// exception declaration: when this method is called (in try block), then doing what the method do and also test the exception condition in this method
	public static void doException(String test) throws ExceptionA{
		
		System.out.println("Start multiException");
		
		if("a".equals(test)){
			
			throw new ExceptionA();
		}
		
		if("b".equals(test)){
			
			throw new ExceptionB();
		}
		
		if("c".equals(test)){
			
			throw new ExceptionC();
		}
		System.out.println("end");
	}
	
	public static void main(String[] args){
		
		String test = "a";
		try{
			System.out.println("try action");
			doException(test);
			
		}catch(ExceptionB b){
			System.out.println("ExceptionB");
			
		}catch(ExceptionC c){
			c.go();
			System.out.println("ExceptionC");
		}
		
		catch(ExceptionA a){
			System.out.println("ExceptionA");
		}
	}
}
