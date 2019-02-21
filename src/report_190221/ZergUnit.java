package report_190221;

public abstract class ZergUnit implements StarCraft {
	
	public static int attack = 10;
	public static int armor = 0;
	
	public void status() {
		System.out.println("attack :" + attack);
		System.out.println("armor  :" + armor);
	}
	
	public void repair() {
		System.out.println("Auto Recovory");		
	}
	
	public static void upgradeAttack() {
		attack = attack + 1;
		System.out.println("Zerg Waepon Upgrade Complete");	
		System.out.println();
	}
	
	public static void upgradeArmor() {
		armor = armor + 1;
		System.out.println("Zerg Armor Upgrade Complete");	
		System.out.println();
	}
	
	public abstract void health();
	
}
