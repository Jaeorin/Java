package study_190305;

class Uncle {
	int money  = 1000000;
	int power  = 100;
	int height = 180;
}

class Father {
	int money  = 1000000000;
	int power  = 5;
	int height = 165;
}

//�ڹٴ� ���� ����� �������� �ʴ´�
//������ �ٶ󺸰� �ִ� ����� ���� ���´�
class Me extends Father {
	int height = 190;

}

public class Ex01App {
	public static void main(String[] args) {

		Father F = new Me(); //Me, Father ��� �޸𸮿� ����, Father�� �ֽ���
		System.out.println("money  : " +  F.money);
		System.out.println("power  : " +  F.power);
		System.out.println("height : " + F.height);
		
		Me M = new Me(); //Me, Father ��� �޸𸮿� ����, Me�� �ֽ���
		System.out.println("money  : " +  M.money);
		System.out.println("power  : " +  M.power);
		System.out.println("height : " + M.height);

	}

}
