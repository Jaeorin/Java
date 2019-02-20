package study_190220Mk2;

public class StartApp {
	
	static void play(Animal a) {
		a.getName();
		a.sound();
		System.out.println();
	}
	
	public static void main(String[] args) {

		Bird b = new Bird();
		b.name = "몽고메리";
		play(b);
		
		Dog d = new Dog();
		d.name = "토토";
		play(d);
		
		Fish f = new Fish();
		f.name = "참돔";
		play(f);
		
		Cat c = new Cat();
		c.name = "여름이";
		play(c);
		
		Snake s = new Snake();
		s.name = "도스쟈그라스";
		play(s);

	}

}
