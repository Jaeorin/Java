package study_181219;

public class Fruit {

	// ��������
	static void cal() {
		
		int sum = 0;
		sum = sum + 10;
		System.out.println("���� : " + sum);

		
	}

	// �ٸ� Ŭ������ �������� ȣ��
	public static void main(String[] args) {

		cal();

		Apple ap = new Apple(); // new : �ٸ� Ŭ������ ȣ��,  Apple(); : ������, �ʱ�ȭ �ϴ� ����
		System.out.println(ap.name);
		System.out.println(ap.color);
		System.out.println(ap.seoson);
		System.out.println(ap.shape);
		System.out.println(ap.price);

		cal(); // ���������� ȣ��

	}

}

