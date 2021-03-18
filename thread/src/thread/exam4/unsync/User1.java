package thread.exam4.unsync;

public class User1 extends Thread{

	
	private Calculator calculator;
	
	
	
	public void setCalculator(Calculator calculator) {
		
		this.setName("User1 - Thread");
		
		this.calculator = calculator;
	}


	@Override
	public void run() {
	
		//메모리 100 할당
		calculator.setMemory(100);
	}
	
	
}
