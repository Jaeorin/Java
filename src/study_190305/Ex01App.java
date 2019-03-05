package study_190305;

class Uncle {
	int money  = 1000000;
	int power  = 100;
	int height = 180;
}

class Father {
	int money  = 1000000000;
	int power  = 5;
	int height = 165;
}

//자바는 다중 상속을 지원하지 않는다
//변수는 바라보고 있는 대상의 값이 나온다
class Me extends Father {
	int height = 190;

}

public class Ex01App {
	public static void main(String[] args) {

		Father F = new Me(); //Me, Father 모두 메모리에 저장, Father를 주시함
		System.out.println("money  : " +  F.money);
		System.out.println("power  : " +  F.power);
		System.out.println("height : " + F.height);
		
		Me M = new Me(); //Me, Father 모두 메모리에 저장, Me를 주시함
		System.out.println("money  : " +  M.money);
		System.out.println("power  : " +  M.power);
		System.out.println("height : " + M.height);

	}

}
