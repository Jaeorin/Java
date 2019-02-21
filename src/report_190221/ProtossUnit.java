package report_190221;

public abstract class ProtossUnit implements StarCraft{
	
	static int attack = 30;
	static int armor = 2;
	
	public void status() {
		System.out.println("attack :" + attack);
		System.out.println("armor  :" + armor);
	}
	
	public void repair() {
		System.out.println("Shield Recovory Only");		
	}
	
	public static void upgradeAttack() {
		attack = attack + 3;
		System.out.println("Protoss Waepon Upgrade Complete");	
		System.out.println();
	}
	
	public static void upgradeArmor() {
		armor = armor + 1;
		System.out.println("Protoss Armor Upgrade Complete");	
		System.out.println();
	}
	
	
}
