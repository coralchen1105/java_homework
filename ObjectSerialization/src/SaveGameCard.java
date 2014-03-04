import java.io.*;

public class SaveGameCard {

	
	public static void main(String[] args){
		
		
		GameCard cardone = new GameCard("one", 1, "red");
		GameCard cardtwo = new GameCard("two", 2, "yellow");
		GameCard cardthree = new GameCard("three", 3, "green");
		
		try {
			FileOutputStream file = new FileOutputStream("myfile.ser");
			ObjectOutputStream os = new ObjectOutputStream(file);
			os.writeObject(cardone);
			os.writeObject(cardtwo);
			os.writeObject(cardthree);
			os.close();
			System.out.println("Object saved in file");
			
		} catch (IOException e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
		
		try{
			FileInputStream file = new FileInputStream("myfile.ser");
			ObjectInputStream is = new ObjectInputStream(file);
			
			GameCard red = (GameCard) is.readObject();
			GameCard yellow = (GameCard) is.readObject();
			GameCard green = (GameCard) is.readObject();
			
			if(red.equals(cardone)){
				System.out.println("red same");
			}else{
				System.out.println("red different");
			}
			
			if(yellow.equals(cardtwo)){
				System.out.println("yellow same");
			}else{
				System.out.println("yellow different");
			}
			
			if(green.equals(cardthree)){
				System.out.println("green same");
			}else{
				System.out.println("green different");
			}
			
			is.close();
			
		}catch(Exception e){
			System.out.println("wrong");
			e.printStackTrace();
		}
		
	}
	
//	public void writeObjects(GameCard card)  throws IOException{
//		
//		try {
//			FileOutputStream file = new FileOutputStream("myfile.ser");
//			ObjectOutputStream os = new ObjectOutputStream(file);
//			os.writeObject(card);
//			os.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
//	public ArrayList<GameCard> readObjects(String fileName) throws IOException, ClassNotFoundException{
//		
//		ArrayList<GameCard> objectList = new ArrayList<GameCard>(); 
//		
//		try{
//			
//			FileInputStream file = new FileInputStream(fileName);
//			ObjectInputStream os = new ObjectInputStream(file);
//			
//			while(true){
//				GameCard one = (GameCard) os.readObject();
//				objectList.add(one);
//				System.out.println(file.available());
//				System.out.println(objectList.size());
//				
//			}
//			
//			System.out.println(objectList.size());
//			
//		}catch (Exception e){
//			e.printStackTrace();
//		}
//		
//		return objectList;
//	}
}
