package study;

public class Street1_181218 {
	
	public static void main(String[] args) {


		// while : 반복, ()괄호 사이에 true, false 값으로 반복여부 지정
		int num = 3; // 변수 지정

		while(num < 101) { // 괄호 안의 값이 true일 경우 반복(15~21)
			System.out.println(num); // 변수 출력
			num = num + 3; // 변수에 +3
		}


		// 자동차가 목적지까지 도착하는 시간 계산
		int destination = 11271; // 거리
		int speed = 3; // 속도
		int sec = destination/speed; // 초(초속) 설정
		int min = sec/60; // 분 설정 (1분 = 60초)
		sec = sec%60; // 위에 초 설정 후 초 값을 거리를 60으로 나눈 뒤 남은 값으로 재설정
		int hour = min/60; // 시간 설정 (1시간 = 60분)
		min = min%60; // 위에 분 설정 후 분 값을 거리를 60으로 나눈 뒤 남은 값으로 재설정
		System.out.println(sec + "초");
		System.out.println(min + "분");
		System.out.println(hour + "시간");
		System.out.println(hour + "시간 " + min + "분 " + sec + "초"); // 설정한 값 출력

	}

}
