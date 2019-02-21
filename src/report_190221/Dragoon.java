package report_190221;

public class Dragoon extends ProtossUnit{
	
	String name = "Dragoon";
	String Range = "Range";
	int health = 100;
	int shield = 80;

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
