package study_190221;

public class Gateway {

	public static void makeUnit(ProtossUnit ProtossUnit) {
		ProtossUnit.getProductSound();
		ProtossUnit.getName();
		ProtossUnit.getShield();
		ProtossUnit.getHealth();
		ProtossUnit.getAttack();
		ProtossUnit.getArmor();
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Zealot z1 = new Zealot();
		makeUnit(z1);
		
		Dragoon d1 = new Dragoon();
		makeUnit(d1);
	
		DarkTempler dk1 = new DarkTempler();
		makeUnit(dk1);


	}

}
