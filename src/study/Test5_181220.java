package study;

public class Test5_181220 {

	public static void main(String[] args) {

		// 1���� 100���� ���� ���Ͻÿ�.
		int sum1 = 0;

		for (int i = 0; i < 101; i++) {
			sum1 = sum1 + i;

		}

		System.out.println(sum1);

		// 1���� 100���� �߿� ¦���� ���� ���Ͻÿ�.
		int sum2 = 0;

		for (int i = 0; i < 101; i = i + 2) {
			sum2 = sum2 + i;

		}

		System.out.println(sum2);

		int sum3 = 0;

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum3 = sum3 + i;

			}

		}

		System.out.println(sum3);

	}

}
