
public class RyanAndMonicaJob implements Runnable{
	
	private BankAccount account = new BankAccount();
	
	public static void main(String [] args){
		
		// create the thread job
		RyanAndMonicaJob theJob = new RyanAndMonicaJob();
		
		//create two threads
		Thread one = new Thread(theJob);
		Thread two = new Thread(theJob);
		one.setName("Ryan");
		two.setName("Monica");
		one.start();
		two.start();
		
	}
	
	public void run(){
		for(int x = 0; x<10;x++){
			System.out.println("runing" + x);
			
			makeWithdrawal(10);
			if(account.getBalance() <0){
				System.out.println("overdrawn");
			}
		}
	}
	
	private void makeWithdrawal(int amount){
		if(account.getBalance() >= amount){
			System.out.println("a" + Thread.currentThread().getName() + ":" + account.getBalance());
			try{
				System.out.println("b" + Thread.currentThread().getName() + ":" + "going to sleep");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + ": wake up" );
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println("c" + Thread.currentThread().getName() + ":" + account.getBalance());
			account.withdraw(amount);
			System.out.println("d" + Thread.currentThread().getName() + ":" + account.getBalance());
			
			
		}else{
			System.out.println("NOT ENOUTH MONEY");
		}
	}
}
