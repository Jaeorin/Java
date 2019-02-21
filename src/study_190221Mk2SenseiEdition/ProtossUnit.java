package study_190221Mk2SenseiEdition;

//클래스인데 추상 메서드를 가짐.
//일반 메서드도 가질 수 있음.
abstract class ProtossUnit {
	
	static int attack = 10;
	static int armor = 1;
	
	abstract void getName();
	abstract void getSh();
	abstract void getSt();
	
	public static void upgradeAttack() {
		attack = attack +1 ;
	}
	
	public static void upgradeArmor() {
		armor = armor + 1;
	}
	
//	public void ordering() {
//		getSh();
//		getName();
//		getSt();
//	}
}
