package study_190315;

public class TestThread {

	// 메인쓰레드
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyThread());

		t1.start();
		
		for (int i = 0; i < 1000000000; i++) {

			if (i % 20000000 == 0) {
				System.out.println("MainThread : " + i);
			}

		}

		System.out.println("MainThread End");

	}

}

class MyThread implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 1000000000; i++) {

			if (i % 20000000 == 0) {
				System.out.println("MyThread : " + i);
			}

		}

		System.out.println("MyThread End");

	}

}