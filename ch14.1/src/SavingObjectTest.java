import java.io.*;


public class SavingObjectTest {
	
	public static void main(String[] args){
		
		// create three new objects for SavingObject classes
		
		SavingObject one = new SavingObject(50, "Elf", new String[] {"bow","sword","dust" });
		SavingObject two = new SavingObject(20, "Troll", new String[] {"bare hand","big as" });
		SavingObject three = new SavingObject(30, "Magician", new String[] {"spells","invisibility" });

		try{
			
			FileOutputStream    fileStream = new FileOutputStream("myObject.ser");
			ObjectOutputStream  os         = new ObjectOutputStream (fileStream);
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(three);
			os.close();
			
		}catch(IOException ex){
			ex.printStackTrace();
			System.out.println("error");
		}
		
		System.out.println(one.power);
		System.out.println(two.power);
		System.out.println(three.power);
		
		try{
			
			FileInputStream     fileInput = new FileInputStream("myObject.ser");
			ObjectInputStream   is        = new ObjectInputStream(fileInput);
			
			// create local SavingObject objects in this try block. Only can access these local variables in this try block
			SavingObject oneInput   = (SavingObject) is.readObject();
			SavingObject twoInput   = (SavingObject) is.readObject();
			SavingObject threeInput = (SavingObject) is.readObject();
			
			System.out.println(oneInput.power);
			System.out.println(twoInput.power);
			System.out.println(threeInput.power);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
		
	}
	
}
