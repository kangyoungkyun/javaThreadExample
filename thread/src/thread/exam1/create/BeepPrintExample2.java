package thread.exam1.create;
import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		
	/*
		자바에서 쓰레드를 구현하는 방법은 2가지가 있다.
		
		Thread Class를 상속받는 방법
		Runnable 인터페이스를 구현하는 방법
		Thread Class를 상속받으면 다른 클래스를 상속 받을 수 없기때문에 Runnable 인터페이스를 구현하는게 일반적인 방법이다.
	*/
		
		
		//방법1 : 쓰레드가 동작
		
		Runnable beepTask = new BeepTask();
		
		//작업 스레드 생성 (Runnale 구현체 이용)
		Thread thread = new Thread(beepTask);
		
		//스레드는 start() 메서드를 호출해야만 실행된다. 
		//(start() 메소드 호출시, Runnable의 run() 메서드를 실행하면서 자신의 작업을 처리한다.)
		thread.start();
		
		
		
		
		//방법 2 : 익명 객체를 이용하는 방법
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				
			for(int i = 0; i < 5 ; i++) {
				
				System.out.println("뿡~");
				try {
					//2초 간격
					Thread.sleep(2000);
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		}
			
	});
		
		thread2.start();
		

		
		//방법 3 : 람다식을 이용한 방법 
		
		Thread thread3 = new Thread(()->{
			
			for(int i = 0; i < 5 ; i++) {
				
				System.out.println("빡~");
				try {
					//2초 간격
					Thread.sleep(2000);
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
			
		});
		
		thread3.start();
		
		
	}

}

/*

뿡~
빡~
beep~
뿡~
빡~
beep~
뿡~
빡~
beep~
뿡~
빡~
beep~
뿡~
빡~
beep~
 
 */


