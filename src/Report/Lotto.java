package Report;

import java.util.Random;

public class Lotto {

	static int[] mySort(int a[]) {

		for (int b = 0; b < a.length - 1; b++) {

			for (int c = 0; c < a.length - 1; c++) {

				if (a[c] > a[c + 1]) {

					int d = 0;
					d = a[c];
					a[c] = a[c + 1];
					a[c + 1] = d;

				}

			}

		}

		return a;

	}

	public static void main(String[] args) {

		// �ζ� 6��
		// lotto[0] = 0;

		// ���� �߻�
		Random r = new Random();

		int lotto[] = { 0, 0, 0, 0, 0, 0 };

		for (int a = 0; a < lotto.length; a++) {

			int b = r.nextInt(45) + 1;

			for (int d = 0; d < lotto.length; d++) {

				if (b == lotto[d]) {

					int e = r.nextInt(45) + 1;

					b = e;

				}

			}

			lotto[a] = b;

		}

		lotto = mySort(lotto); // �������� ���� ���ڸ� ���� ���ڴ�� ����

		// ���
		for (int c = 0; c < lotto.length; c++) {

			System.out.print(lotto[c] + " ");

		}

	}

}