package report_190220;

class LocalValue {
	
	int Local1() {
		int test = 3; // ��������
		System.out.println(test);
		return test; // ������������ ������ ���� ȣ���� ��ġ�� ��ȯ�ϰ��� �� �� ���
	}
	
	int Local2(int a, int b) {
		int test; 
		test = a + b;
		System.out.println(test);
		return test;
	}
	
	void voidtest(int a) {
		if(a >= 5){
			System.out.println(a + "��(��) 5���� ũ�ų� ����");
			return;
		}
		System.out.println(a + "��(��) 5���� �۴�");
	}
	
}

class Globaltest{

	static int width = 300;		// Ŭ���� ��������
	static int height = 200;	// Ŭ���� ��������
	String rating;				// ��ü ��������
	int number;					// ��ü ��������
	
}

public class Hanwoo {

	public static void main(String[] args){
		

		LocalValue Localtest = new LocalValue();
		Localtest.voidtest(2);	
		Localtest.voidtest(6);
		int value1 = Localtest.Local1();
		int value2 = Localtest.Local2(1,  2);
		
		System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
		
		
		
		
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
		
		System.out.println("�ѿ� 2�� ��ǰ�� " + hanwoo2.rating + "��޿� " + hanwoo2.number
				+ "�����̸� ũ��� ���� " + Globaltest.width + "cm, ���δ� " + Globaltest.height + "cm�̴�");
		
	}
	
}