import java.text.DateFormat.Field;


public class Color {
	
	private int a = 10;
	private int b = 15;
	public int e = 10;
	
	private String color = "green";
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	
	
	public Color(String color){
		this.color = color;
		System.out.println("Super");
		
	}
	
	public void add(){
		int c = a + b;
		this.a = 25;
		
		System.out.println("c=" + c);
	}
	
	public static void main(String[] args){
		LoveColor lc = new LoveColor();
		Color color = new Color("yellows");
		lc.add();
		System.out.println(lc.getA());
		
		java.lang.reflect.Field[] fields = LoveColor.class.getFields();
		
		for(int i=0; i<fields.length; i++){
			System.out.println(fields[i]);
		}
		
		lc.changeSuper();
		
		System.out.println(lc.e);
		
	}
}
