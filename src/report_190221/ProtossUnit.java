package report_190221;

public abstract class ProtossUnit implements StarCraft{
	
	String repair = "Shield Recovory Only";
	String type = "Protoss";
	
	@Override
	public String type() {
		return type;
	}	
	@Override
	public String repair() {
		return repair;		
	}
	
	public static void upgradeAttack() {
		Zealot.attack = Zealot.attack + 2;
		Dragoon.attack = Dragoon.attack + 2;
		System.out.println("Protoss Waepon Upgrade Complete");	
		System.out.println();
	}
	
	public static void upgradeArmor() {
		Zealot.armor = Zealot.armor + 1;
		Dragoon.armor = Dragoon.armor + 1;
		System.out.println("Protoss Armor Upgrade Complete");	
		System.out.println();
	}
		
}
