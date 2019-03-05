package study_190227;

import java.util.Random;
import java.util.Scanner;

public class GBBGame2 {

	// �޽��� ����!!
	public static String checkInputData(String input, String arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(!arr[i].contains(input)) {
				return "��";
			}
		}
		return input;
		
	}

	public static void main(String[] args) {
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		String arr[] = new String[3];
		arr[0] = "����";
		arr[1] = "����";
		arr[2] = "��";
		
		int count = 0;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println(sc);
			System.out.println("����!!");
			String input = sc.nextLine();

			//�޽��� �˻�
			input = checkInputData(input, arr);
			
			// ���ӽ���
			Random r = new Random();
			int num = r.nextInt(3); // 0, 1, 2

			// ��ǻ�Ͱ� �� ������������?
			String computer = arr[num];

			// ����ڰ� �� ������������?
			String user = input;

			// if���� ����ڰ� ������ �� ���
			if (user.equals("����")) {
				if (computer.equals("����")) {
					System.out.println("�����ϴ�.");
				} else if (computer.equals("����")) {
					System.out.println("�����ϴ�.");
					count++;
				} else if (computer.equals("��")) {
					System.out.println("�̰���ϴ�.");
				}
			} else if (user.equals("����")) {
				if (computer.equals("����")) {
					System.out.println("�̰���ϴ�.");
				} else if (computer.equals("����")) {
					System.out.println("�����ϴ�.");
				} else if (computer.equals("��")) {
					System.out.println("�����ϴ�.");
					count++;
				}
			} else if (user.equals("��")) {
				if (computer.equals("����")) {
					System.out.println("�����ϴ�.");
					count++;
				} else if (computer.equals("����")) {
					System.out.println("�̰���ϴ�.");
				} else if (computer.equals("��")) {
					System.out.println("�����ϴ�.");
				}
			}
			
			if(count == 3) {
				break;
			}
		}
		
		System.out.println("3�� ���̽��ϴ�");
		System.out.println("���� ����");
		
	}
}
