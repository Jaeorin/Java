package report_190220;

class Local {
	
	int Value(int a) {
		int test = a; // ��������
		System.out.println(test);
		return test; // ������������ ������ ���� ȣ���� ��ġ�� ��ȯ�ϰ��� �� �� ���
	}
	
	void Value2(int a) {
		if(a >= 5){
			System.out.println(a + "��(��) 5���� ũ�ų� ����");
			return;
		}
		System.out.println(a + "��(��) 5���� �۴�");
	}
	
}

class Global{

	static int width = 300;		// Ŭ���� ��������
	static int height = 200;	// Ŭ���� ��������
	String rating;				// ��ü ��������
	int number;					// ��ü ��������
	
}

public class Hanwoo {

	public static void main(String[] args){
		

		Local test = new Local();
		
		test.Value(5);
		
		int value1 = test.Value(8);
		int value2 = test.Value(2);
		
		System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
		
		test.Value2(2);	
		test.Value2(6);
		
		
		
		
		System.out.println("��ǰ �������� �к� :" + Global.width);
		System.out.println("��ǰ �������� ���� :" + Global.height);
		// Ŭ���� ���������� ������ ��ü���� ���̵� �ٸ� Ŭ�������� ��� ����
		
		Global hanwoo1 = new Global();
		hanwoo1.rating = "1++";
		hanwoo1.number = 5;
		// ��ü ���������� �⺻������ ������ Ŭ���������� ��� ����
		// �ٸ� Ŭ�������� �����Ű���� �� ��� �ش� Ŭ������ ��ü�� �޾ƿ;� ��� ����

		Global hanwoo2 = new Global();
		hanwoo2.rating = "1+ ";
		hanwoo2.number = 8;
		// ��ü ���������� �� ��ü �ڽŵ鸸�� ���� ����
		
		System.out.println("�ѿ� 1�� ��ǰ�� " + hanwoo1.rating + "��޿� " + hanwoo1.number
				+ "�����̸� ũ��� ���� " + Global.width + "cm, ���δ� " + Global.height + "cm�̴�");
		
		System.out.println("�ѿ� 2�� ��ǰ�� " + hanwoo2.rating + "��޿� " + hanwoo2.number
				+ "�����̸� ũ��� ���� " + Global.width + "cm, ���δ� " + Global.height + "cm�̴�");
		
	}
	
}