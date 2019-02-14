package study;

public class CalApp_181219 {

	// sum(더하기), minus(빼기), multiful(곱하기), divid(나누기) 를 이용한 계산기
	static int plus(int x, int y) { // 괄호 안의 내용은 매개변수라 부름
		
		int result = x + y;
		return result; // 호출한 열로 결과값을 가져감, 때문에 return은 가장 마지막 줄에 위치해야 함
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
		
		int r1 = plus(6, 2); // 괄호 안에 들어가는 부분을 인수라고 부름
		System.out.println("plus : " + r1);
		int r2 = minus(6, 2);
		System.out.println("minus : " + r2);
		int r3 = multiful(6, 2);
		System.out.println("multiful : " + r3);
		int r4 = divid(6, 2);
		System.out.println("divid : " + r4);

	}

}

