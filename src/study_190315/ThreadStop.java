package study_190315;

// 1. Ÿ���� ����� �� - Ÿ�� Ŭ������ ����� ��
// ���� : Runnable Ÿ���� �Ǿ�� ��(implements Runnable)
// 2. Ÿ�� Ŭ������ run()�Լ��� ������ �־�� �Ѵ�
// 3. run()�޼ҵ� ����(����)�� �����尡 ��
// 4. �ڹٴ� �⺻������ main�����带 ������
// 5. ���ο� ������� main ������� �ٸ��� �����Ѵ�
// 6. start()�Լ��� ȣ���ϸ� �ڵ����� run()�Լ��� ȣ��ȴ�
// ���� : run()�Լ��� Runnable �������̽��� ��� ������ �������ε��ȴ�

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
				System.out.println("for �� : " + i);
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