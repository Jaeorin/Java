package report_190221;

public class Hydralisk extends ZergUnit{
	
	String name = "Hydralisk";
	String Range = "Range";
	int health = 80;

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
