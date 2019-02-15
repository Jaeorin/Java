package study_181220;

import java.util.Scanner;

public class ConApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 키보드로부터 입력받을 때 쓰는 명령어
		System.out.println("점수를 입력하시오 : ");
		int score = sc.nextInt();

		if (score >= 80) {

			System.out.println("합격입니다.");
		}

		else {

			System.out.println("불합격입니다.");
		}

		sc.close();

	}

}
