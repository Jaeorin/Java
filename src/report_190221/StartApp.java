package report_190221;

public class StartApp {
	
	public static void productUnit(StarCraft unit) {

		unit.status();
		unit.getName();
		unit.range();
		unit.repair();
		unit.health();
		unit.shield();
		System.out.println();

	}
	
	public static void main(String[] args) {
		
		ProtossUnit.upgradeAttack();
		
		Zealot zealot1 = new Zealot();
		productUnit(zealot1);
		
		SCV scv1 = new SCV();
		productUnit(scv1);
		
		Hydralisk hydralisk1 = new Hydralisk();
		productUnit(hydralisk1);
		
	}
	
}
