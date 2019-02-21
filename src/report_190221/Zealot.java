package report_190221;

public class Zealot extends ProtossUnit{
	
	String name = "Zealot";
	String Range = "Meele";
	int health = 100;
	int shield = 60;

	@Override
	public void getName() {
		System.out.println(name);
		
	}

	@Override
	public void range() {
		System.out.println(Range);
		
	}

	@Override
	public void health() {

		System.out.println("health :" + health);
		
	}

	@Override
	public void shield() {
		System.out.println("shield :" + shield);
		
	}
	
}
