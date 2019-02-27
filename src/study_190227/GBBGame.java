package study_190227;

import java.util.Random;
import java.util.Scanner;

public class GBBGame {
	
	static int count = 0;
	
	// 메시지 검증!!
	public static String checkInputData(String input, String arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i].contains(input)) {
				return input;
			}
		}
		return "오류";
		
	}

	public static void main(String[] args) {

		String arr[] = new String[3];
		arr[0] = "가위";
		arr[1] = "바위";
		arr[2] = "보";
		
		String arr2[] = new String[3];
		arr2[0] = "바위";
		arr2[1] = "보";
		arr2[2] = "가위";
		
		System.out.println("지금부터 가위 바위 보 게임을 합니다");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("남은 목숨 : " + (3 - count));
			System.out.println("시작!!");
			String input = sc.nextLine();
					
			//게임시작
			Random r=  new Random();
			int num = r.nextInt(3);
			
			//컴퓨터가 낸 가위바위보는?
			String computer = arr[num];	
			//사용자가 낸 가위바위보는?
			String user = input;
			
			//메시지 검사
			input = checkInputData(input, arr);
			
			if (input.equals("오류")){
				System.out.println("제대로 적으십시오 휴먼 ㅡㅡ");
				count++;
			}
				
			for(int i1 = 0; i1 < arr.length; i1++) {
				if (user.equals(arr[i1])) {
					for(int i2 = 0; i2 < arr2.length; i2++) {
						if(computer.equals(arr2[i2])) {
							System.out.println("졌습니다");
							count++;
							break;
						}else if(computer.equals(user)) {
							System.out.println("비겼습니다");
							break;
						}else {
							System.out.println("이겼습니다");
							break;
						}
					}
				}
			}
			
			if(count == 3) {
				System.out.println("3번 지셨습니다");
				System.out.println("게임 종료");
				break;
			}
		}
	}
}






