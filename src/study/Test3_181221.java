package study;

public class Test3_181221 {

	public static void main(String[] args) {

		int a[] = { 32, 11, 12, 18, 36 };

		for (int i = 0; i < a.length; i++) { // '�迭'.length : �迭�� ��   ex) a.length = 5
			System.out.print(a[i] + "  ");
		}

		// 3�� 4�� ������� ���Ͻÿ�.
		System.out.println();
		System.out.println(a[0]); // �迭�� ù��°���� 0~ ���� ȣ���Ѵ�
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		for (int i = 0; i < 5; i++) {

			int n1 = a[i] % 3;

			int n2 = a[i] % 4;

			int sum = n1 + n2;

			System.out.println(i + "���� loop");
			System.out.println("sum : " + sum);

			if (sum == 0) {
				System.out.println(a[i] + "�� 3�� 4�� �����");
			}

			else {
				System.out.println(a[i] + "�� 3�� 4�� ������� �ƴ�");
			}

		}

		// int b[]; : ����
		// int c[] = { 1, 2, 3, }; : �ʱ�ȭ
		
	}

}
