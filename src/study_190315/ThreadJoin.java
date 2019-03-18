package study_190315;

public class ThreadJoin {

	public static void main(String[] args) {

		Runnable r = new MyRun();
		Thread t1 = new Thread(r);
		t1.start();

		System.out.println("main1");

		try {
			t1.join();
		} catch (Exception e) {

		}

		System.out.println("main2");

	}

}

class MyRun implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {

		}

	}

}