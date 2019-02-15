package study_181218;

import java.util.Scanner;

public class Street2 {

	public static void main(String[] args) {

		//예제
		Scanner in = new Scanner(System.in);
		System.out.println("총거리를 입력하세요."); // 총거리 입력문 출력
		int destination = in.nextInt(); // 총거리
		System.out.println("초당 속도를 입력하세요."); // 속도 입력문 출력
		int speed = in.nextInt(); // 초당 속도
		int sec = destination/speed; // 전체 초
		int r_sec = sec%60; // 남은 초
		int min = sec/60; // 전체 분
		int r_min = min%60; // 남은 분
		int hour = min/60; // 전체 시간
		
		System.out.println(hour + "시간 " + r_min + "분 " + r_sec + "초");
		
		in.close();

	}

}
