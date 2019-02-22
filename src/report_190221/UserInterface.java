package report_190221;

public class UserInterface {
	
	public static void productUnit(StarCraft unit) {
		unit.type();
		unit.name();
		unit.range();
		unit.health();
		unit.shield();
		unit.attack();
		unit.armor();
		unit.repair();
		System.out.println(unit.name() + " Product Complete");
		System.out.println();
	}
	
	public static void infomation(StarCraft unit) {
		System.out.println("Name          : " + unit.type() + " " + unit.name());
		System.out.println("Range         : " + unit.range());
		System.out.println("Shield        : " + unit.shield());
		System.out.println("Health        : " + unit.health());
		System.out.println("Attack        : " + unit.attack());
		System.out.println("Armor         : " + unit.armor());
		System.out.println("Recovory Type : " + unit.repair());
		System.out.println();
	}

}
