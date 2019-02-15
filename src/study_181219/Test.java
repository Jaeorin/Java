package study_181219;

import java.util.Scanner;

public class Test {

	static int plus(int x, int y, int z) {

		int i = x + y + z;
		return i;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int x = in.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int y = in.nextInt();
		System.out.println("세번째 숫자를 입력하세요.");
		int z = in.nextInt();
		int i = plus(x, y, z);
		System.out.println("3가지 숫자를 더한 값 : " + i);
		
		in.close();

	}

}
