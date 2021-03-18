package thread.exam7.yield;

public class ThreadB extends Thread{

	public boolean stop = false; //쓰레드 종료 목적
	public boolean work = true; 
	
	@Override
	public void run() {
		
		while(!stop) {
			
			
			if(work) {
				
				System.out.println("ThreadB 작업 내용");
				
			}else {
				
				Thread.yield(); //실행대기 상태로 들어감.
				
			}
			
		}
		
		System.out.println("ThreadB 종료");
		
		
	}

}