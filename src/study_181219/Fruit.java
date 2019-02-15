package study_181219;

public class Fruit {

	// 지역변수
	static void cal() {
		
		int sum = 0;
		sum = sum + 10;
		System.out.println("합은 : " + sum);

		
	}

	// 다른 클래스와 지역변수 호출
	public static void main(String[] args) {

		cal();

		Apple ap = new Apple(); // new : 다른 클래스를 호출,  Apple(); : 생성자, 초기화 하는 역할
		System.out.println(ap.name);
		System.out.println(ap.color);
		System.out.println(ap.seoson);
		System.out.println(ap.shape);
		System.out.println(ap.price);

		cal(); // 지역변수를 호출

	}

}

