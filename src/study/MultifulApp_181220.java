package study;

import java.util.Scanner;

public class MultifulApp_181220 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int num = in.nextInt();

		if (num % 3 == 0) {

			System.out.println("3�� ����Դϴ�.");
		}

		else {

			System.out.println("3�� ����� �ƴմϴ�.");
		}

		in.close();

	}

}
