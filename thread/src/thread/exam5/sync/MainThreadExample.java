package thread.exam5.sync;

public class MainThreadExample {

	public static void main(String[] args) {
		
		//공유 객체 생성
		Calculator calculator = new Calculator();
		
		//스레드 객체 1 
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		
		//스레드 객체 2
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
	}

}

/*
User1 - Thread : 100
User2 - Thread : 20
*/