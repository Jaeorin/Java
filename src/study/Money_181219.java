package study;

public class Money_181219 {

	public static void main(String[] args) {

		// ���� ���� ���ϱ�
		// 500��, 100��, 50��, 10��,
		int money = 95630; // int 4����Ʈ, ����
		int restMoney = money; // call by value
		// �Ǵ� int rest_money = money; ���, �޸��� Ŀ��ǥ��� ����
		int count;
		
		count = restMoney/500; // count�� restMoney�� 500���� ���� ���̴�
		System.out.println("500�� : " + count); // �ʿ��� 500���� ������ ����Ѵ�
		restMoney = restMoney - (500 * count); // restMoney�� ���� money���� 500������ ���� ������ �����Ѵ�, 2680��(���� restMoney��) - 2500�� (500*count(5��)) = 180��
		System.out.println("���� �ݾ� : " + restMoney); // ���� �ݾ��� ����Ѵ�
		
		count = restMoney/100;
		System.out.println("100�� : " + count);
		restMoney = restMoney - (100 * count);
		System.out.println("���� �ݾ� : " + restMoney);
		
		count = restMoney/50;
		System.out.println("50�� : " + count);
		restMoney = restMoney - (50 * count);
		System.out.println("���� �ݾ� : " + restMoney);
		
		count = restMoney/10;
		System.out.println("10�� : " + count);
		restMoney = restMoney - (10 * count);
		System.out.println("���� �ݾ� : " + restMoney);

	}

}

