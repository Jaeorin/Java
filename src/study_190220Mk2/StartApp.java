package study_190220Mk2;

public class StartApp {
	
	static void play(Animal a) {
		a.getName();
		a.sound();
		System.out.println();
	}
	
	public static void main(String[] args) {

		Bird b = new Bird();
		b.name = "����޸�";
		play(b);
		
		Dog d = new Dog();
		d.name = "����";
		play(d);
		
		Fish f = new Fish();
		f.name = "����";
		play(f);
		
		Cat c = new Cat();
		c.name = "������";
		play(c);
		
		Snake s = new Snake();
		s.name = "������׶�";
		play(s);

	}

}
