package thread.exam5.sync;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	
	//동기 방식 :  synchronized
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		
		
	}
	
	
	
}
