package study_190227;

import java.util.Random;
import java.util.Scanner;

public class GBBGame2 {

	// 메시지 검증!!
	public static String checkInputData(String input, String arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(!arr[i].contains(input)) {
				return "보";
			}
		}
		return input;
		
	}

	public static void main(String[] args) {
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		String arr[] = new String[3];
		arr[0] = "가위";
		arr[1] = "바위";
		arr[2] = "보";
		
		int count = 0;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println(sc);
			System.out.println("시작!!");
			String input = sc.nextLine();

			//메시지 검사
			input = checkInputData(input, arr);
			
			// 게임시작
			Random r = new Random();
			int num = r.nextInt(3); // 0, 1, 2

			// 컴퓨터가 낸 가위바위보는?
			String computer = arr[num];

			// 사용자가 낸 가위바위보는?
			String user = input;

			// if문을 사용자가 가위를 낸 경우
			if (user.equals("가위")) {
				if (computer.equals("가위")) {
					System.out.println("비겼습니다.");
				} else if (computer.equals("바위")) {
					System.out.println("졌습니다.");
					count++;
				} else if (computer.equals("보")) {
					System.out.println("이겼습니다.");
				}
			} else if (user.equals("바위")) {
				if (computer.equals("가위")) {
					System.out.println("이겼습니다.");
				} else if (computer.equals("바위")) {
					System.out.println("비겼습니다.");
				} else if (computer.equals("보")) {
					System.out.println("졌습니다.");
					count++;
				}
			} else if (user.equals("보")) {
				if (computer.equals("가위")) {
					System.out.println("졌습니다.");
					count++;
				} else if (computer.equals("바위")) {
					System.out.println("이겼습니다.");
				} else if (computer.equals("보")) {
					System.out.println("비겼습니다.");
				}
			}
			
			if(count == 3) {
				break;
			}
		}
		
		System.out.println("3번 지셨습니다");
		System.out.println("게임 종료");
		
	}
}
