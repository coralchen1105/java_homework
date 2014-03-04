
import java.util.Scanner;

public class PlayerGuess {
	int guessNum = 0;
	
	public int guess(){
		Scanner in = new Scanner(System.in);
		
		guessNum = in.nextInt();
		System.out.println(guessNum);
		return guessNum;
	} 
}
