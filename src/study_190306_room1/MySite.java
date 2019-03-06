package study_190306_room1;

public class MySite {
	
	private String name = "MySite";
	
	//private : 해당 클래스에서만 접근 가능
	private void printName() {
		System.out.println(name);
	}
	
	//접근지정자 없음 : 해당 패키지에서만 접근 가능
	void call() {
		printName();
	}
}
