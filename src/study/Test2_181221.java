package study;

public class Test2_181221 {

	public static void main(String[] args) {

		// 1���� 300 ������ �� �߿� 4�� ����� ���� ���Ͻÿ�.
		int a = 0;
		int b = 0;

		while (true) {

			if (a % 4 == 0) {
				b = a + b;

			}

			if (a == 300) {

				break;

			}

			a++;

		}

		System.out.println("1���� 300 ������ �� �� 4�� ����� ���� " + b);

		int c = 0;

		for (int d = 0; d < 301; d++) {

			if (d % 4 == 0) {
				c = c + d;
			}
		}

		System.out.println("1���� 300 ������ �� �� 4�� ����� ���� " + c);

	}

}
