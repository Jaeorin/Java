package study_190227;

import java.util.Random;
import java.util.Scanner;

public class GBBGame {
	
	static int count = 0;
	
	// �޽��� ����!!
	public static String checkInputData(String input, String arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i].contains(input)) {
				return input;
			}
		}
		return "����";
		
	}

	public static void main(String[] args) {

		String arr[] = new String[3];
		arr[0] = "����";
		arr[1] = "����";
		arr[2] = "��";
		
		String arr2[] = new String[3];
		arr2[0] = "����";
		arr2[1] = "��";
		arr2[2] = "����";
		
		System.out.println("���ݺ��� ���� ���� �� ������ �մϴ�");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("���� ��� : " + (3 - count));
			System.out.println("����!!");
			String input = sc.nextLine();
					
			//���ӽ���
			Random r=  new Random();
			int num = r.nextInt(3);
			
			//��ǻ�Ͱ� �� ������������?
			String computer = arr[num];	
			//����ڰ� �� ������������?
			String user = input;
			
			//�޽��� �˻�
			input = checkInputData(input, arr);
			
			if (input.equals("����")){
				System.out.println("����� �����ʽÿ� �޸� �Ѥ�");
				count++;
			}
				
			for(int i1 = 0; i1 < arr.length; i1++) {
				if (user.equals(arr[i1])) {
					for(int i2 = 0; i2 < arr2.length; i2++) {
						if(computer.equals(arr2[i2])) {
							System.out.println("�����ϴ�");
							count++;
							break;
						}else if(computer.equals(user)) {
							System.out.println("�����ϴ�");
							break;
						}else {
							System.out.println("�̰���ϴ�");
							break;
						}
					}
				}
			}
			
			if(count == 3) {
				System.out.println("3�� ���̽��ϴ�");
				System.out.println("���� ����");
				break;
			}
		}
	}
}






