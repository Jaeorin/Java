package study_181220;

import java.util.Scanner;

public class ConApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Ű����κ��� �Է¹��� �� ���� ��ɾ�
		System.out.println("������ �Է��Ͻÿ� : ");
		int score = sc.nextInt();

		if (score >= 80) {

			System.out.println("�հ��Դϴ�.");
		}

		else {

			System.out.println("���հ��Դϴ�.");
		}

		sc.close();

	}

}
