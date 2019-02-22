package report_190221;

public class Zealot extends ProtossUnit{
	
	static int attack = 16;
	static int armor = 1;
	String name = "Zealot";
	String range = "Meele";
	int health = 100;
	int shield = 60;

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
	@Override
	public void combat(StarCraft unit1, StarCraft unit2) {
		UserInterface.combat(unit1, unit2);
	}
	
}
