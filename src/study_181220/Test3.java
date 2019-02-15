package study_181220;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 60점 이상이면 합격, 미만은 불합격
		// 점수, 학년 2가지 정보 입력
		// 4학년일 경우 70점 이상이면 합격, 미만은 불합격
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요. (1~100)");
		int score = sc.nextInt();
		System.out.println("학년을 입력하세요. (1~4)");
		int year = sc.nextInt();

		if (score >= 60) { // 만약 60점 이상이라면

			if (year != 4) { // year가 4인지 아닌지 확인, true일 경우 else if로, false일 경우 출력
				System.out.println("합격입니다.");

			}

			else if (score >= 70) { // 그리고 위 year 체크에서 4일 경우 70점 이상이라면
				System.out.println("합격입니다.");

			}

			else { // 70점 미만이라면
				System.out.println("불합격입니다.");

			}

		}

		else { // 60점 미만이라면
			System.out.println("불합격입니다.");

		}

		sc.close();

	}

}