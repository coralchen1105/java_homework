


public class GuessGame {
	PlayerGuess p1 = new PlayerGuess();
	
	public void startGame(){
		int p1Guess = 0;

		int targetNumber = (int) (Math.random()*10);
		
		while(true){
			p1Guess = p1.guess();
			
			if (p1Guess == targetNumber){
				System.out.println("we have winner!");
				break;
			}else{
				System.out.println("Guess again!");
			}
			
		}
		
	}
}
