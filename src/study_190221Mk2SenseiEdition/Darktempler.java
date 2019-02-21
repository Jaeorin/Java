package study_190221Mk2SenseiEdition;

public class Darktempler extends ProtossUnit{
	
	//생성자 = Constructor = 초기화
	public Darktempler() {
		System.out.println("Adun Toridas");
	}
	
	String name = "다크템플러";
	int st = 80;
	int sh = 40;

	
	public void getName() {
		System.out.println(name);
	}
	public void getSh() {
		System.out.println("쉴드 :" + sh);
	}
	public void getSt() {
		System.out.println("체력 :" + st);
	}

}
