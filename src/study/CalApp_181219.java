package study;

public class CalApp_181219 {

	// sum(���ϱ�), minus(����), multiful(���ϱ�), divid(������) �� �̿��� ����
	static int plus(int x, int y) { // ��ȣ ���� ������ �Ű������� �θ�
		
		int result = x + y;
		return result; // ȣ���� ���� ������� ������, ������ return�� ���� ������ �ٿ� ��ġ�ؾ� ��
	}

	static int minus(int x, int y) {
		
		int result = x - y;
		return result;
	}


	static int multiful(int x, int y) {
		
		int result = x * y;
		return result;
	}


	static int divid(int x, int y) {
		
		int result = x / y;
		return result;
	}

	public static void main(String[] args) {
		
		int r1 = plus(6, 2); // ��ȣ �ȿ� ���� �κ��� �μ���� �θ�
		System.out.println("plus : " + r1);
		int r2 = minus(6, 2);
		System.out.println("minus : " + r2);
		int r3 = multiful(6, 2);
		System.out.println("multiful : " + r3);
		int r4 = divid(6, 2);
		System.out.println("divid : " + r4);

	}

}

