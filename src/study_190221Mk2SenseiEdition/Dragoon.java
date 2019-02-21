package study_190221Mk2SenseiEdition;

public class Dragoon extends ProtossUnit {
	
	public Dragoon() {
		System.out.println("I had returned");
	}
	
	String name = "드라군";
	int st = 100;
	int sh = 80;
	
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
