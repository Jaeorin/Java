package study;

public class Test4_181220 {

	public static void main(String[] args) {

		int num = 10;
		num = num + 1;
		System.out.println(num);

		num++;
		System.out.println(num);

		num--;
		System.out.println(num);

		// (1) �ʱ�ȭ + ���ǹ��� + ���� + ����
		// (2) ���ǹ��� + ���� + ����
		for (int i = 0; i < 5; i = i + 1) {

			System.out.println(i);
			
		}

		System.out.println("1���� 10���� ���ϱ�");

		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i;
		}

		System.out.println(sum);

	}

}
