package report_190220;

class product {

	static int width = 300;		// Ŭ���� ��������
	static int height = 200;	// Ŭ���� ��������
	String rating;				// ��ü ��������
	int number;					// ��ü ��������

	void local() {
		int test; // ��������
		test = 1 + 2;
		System.out.println(test);
		return; // ������������ ������ ���� ȣ���� ��ġ�� ��ȯ�ϰ��� �� �� ���
	}
	
}


public class Hanwoo {

	public static void main(String[] args){
		
		System.out.println("��ǰ �������� �к� :" + product.width);
		System.out.println("��ǰ �������� ���� :" + product.height);
		// Ŭ���� ���������� ������ ��ü���� ���̵� �ٸ� Ŭ�������� ��� ����
		
		product hanwoo1 = new product();
		hanwoo1.rating = "1++";
		hanwoo1.number = 5;
		// ��ü ���������� �⺻������ ������ Ŭ���������� ��� ����
		// �ٸ� Ŭ�������� �����Ű���� �� ��� �ش� Ŭ������ ��ü�� �޾ƿ;� ��� ����

		product hanwoo2 = new product();
		hanwoo2.rating = "1+ ";
		hanwoo2.number = 8;
		// ��ü ���������� �� ��ü �ڽŵ鸸�� ���� ����
		
		System.out.println("�ѿ� 1�� ��ǰ�� " + hanwoo1.rating + "��޿� " + hanwoo1.number + "�����̸� ũ��� ���� " + product.width + "cm, ���δ� " + product.height + "cm�̴�");
		System.out.println("�ѿ� 1�� ��ǰ�� " + hanwoo2.rating + "��޿� " + hanwoo2.number + "�����̸� ũ��� ���� " + product.width + "cm, ���δ� " + product.height + "cm�̴�");
		
	}
	
}
