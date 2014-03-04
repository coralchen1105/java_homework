
public class ClassType {
	public static void main(String[] args){
		Class c = String.class;
		
		try{
			Object o = c.newInstance();
			System.out.println(o.getClass());
			if(o instanceof String){
				System.out.println("True");
				
				
			}else{
				System.out.println("False");
				
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
}
