package study;

public class Test2_181221 {

	public static void main(String[] args) {

		// 1부터 300 사이의 수 중에 4의 배수의 합을 구하시오.
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

		System.out.println("1부터 300 사이의 수 중 4의 배수의 합은 " + b);

		int c = 0;

		for (int d = 0; d < 301; d++) {

			if (d % 4 == 0) {
				c = c + d;
			}
		}

		System.out.println("1부터 300 사이의 수 중 4의 배수의 합은 " + c);

	}

}
