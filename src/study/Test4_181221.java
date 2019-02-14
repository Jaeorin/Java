package study;

public class Test4_181221 {

	public static void main(String[] args) {

		// 4와 7의 최소공배수 구하기
		int a[] = { 48, 17, 21, 56, 28 };

		int b = 9999;

		for (int c = 0; c < a.length; c++) {

			int d = a[c] % 4;

			int e = a[c] % 7;

			int f = d + e;

			if (f == 0) {

				if (b > a[c]) {

					b = a[c];

				}

			}

		}

		System.out.println(b + "공배수입니다.");

	}

}
