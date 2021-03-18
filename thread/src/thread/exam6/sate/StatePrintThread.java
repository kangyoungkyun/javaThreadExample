package thread.exam6.sate;

public class StatePrintThread extends Thread{

	
	//이 예제는 스레드의 상태를 출력해주며, 생성자 매개값으로 받은 타겟 스레드의 상태를 0.5초 주기로 출력 해주는 클래스 입니다.
	
	private Thread targetThread;
	
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}


	@Override
	public void run() {
		


		while(true) {
			
			//타겟 스레드 상태
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태: " + state);
			
			//스레드가 처음 만들어지면
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			
			try {
				
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
