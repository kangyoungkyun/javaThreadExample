package thread.exam2.threadName;

public class ThreadA extends Thread{

	
	public ThreadA() {
		setName("threadA");
	}
	
	
	@Override
	public void run() {
		
		for(int i = 0; i<2 ; i++) {
			
			System.out.println(getName() + "가 출력한 내용");
			
		}
	}
	
}
