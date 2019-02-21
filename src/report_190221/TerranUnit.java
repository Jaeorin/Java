package report_190221;

public abstract class TerranUnit implements StarCraft{
	
	public static int attack = 20;
	public static int armor = 1;
	
	public void status() {
		System.out.println("attack :" + attack);
		System.out.println("armor  :" + armor);
	}
	
	public void repair() {
		System.out.println("Manually Repair with SCV");		
	}
	
	public static void upgradeAttack() {
		attack = attack + 2;
		System.out.println("Terran Waepon Upgrade Complete");	
		System.out.println();
	}
	
	public static void upgradeArmor() {
		armor = armor + 1;
		System.out.println("Terran Armor Upgrade Complete");	
		System.out.println();
	}

	public abstract void health();
	
}
