
public class eachAnimalTest {
	
	public static void main(String [] args){
		
		TestAnimal ta = new TestAnimal();
		Hippo h = new Hippo();
		Lion l = new Lion(80);
		Cat c =  new Cat(60);
		ta.animalAction(h,"a",12);
		ta.animalAction(l,"b",14);
		ta.animalAction(c, "cat", 11);
		Dog d = new Dog();
		
		c.beFriend();
		c.beNice();
		
		d.setCatType();
		
		Tiger t = new Tiger();
		Tiger t2 = new Tiger(12, "Tiger2");
		
		System.out.println(t2.getSize());
		System.out.println(t2.getName());
		
		
	}
}
