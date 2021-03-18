package thread.exam6.sate;

public class TargetThread extends Thread{

	
	@Override
	public void run() {
		
		//타겟 스레드 상태: RUNNABLE
		for(long i = 0; i < 1000000000 ; i++) {}
		
		
		try {
			
			//이때 TIMED_WAITING 이 출력된다.
			//타겟 스레드 상태: TIMED_WAITING
			Thread.sleep(1500);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		//타겟 스레드 상태: RUNNABLE
		for(long i = 0; i < 1000000000 ; i++) {}
	}
	
}

/*

TargetThread가 객체로 생성되면 NEW 상태를 가지고, run() 메소드가 종료되면 TERMINATED 상태가 되므로 결국 다음과 같은 상태로 변합니다.

NEW -> RUNNABLE -> TIMED_WAITING -> RUNNABLE -> TERMINATED

*/


