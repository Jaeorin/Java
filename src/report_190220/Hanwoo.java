package report_190220;

class Globaltest{

	static int width = 300;		// Ŭ���� ��������
	static int height = 200;	// Ŭ���� ��������
	String rating;				// ��ü ��������
	int number;					// ��ü ��������
	
}

public class Hanwoo {


	
	int Local(int a, int b) {
		int test; // ��������
		test = a + b;
		return test; // ������������ ������ ���� ȣ���� ��ġ�� ��ȯ�ϰ��� �� �� ���
	}

	public static void main(String[] args){
			
		Hanwoo localtest1 = new Hanwoo();
		System.out.println(localtest1.Local(1, 5));
		
		System.out.println("��ǰ �������� �к� :" + Globaltest.width);
		System.out.println("��ǰ �������� ���� :" + Globaltest.height);
		// Ŭ���� ���������� ������ ��ü���� ���̵� �ٸ� Ŭ�������� ��� ����
		
		Globaltest hanwoo1 = new Globaltest();
		hanwoo1.rating = "1++";
		hanwoo1.number = 5;
		// ��ü ���������� �⺻������ ������ Ŭ���������� ��� ����
		// �ٸ� Ŭ�������� �����Ű���� �� ��� �ش� Ŭ������ ��ü�� �޾ƿ;� ��� ����

		Globaltest hanwoo2 = new Globaltest();
		hanwoo2.rating = "1+ ";
		hanwoo2.number = 8;
		// ��ü ���������� �� ��ü �ڽŵ鸸�� ���� ����
		
		System.out.println("�ѿ� 1�� ��ǰ�� " + hanwoo1.rating + "��޿� " + hanwoo1.number
				+ "�����̸� ũ��� ���� " + Globaltest.width + "cm, ���δ� " + Globaltest.height + "cm�̴�");
		System.out.println("�ѿ� 1�� ��ǰ�� " + hanwoo2.rating + "��޿� " + hanwoo2.number
				+ "�����̸� ũ��� ���� " + Globaltest.width + "cm, ���δ� " + Globaltest.height + "cm�̴�");
		
	}
	
}