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
		
	public static void combat(StarCraft unit1, StarCraft unit2) {
		if (unit1.health() <= 0) {
			System.out.println("Not a valid command : Attacker " + unit1.name() + " is already Dead");
			System.out.println();	
		}else if (unit2.health() <= 0){
			System.out.println("Not a valid command : Target " + unit2.name() + " is already Dead");
			System.out.println();
		}else if (unit1 == unit2) {
			System.out.println("Not a valid command : Attacker and Target is same");
			System.out.println();	
		}else if (unit1.type() == unit2.type()) {
			System.out.println("Not a valid command : Attacker and Target are same race");
			System.out.println();
		}else {
			System.out.println("The " + unit1.name() + " attacked the " + unit2.name());
			System.out.println();
			unit2.setshield(unit2.shield() - unit1.attack());
			if (unit2.shield() >= 0) {
				System.out.println("Target        : " + unit2.type() + " " + unit2.name());
				System.out.println("Shield        : " + unit2.shield());
				System.out.println("Health        : " + unit2.health());
				System.out.println();
			}else if(unit2.shield() < 0) {
				int excessiveDamage = unit2.shield();
				unit2.sethealth(unit2.health() + excessiveDamage + unit2.armor());
				unit2.setshield(0);
				if (unit2.health() > 0) {
					System.out.println("Target        : " + unit2.type() + " " + unit2.name());
					System.out.println("Shield        : " + unit2.shield());
					System.out.println("Health        : " + unit2.health());
					System.out.println();
				}else {
					unit2.sethealth(0);
					System.out.println("Target        : " + unit2.type() + " " + unit2.name());
					System.out.println("Shield        : " + unit2.shield());
					System.out.println("Health        : " + unit2.health());
					System.out.println("Target " + unit2.name() + " is Terminated successfully");
					System.out.println();
					
				}
			}
		}
	}

}
