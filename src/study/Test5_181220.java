package study;

public class Test5_181220 {

	public static void main(String[] args) {

		// 1부터 100까지 합을 구하시오.
		int sum1 = 0;

		for (int i = 0; i < 101; i++) {
			sum1 = sum1 + i;

		}

		System.out.println(sum1);

		// 1부터 100까지 중에 짝수의 합을 구하시오.
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
