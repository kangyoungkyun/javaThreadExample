package thread.exam7.yield;

public class ThreadA extends Thread{

	public boolean stop = false; //쓰레드 종료 목적
	public boolean work = true; 
	
	@Override
	public void run() {
		
		while(!stop) {
			
			
			if(work) {
				
				System.out.println("ThreadA 작업 내용");
				
			}else {
				
				
				// work false시, 다른 스레드에 양보 
				Thread.yield(); //실행대기 상태로 들어감.
				
			}
			
		}
		
		System.out.println("ThreadA 종료");
		
		
	}

}
