package study_181220;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		// 구구단 2단
		// 9번 반복
		// i값은 의미가 있음
		for (int x = 2; x <= 9; x++) {
			System.out.println(x + "단");

			for (int y = 1; y <= 9; y++) {
				System.out.print(x + " x " + y + " = " + (x * y) + "    ");
			}

			System.out.println();

		}

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 (2~9)");
		int z = sc.nextInt();

		System.out.println(z + "단");

		for (int i = 1; i < 10; i++) {
			System.out.print(z + " X " + i + " = " + (z * i) + "   ");
		}

		System.out.println();

		sc.close();

	}

}