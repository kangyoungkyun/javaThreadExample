package thread.exam7.yield;

public class YieldExample {

	public static void main(String[] args) {
		/*
		    https://cornswrold.tistory.com/186
			다른 스레드에게 실행 양보(yield())
			
			스레드 실행 양보 예제
		 
		 */

		
		ThreadA threadA = new ThreadA();
		
		ThreadB threadB = new ThreadB();
		
		
		//스레드 실행
		threadA.start();
		
		threadB.start();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		threadA.work = false; // thread B만 실행
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		threadA.work = true; // thread A, B 둘다 실행 
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 둘다 종료 
		threadA.stop = true;
		threadB.stop = true;
		
	}

}
