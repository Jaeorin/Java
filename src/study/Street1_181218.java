package study;

public class Street1_181218 {
	
	public static void main(String[] args) {


		// while : �ݺ�, ()��ȣ ���̿� true, false ������ �ݺ����� ����
		int num = 3; // ���� ����

		while(num < 101) { // ��ȣ ���� ���� true�� ��� �ݺ�(15~21)
			System.out.println(num); // ���� ���
			num = num + 3; // ������ +3
		}


		// �ڵ����� ���������� �����ϴ� �ð� ���
		int destination = 11271; // �Ÿ�
		int speed = 3; // �ӵ�
		int sec = destination/speed; // ��(�ʼ�) ����
		int min = sec/60; // �� ���� (1�� = 60��)
		sec = sec%60; // ���� �� ���� �� �� ���� �Ÿ��� 60���� ���� �� ���� ������ �缳��
		int hour = min/60; // �ð� ���� (1�ð� = 60��)
		min = min%60; // ���� �� ���� �� �� ���� �Ÿ��� 60���� ���� �� ���� ������ �缳��
		System.out.println(sec + "��");
		System.out.println(min + "��");
		System.out.println(hour + "�ð�");
		System.out.println(hour + "�ð� " + min + "�� " + sec + "��"); // ������ �� ���

	}

}
