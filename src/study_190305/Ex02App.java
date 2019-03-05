package study_190305;

interface Animal {
	void Sound(); // �տ�  public abstract�� �����Ǿ� ����
}

class Dog implements Animal {
	@Override
	public void Sound() { //�������̽����� �޴� �Լ��� public�Ӽ��� �ֱ� ������ public�� �ٿ��ش�
		System.out.println("�۸�");
		//super.Sound(); //this�� �ڽ�, super�� ����ϴ� ���(�θ�)�� ����Ŵ
	}
}

class Bird implements Animal {
	@Override
	public void Sound() {
		System.out.println("±±");
	}
}

class Cat implements Animal {
	@Override
	public void Sound() {
		System.out.println("�߿�");
	}
}

public class Ex02App {
	
	public static void play(Animal animal) {
		animal.Sound();
	}

	public static void main(String[] args) {
		Animal dog = new Dog(); // Dog, Animal �޸𸮿� ���� , Animal �ֽ�
		play(dog);
		
		Animal bird = new Bird();
		play(bird);
		
		Animal cat = new Cat();
		play(cat);
	}

}
