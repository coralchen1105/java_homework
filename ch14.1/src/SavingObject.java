import java.io.*;

public class SavingObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int power;
	String type;
	String[] weapons;
	
	public SavingObject(int p, String t, String[] w){
		power   = p;
		type    = t;
		weapons = w;
	}
	
	public int getPower(){
		return power;
	}
	
	public String getType(){
		return type;
	}
	
	public String[] getWeapons(){
		return weapons;
	}
}

