package report_190220;

class LocalValue {
	
	int Local1() {
		int test = 3; // 지역변수
		System.out.println(test);
		return test; // 지역변수에서 생성된 값을 호출한 위치로 반환하고자 할 때 사용
	}
	
	int Local2(int a, int b) {
		int test; 
		test = a + b;
		System.out.println(test);
		return test;
	}
	
	void voidtest(int a) {
		if(a >= 5){
			System.out.println(a + "이(가) 5보다 크거나 같다");
			return;
		}
		System.out.println(a + "이(가) 5보다 작다");
	}
	
}

class Globaltest{

	static int width = 300;		// 클래스 전역변수
	static int height = 200;	// 클래스 전역변수
	String rating;				// 객체 전역변수
	int number;					// 객체 전역변수
	
}

public class Hanwoo {

	public static void main(String[] args){
		

		LocalValue Localtest = new LocalValue();
		Localtest.voidtest(2);	
		Localtest.voidtest(6);
		int value1 = Localtest.Local1();
		int value2 = Localtest.Local2(1,  2);
		
		System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
		
		
		
		
		System.out.println("상품 포장용기의 넓비 :" + Globaltest.width);
		System.out.println("상품 포장용기의 높이 :" + Globaltest.height);
		// 클래스 전역변수는 별도의 객체생성 없이도 다른 클래스에서 사용 가능
		
		Globaltest hanwoo1 = new Globaltest();
		hanwoo1.rating = "1++";
		hanwoo1.number = 5;
		// 객체 전역변수는 기본적으로 본인의 클래스에서만 사용 가능
		// 다른 클래스에서 실행시키고자 할 경우 해당 클래스를 객체로 받아와야 사용 가능

		Globaltest hanwoo2 = new Globaltest();
		hanwoo2.rating = "1+ ";
		hanwoo2.number = 8;
		// 객체 전역변수는 각 객체 자신들만의 값을 가짐
		
		System.out.println("한우 1번 상품은 " + hanwoo1.rating + "등급에 " + hanwoo1.number
				+ "조각이며 크기는 가로 " + Globaltest.width + "cm, 세로는 " + Globaltest.height + "cm이다");
		
		System.out.println("한우 2번 상품은 " + hanwoo2.rating + "등급에 " + hanwoo2.number
				+ "조각이며 크기는 가로 " + Globaltest.width + "cm, 세로는 " + Globaltest.height + "cm이다");
		
	}
	
}