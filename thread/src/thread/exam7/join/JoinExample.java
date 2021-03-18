package thread.exam7.join;

public class JoinExample {

	public static void main(String[] args) {
		
		
		/*
		 
		 다른 스레드의 종료를 기다림(join())
		 스레드는 다른 스레드와 독립적으로 실행되는 것이 일반적이지만, 
		 다른 스레드가 종료될 때까지 기다리다가 실행되야되는 경우가 발생할 수 있다.
		 
		 */
		
		
		SumThread sumThread = new SumThread();
		
		//스레드 실행
		sumThread.start();
		
		try {
			
			// sumThread가 종료될때까지 메인 스레드를 정지시킴 
			sumThread.join();
			/*
			 
			 join() 메소드를 호출하면 
			 메인 스레드 는 sumThread 가 종료할 때까지 일시정지 상태가 되고
			 sumThread 의 run()이 종료되면 
			 메인 스레드 는 일시정지에서 풀려 다음 코드를 실행하게 된다.
			 
			 */
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println("1~100 까지 합은 : " + sumThread.getSum());

	}

}
