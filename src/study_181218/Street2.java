package study_181218;

import java.util.Scanner;

public class Street2 {

	public static void main(String[] args) {

		//����
		Scanner in = new Scanner(System.in);
		System.out.println("�ѰŸ��� �Է��ϼ���."); // �ѰŸ� �Է¹� ���
		int destination = in.nextInt(); // �ѰŸ�
		System.out.println("�ʴ� �ӵ��� �Է��ϼ���."); // �ӵ� �Է¹� ���
		int speed = in.nextInt(); // �ʴ� �ӵ�
		int sec = destination/speed; // ��ü ��
		int r_sec = sec%60; // ���� ��
		int min = sec/60; // ��ü ��
		int r_min = min%60; // ���� ��
		int hour = min/60; // ��ü �ð�
		
		System.out.println(hour + "�ð� " + r_min + "�� " + r_sec + "��");
		
		in.close();

	}

}
