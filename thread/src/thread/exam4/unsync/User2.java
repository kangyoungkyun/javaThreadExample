package thread.exam4.unsync;

public class User2 extends Thread{

	
	private Calculator calculator;
	
	
	
	public void setCalculator(Calculator calculator) {
		
		this.setName("User2 - Thread");
		
		this.calculator = calculator;
	}



	public void run() {
		calculator.setMemory(20);
	}
	
	
}