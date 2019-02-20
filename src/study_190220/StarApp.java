package study_190220;

public class StarApp {

	//화면에 출력
	public static void printUnit(Zealot z1) {
		System.out.println(z1.name);
		System.out.println("공격력 :" + z1.attack);
		System.out.println("방어력 :" + z1.armor);
		System.out.println("체력 :" + z1.st);
		System.out.println("쉴드 :" + z1.sh);
		System.out.println();
	}
	
	public static void printUnit(Dragoon d1) {
		System.out.println(d1.name);
		System.out.println("공격력 :" + d1.attack);
		System.out.println("방어력 :" + d1.armor);
		System.out.println("체력 :" + d1.st);
		System.out.println("쉴드 :" + d1.sh);
		System.out.println();
	}
	
	public static void printUnit(DarkTempler dk1) {
		System.out.println(dk1.name);
		System.out.println("공격력 :" + dk1.attack);
		System.out.println("방어력 :" + dk1.armor);
		System.out.println("체력 :" + dk1.st);
		System.out.println("쉴드 :" + dk1.sh);
		System.out.println();
	}
	
	//매개변수 2개, 하나는 공격자, 하나는 맞는놈
	public static void attack(Zealot z1, Dragoon d1) {
		d1.sh = d1.sh - (z1.attack - d1.armor);
		System.out.println("질럿의 현재 쉴드 : "+d1.sh);
	}
	
	//드라군1 -> 질럿1 을 때리는 함수 생성
	
	public static void main(String[] args) {
		//질럿 생성
		//기본적으로 생성자가 생략되어 있다.
		Gateway gate1 = new Gateway();
		Zealot z1 = gate1.makeZealot();
		printUnit(z1);

		Zealot z2 = gate1.makeZealot();
		printUnit(z2);
		
		Dragoon d1 = gate1.makeDragoon();
		printUnit(d1); 
		
		DarkTempler dk1 = gate1.makeDarkTempler();
		printUnit(dk1); 

	}

}
