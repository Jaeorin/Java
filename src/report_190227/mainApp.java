package report_190227;

import java.util.Random;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		//�����¹��� 1 ~ 5
		int array[] = new int[5];
		
		int outCount = 0;
		
		while(true) {
		
			//������ ���� ��(1~5)
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			
			//��ǻ�Ͱ� ���� ��(1~5), �������� ����
			Random r=  new Random();
			int point = r.nextInt(5);
			
			//��ǻ�Ͱ� ���� ����[1~5]
			int computer = array[point];	
			//����ڰ� �� ������������?
			int user = input;
			
			if(user == computer) {
				System.out.println("��Ÿ");
				if(user == 5 ){
					System.out.println("Ȩ��!");
				}
			}else if(user != computer) {
				System.out.println("��Ʈ����ũ");
			}else if(computer == 4) {
				System.out.println("��");
				
			}
			
			if(outCount == 3) {
				System.out.println("3 �ƿ�");
				System.out.println("���� ����");
				break;
			}		
		}
	}
}
