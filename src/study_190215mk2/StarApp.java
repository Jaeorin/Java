package study_190215mk2;

public class StarApp {
	
	//화면에 출력
	//아래 두개 함수명이 같음에도 오류가 나지 않는것은 괄호 안의 매개변수(인자를) 다르게 함으로써 자바에서 제공하는 메소드 오버로딩이 시행되기 때문이다
	public static void printUnit(Zealot z1) {
		System.out.println(z1.name);
		System.out.println("생명력 : " + z1.st);
		System.out.println("보호막 : " + z1.sh);
		System.out.println("공격력 : " + z1.attack);
		System.out.println("방어력 : " + z1.armor);
	}
	
	public static void printUnit(Dragoon d1) {
		System.out.println(d1.name);
		System.out.println("생명력 : " + d1.st);
		System.out.println("보호막 : " + d1.sh);
		System.out.println("공격력 : " + d1.attack);
		System.out.println("방어력 : " + d1.armor);
	}
	
	//매개변수 2개, (공격자, 피격자)
	public static void attack(Zealot z1, Dragoon d1) {

		d1.sh = d1.sh - (z1.attack - d1.armor);
		if(d1.sh <= 0) {
			d1.st = d1.st + d1.sh;
			d1.sh = 0;
			if(d1.st <= 0) {
				d1.sh = 0;
				d1.st = 0;
				System.out.println("질럿이 드라군을 공격하였다");
				System.out.println("드라군의 현재 보호막 : " + d1.sh);
				System.out.println("드라군의 현재 생명력 : " + d1.st);
				System.out.println();
				System.out.println("질럿이 드라군을 처치하였다!");
			}
		}
		
		if(d1.st > 0) {
			System.out.println();
			System.out.println("질럿이 드라군을 공격하였다");
			System.out.println("드라군의 현재 보호막 : " + d1.sh);
			System.out.println("드라군의 현재 생명력 : " + d1.st);
		}
		

	}
	
	public static void attack(Dragoon d1, Zealot z1) {
		z1.sh = z1.sh - (d1.attack - z1.armor);
		System.out.println("드라군이 질럿을 공격하였다");
		System.out.println("질럿의 현재 보호막 : " + z1.sh);
	}

	public static void main(String[] args) {
		//질럿 생성
		//기본적으로 생성자가 생략되어 있다
		Gateway gate1 = new Gateway();

		System.out.println();
		Zealot z1 = gate1.makeZealot();
		printUnit(z1);

		System.out.println();
		Zealot z2 = gate1.makeZealot();
		printUnit(z2);
		
		System.out.println();
		Dragoon d1 = gate1.makeDragoon();
		printUnit(d1);

		//질럿 1이 드라군 1을 공격
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		System.out.println();
		attack(z1, d1);
		
		System.out.println();
		attack(d1, z1);


	}
	


}
