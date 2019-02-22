package report_190221;

public interface StarCraft {

	String type();
	int attack();
	int armor();
	String name();
	String range();
	String repair();
	int health();
	int shield();
	int sethealth(int health);
	int setshield(int shield);
	void combat(StarCraft unit);

}
