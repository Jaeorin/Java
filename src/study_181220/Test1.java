package study_181220;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int num = sc.nextInt();

		if (num % 2 == 0) {

			System.out.println("¦���Դϴ�.");
		}

		else {

			System.out.println("Ȧ���Դϴ�.");
		}

		sc.close();

	}

}

