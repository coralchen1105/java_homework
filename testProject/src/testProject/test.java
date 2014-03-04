package testProject;

public class Test {
	
	    public static void main(String[] args)
	    {
	        int a = 2;
	         Test vp = new Test();
	        vp.addOne(a);
	        System.out.print("maina = " +a);
	    }
	    void addOne(int a) 
	    {
	        System.out.print("addOnea = " +a++); 
	    }  
	
}
