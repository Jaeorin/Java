package report_190221;

public class Hydralisk extends ZergUnit{
	
	static int attack = 10;
	static int armor = 0;	
	String name = "Hydralisk";
	String range = "Range";
	int health = 80;
	int shield = 0;

	@Override
	public int attack() {
		return attack;
	}
	@Override
	public int armor() {
		return armor;
	}
	@Override
	public String name() {
		return name;
	}
	@Override
	public String range() {
		return range;
	}
	@Override
	public int health() {
		return health;
	}
	@Override
	public int shield() {
		return shield;
	}
	@Override
	public int sethealth(int health) {
		this.health = health;
		return health;
	}
	@Override
	public int setshield(int shield) {
		this.shield = shield;
		return shield;
	}
	public void combat(StarCraft unit) {
		if (this.health <= 0) {
			System.out.println("Not a valid command : Attacker " + this.name() + " is already Dead");
			System.out.println();	
		}else if (unit.health() <= 0){
			System.out.println("Not a valid command : Target " + unit.name() + " is already Dead");
			System.out.println();
		}else if (this == unit) {
			System.out.println("Not a valid command : Attacker and Target is same");
			System.out.println();	
		}else if (this.type() == unit.type()) {
			System.out.println("Not a valid command : Attacker and Target are same race");
			System.out.println();
		}else {
			System.out.println("The " + this.name() + " attacked the " + unit.name());
			System.out.println();
			unit.setshield(unit.shield() - attack);
			if (unit.shield() >= 0) {
				System.out.println("Target        : " + unit.type() + " " + unit.name());
				System.out.println("Shield        : " + unit.shield());
				System.out.println("Health        : " + unit.health());
				System.out.println();
			}else if(unit.shield() < 0) {
				int excessiveDamage = unit.shield();
				unit.sethealth(unit.health() + excessiveDamage + unit.armor());
				unit.setshield(0);
				if (unit.health() > 0) {
					System.out.println("Target        : " + unit.type() + " " + unit.name());
					System.out.println("Shield        : " + unit.shield());
					System.out.println("Health        : " + unit.health());
					System.out.println();
				}else {
					unit.sethealth(0);
					System.out.println("Target        : " + unit.type() + " " + unit.name());
					System.out.println("Shield        : " + unit.shield());
					System.out.println("Health        : " + unit.health());
					System.out.println("Target " + unit.name() + " is Terminated successfully");
					System.out.println();
					
				}
			}
		}
	}
	
}
