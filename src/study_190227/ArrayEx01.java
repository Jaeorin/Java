package study_190227;

public class ArrayEx01 {
	
	static void inputArray(int num[]) {
		//�� �ֱ�
		for (int a = 0; a < num.length; a++) {
			num[a] = a + 1;
		}
	}
	
	static void test(int number) {
		number = 100;
	}

	public static void main(String[] args) {
		//1���� 10���� ������ �� �ִ� �迭!!
		//(1) type = int
		//(2) ũ�� = 40byte
		//(3) ���� = 10
		int num[] = new int[10];
		
		inputArray(num);
		
		int number = 20;
		test(number);
		System.out.println(number);
		
		for (int a = 0; a < num.length; a++) {
			System.out.println(num[a] + " ");
		}
	}

}
