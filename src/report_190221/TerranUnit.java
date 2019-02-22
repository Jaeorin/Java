package report_190221;

public abstract class TerranUnit implements StarCraft{

	String repair = "Manually Repair with SCV";
	String type = "Terran";
	
	@Override
	public String type() {
		return type;
	}	
	@Override
	public String repair() {
		return repair;		
	}
	
	public static void upgradeAttack() {
		SCV.attack = SCV.attack + 0;
		SiegeTank.attack = SiegeTank.attack + 2;
		System.out.println("Terran Waepon Upgrade Complete");	
		System.out.println();
	}
	
	public static void upgradeArmor() {
		SCV.armor = SCV.armor + 1;
		SiegeTank.armor = SiegeTank.armor + 1;
		System.out.println("Terran Armor Upgrade Complete");	
		System.out.println();
	}
	
}
