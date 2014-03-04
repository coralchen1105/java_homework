

	public class Wrapper {
		
		int a = 1;
		
		public static void main(String [] args){
			//as this is static, so I can't put instant variables here.
			
			String s = "2";
			Integer i = new Integer(1);
			
			//parseInt() is static method in Integer Class, so only use class name to call this method. The parameters can only use the local variables or method parameters.
			int newS = Integer.parseInt(s);
			double d = i.doubleValue();
			
			System.out.println(i);
			System.out.println(newS);
			System.out.println(d);
			
			Wrapper w = new Wrapper();
			System.out.println(w.a);
			
		}
		
		public void go(){
			System.out.println("go");
		}
	}


