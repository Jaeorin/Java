package report_190220;

class Card{

	String kind;      	    	//ī���� ���� - ��ü����
	int number;			//ī���� ���� - ��ü����
	static int width = 100;     //ī���� �ʺ� - Ŭ��������
	static int height = 250;    //ī���� ���� - Ŭ��������

}

public class GlobalLocalVariable {

	public static void main(String[] args){

		System.out.println("Card�� �ʺ�� :"+ Card.width);
		System.out.println("Card�� ���̴� :"+ Card.height);
		//�̷��� Ŭ���� ������ ��üȭ�� ��Ű�� �ʾƵ�
		//'Ŭ������.������'���� ��������� �����ϴ�.

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		//kind�� number�� ��ü�����̹Ƿ� CardŬ������ ��üȭ
		//���Ѿ����� 'Ŭ������.������'���� ����� �����ϴ�.

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		//��ü������ ��üȭ�� ��ų������ ���� �ٸ� ��������� �����Եȴ�.

		System.out.println("c1ī���"+c1.kind+" "+c1.number+"���̸�," +
			           " ũ��� ("+c1.width +"," + c1.height+")�̴�.");
		System.out.println("c2ī���"+c2.kind+" "+c2.number+"���̸�," +
	           	   	   " ũ��� ("+c2.width +"," + c2.height+")�̴�.");
		//�� print������ ����ϸ�
		//c1ī��� Heart 7���̸�, ũ���(100,250)�̴�.
		//c2ī��� Spard 4���̸�, ũ���(100,250)�̴�.
		//�� ��µȴ�.

		c1.width = 200;
		c1.height = 300;
		//c1�� width�� height�� ���� 200�� 300���� �ʱ�ȭ ���״�.

		System.out.println("c1ī���"+c1.kind+" "+c1.number+"���̸�," +
				" ũ��� ("+c1.width +"," + c1.height+")�̴�.");
		System.out.println("c2ī���"+c2.kind+" "+c2.number+"���̸�," +
				" ũ��� ("+c2.width +"," + c2.height+")�̴�.");

		//c1�� width�� height�� �����߱⶧���� �� ����Ʈ ��������
		//c1�� ���̿� �ʺ� �ٲ�� ������ ������ ����ϸ�
		//c1ī��� Heart 7���̸�, ũ���(200,300)�̴�.
		//c2ī��� Spard 4���̸�, ũ���(200,300)�̴�.
		//ó�� c2�� ���̿� �ʺ� ����ȴ�. 

	}

}