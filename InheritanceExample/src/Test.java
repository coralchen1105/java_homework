
public class Test {
	public static void main(String[] args){
		
		GrandParent gp = new GrandParent();
		Parent pr = new Parent();
		Child ch = new Child();
		
		// Grandparent superclass test
		gp.aMethod();
		gp.cMethod(10, 20);
		System.out.println(gp.b);
		System.out.println(GrandParent.c);
		// when access static fields, should use static way. But below is still compile
		System.out.println(gp.c);
		gp.eMethod();
		
		// Parent class test
		pr.aMethod();
		Parent.bMethod();
		System.out.println(Parent.c);
		pr.eMethod();
		//Static bMethod is belong to grangparent class, so not inherited from super class
		pr.bMethod();                                
		
		//Child class test
		Child.bMethod();
		System.out.println(Child.c);
		ch.eMethod();
		
		// cast test
		
		
		// this is cast down
		pr = ch;
		pr.aMethod();
		
		if(gp instanceof GrandParent){
			System.out.println("true");
		}
	}
}
