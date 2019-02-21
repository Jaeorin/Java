package report_190221;

public class Ultralisk extends ProtossUnit{
	
	String name = "Ultralisk";
	String Range = "Meele";
	int health = 400;
	
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
		
	}
	
}
