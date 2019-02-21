package study_190221Mk2SenseiEdition;

public class StarApp {

	//화면에 출력
	public static void printUnit(ProtossUnit p) {
		p.getName();
		p.getSt();
		p.getSh();
		System.out.println(ProtossUnit.attack);
		System.out.println(ProtossUnit.armor);
	}
	
//	//매개변수 2개, 하나는 공격자, 하나는 맞는놈
//	public static void attack(Zealot z1, Dragoon d1) {
//		d1.sh = d1.sh - (z1.attack - d1.armor);
//		System.out.println("질럿의 현재 쉴드 : "+d1.sh);
//	}
	
	//드라군1 -> 질럿1 을 때리는 함수 생성
	
	public static void main(String[] args) {
		
		//공격력 업그레이드
		ProtossUnit.upgradeAttack();
		
		//질럿 생성
		//기본적으로 생성자가 생략되어 있다.
		Gateway gate1 = new Gateway();
		Zealot z1 = gate1.makeZealot();
		printUnit(z1);
		
		System.out.println();
		Zealot z2 = gate1.makeZealot();
		printUnit(z2);
		
		System.out.println();
		Dragoon d1 = gate1.makeDragoon();
		printUnit(d1);
				
		System.out.println();
		Darktempler dk1 = gate1.makeDarktempler();
		printUnit(dk1);
		
		
		
	}

}
