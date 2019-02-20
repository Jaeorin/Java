package study_190220Mk2;

public class StartApp {
	
	static void play(Animal a) {
		a.name = "¸ù°í¸Þ¸®";
		System.out.println(a.name);
		a.sound();
	}
	
	public static void main(String[] args) {

		Bird b = new Bird();
		play(b);
		
		Dog d = new Dog();
		play(d);
		
		Fish f = new Fish();
		play(f);

	}

}
