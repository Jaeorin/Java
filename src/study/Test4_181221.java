package study;

public class Test4_181221 {

	public static void main(String[] args) {

		// 4�� 7�� �ּҰ���� ���ϱ�
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

		System.out.println(b + "������Դϴ�.");

	}

}
