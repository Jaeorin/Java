package study_190315;

// 1. 타겟을 만드는 것 - 타겟 클래스를 만드는 것
// 조건 : Runnable 타입이 되어야 함(implements Runnable)
// 2. 타겟 클래스는 run()함수를 가지고 있어야 한다
// 3. run()메소드 내부(스택)가 쓰레드가 됨
// 4. 자바는 기본적으로 main쓰레드를 가진다
// 5. 새로운 쓰레드는 main 쓰레드와 다르게 동작한다
// 6. start()함수를 호출하면 자동으로 run()함수가 호출된다
// 주의 : run()함수는 Runnable 인터페이스가 들고 있지만 동적바인딩된다

public class ThreadStop {

	public static void main(String[] args) {

		NoDongJa ndj = null;
		Thread t1 = null;

		try {
			System.out.println("Main 1");
			Thread.sleep(1000);
			ndj = new NoDongJa();
			t1 = new Thread(ndj);
			t1.start();
		} catch (InterruptedException e) {
			System.out.println("Interrupt");
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("for 문 : " + i);
			} catch (Exception e) {

			}

			if (i == 2) {
				t1.interrupt();
			}

		}

	}

}

class NoDongJa implements Runnable {

	boolean check = true;

	@Override
	public void run() {

		try {
			while (true) {
				System.out.println("Work 1");
				Thread.sleep(2000);
				System.out.println("Work 2");
				Thread.sleep(2000);
				System.out.println("Work 3");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupt");
			e.printStackTrace();
		}

	}

}