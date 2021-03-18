package thread.exam6.sate;

public class ThreadStateExample {

	public static void main(String[] args) {

		//이 예제는 스레드의 상태를 출력해주며, 
		//생성자 매개값으로 받은 타겟 스레드의 상태를 0.5초 주기로 출력 해주는 클래스 입니다.
		StatePrintThread statePritThread = new StatePrintThread(new TargetThread());
		statePritThread.start();
		
	}

}
