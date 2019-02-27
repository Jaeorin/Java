package study_190227;

public class ArrayEx01 {
	
	static void inputArray(int num[]) {
		//값 넣기
		for (int a = 0; a < num.length; a++) {
			num[a] = a + 1;
		}
	}
	
	static void test(int number) {
		number = 100;
	}

	public static void main(String[] args) {
		//1부터 10까지 저장할 수 있는 배열!!
		//(1) type = int
		//(2) 크기 = 40byte
		//(3) 길이 = 10
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
