package thread.exam1.create;

import java.awt.Toolkit;

public class BeepThread extends Thread{

	
/*
	자바에서 쓰레드를 구현하는 방법은 2가지가 있다.
	
	Thread Class를 상속받는 방법
	Runnable 인터페이스를 구현하는 방법
	Thread Class를 상속받으면 다른 클래스를 상속 받을 수 없기때문에 Runnable 인터페이스를 구현하는게 일반적인 방법이다.
*/
	
	@Override
	public void run() {
		
		
		//비프음 5번 반복해서 소리
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0 ; i< 5; i++) {
			
			toolkit.beep();
			
			System.out.println("딩 ~");
			try {
				
				//2초 간격
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}
