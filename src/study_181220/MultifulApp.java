package study_181220;

import java.util.Scanner;

public class MultifulApp {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = in.nextInt();

		if (num % 3 == 0) {

			System.out.println("3의 배수입니다.");
		}

		else {

			System.out.println("3의 배수가 아닙니다.");
		}

		in.close();

	}

}
