package study_181220;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 60�� �̻��̸� �հ�, �̸��� ���հ�
		// ����, �г� 2���� ���� �Է�
		// 4�г��� ��� 70�� �̻��̸� �հ�, �̸��� ���հ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���. (1~100)");
		int score = sc.nextInt();
		System.out.println("�г��� �Է��ϼ���. (1~4)");
		int year = sc.nextInt();

		if (score >= 60) { // ���� 60�� �̻��̶��

			if (year != 4) { // year�� 4���� �ƴ��� Ȯ��, true�� ��� else if��, false�� ��� ���
				System.out.println("�հ��Դϴ�.");

			}

			else if (score >= 70) { // �׸��� �� year üũ���� 4�� ��� 70�� �̻��̶��
				System.out.println("�հ��Դϴ�.");

			}

			else { // 70�� �̸��̶��
				System.out.println("���հ��Դϴ�.");

			}

		}

		else { // 60�� �̸��̶��
			System.out.println("���հ��Դϴ�.");

		}

		sc.close();

	}

}