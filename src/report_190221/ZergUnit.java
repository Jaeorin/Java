package report_190221;

public abstract class ZergUnit implements StarCraft {

	String repair = "Auto Recovory";
	String type = "Zerg";
	
	@Override
	public String type() {
		return type;
	}	
	@Override
	public String repair() {
		return repair;		
	}
	
	public static void upgradeAttack() {
		Hydralisk.attack = Hydralisk.attack + 1;
		Ultralisk.attack = Ultralisk.attack + 3;
		System.out.println("Zerg Waepon Upgrade Complete");	
		System.out.println();
	}
	
	public static void upgradeArmor() {
		Hydralisk.armor = Hydralisk.armor + 1;
		Ultralisk.armor = Ultralisk.armor + 1;
		System.out.println("Zerg Armor Upgrade Complete");	
		System.out.println();
	}
	
}
