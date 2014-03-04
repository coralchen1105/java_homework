
public class TestException {
	
	public static void takeRisky(String test) throws RiskException{
		
		System.out.println("start risky");
		
		//set exception condition
		if("yes".equals(test)){
			throw new RiskException();
		}
		
		System.out.println("end risk");
	}
	
	public static void main(String[] args){
		
		try{
			
			System.out.println("start try");
			takeRisky("yes");
			System.out.println("end of try");
			
		}catch(RiskException ex){
			
			System.out.println("catch exception");
		
		}finally{
			System.out.println("finally");
		}
		
		System.out.println("end of main");
	}
	
	
}
