import java.io.*;

public class GameCard implements Serializable{
	private String 	cardName;
	private int 	cardId;
	private String 	cardType;
	
	public GameCard(String cardName, int cardId, String cardType){
		this.cardName = cardName;
		this.cardId   = cardId;
		this.cardType = cardType;
	}
	
}
