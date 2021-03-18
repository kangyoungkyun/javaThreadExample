package thread.exam2.threadName;

public class ThreadNameExample {

	public static void main(String[] args) {
		
		
		Thread thread = Thread.currentThread();
		
		String threadName = thread.getName();

		System.out.println("프로그램 시작 스레드 이름 : " + threadName); //main
		
		
		Thread threadA = new ThreadA();
		String threaAName = threadA.getName();

		System.out.println("작업 스레드 이름 : " + threaAName); //threadA
		threadA.start();
		
		
		Thread threadB = new ThreadB();
		System.out.println("작업 스레드 이름: "+threadB.getName());
		threadB.start();
		
	}

}

/*
프로그램 시작 스레드 이름 : main
작업 스레드 이름 : threadA
작업 스레드 이름: Thread-1
threadA가 출력한 내용
threadA가 출력한 내용
Thread-1가 출력한 내용
Thread-1가 출력한 내용

*/