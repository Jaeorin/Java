package study;
import java.util.Random;

public class Lotto_181221 {

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
		int lotto[] = { 0, 0, 0, 0, 0, 0 };

		// ���� �߻�
		Random r = new Random();

		for (int a = 0; a < 6; a++) {

			int b = r.nextInt(45) + 1;
			lotto[a] = b;

		}

		lotto = mySort(lotto); // �������� ���� ���ڸ� ���� ���ڴ�� ����

		// ���
		for (int c = 0; c < lotto.length; c++) {

			System.out.print(lotto[c] + " ");

		}

	}

}
