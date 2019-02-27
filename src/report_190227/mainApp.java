package report_190227;

import java.util.Random;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		//던지는범위 1 ~ 5
		int array[] = new int[5];
		
		int outCount = 0;
		
		while(true) {
		
			//유저가 던진 곳(1~5)
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			
			//컴퓨터가 던진 곳(1~5), 랜덤으로 지정
			Random r=  new Random();
			int point = r.nextInt(5);
			
			//컴퓨터가 던진 범위[1~5]
			int computer = array[point];	
			//사용자가 낸 가위바위보는?
			int user = input;
			
			if(user == computer) {
				System.out.println("안타");
				if(user == 5 ){
					System.out.println("홈런!");
				}
			}else if(user != computer) {
				System.out.println("스트라이크");
			}else if(computer == 4) {
				System.out.println("볼");
				
			}
			
			if(outCount == 3) {
				System.out.println("3 아웃");
				System.out.println("게임 종료");
				break;
			}		
		}
	}
}
