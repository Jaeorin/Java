package study_181219;

import java.util.Scanner;

public class Test {

	static int plus(int x, int y, int z) {

		int i = x + y + z;
		return i;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int x = in.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int y = in.nextInt();
		System.out.println("����° ���ڸ� �Է��ϼ���.");
		int z = in.nextInt();
		int i = plus(x, y, z);
		System.out.println("3���� ���ڸ� ���� �� : " + i);
		
		in.close();

	}

}
