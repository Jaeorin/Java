package study;

import java.util.Scanner;

public class Test2_181220 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���. (0~100)");
		int score = sc.nextInt(); // �Է´��
		char grade; // ������ ����
		if (score >= 90 && score <= 100) { // && : And, �Ǵ�
			grade = 'A';
		}

		else if (score >= 80 && score <= 90) {
			grade = 'B';
		}

		else if (score >= 70 && score <= 80) {
			grade = 'C';
		}

		else if (score >= 60 && score <= 70) {
			grade = 'D';
		}

		else {
			grade = 'F';
		}

		System.out.println(grade);

		sc.close();

	}

}
