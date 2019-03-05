package study_190305;

interface Animal {
	void Sound(); // 앞에  public abstract가 생략되어 있음
}

class Dog implements Animal {
	@Override
	public void Sound() { //인터페이스에서 받는 함수에 public속성이 있기 때문에 public을 붙여준다
		System.out.println("멍멍");
		//super.Sound(); //this는 자신, super는 상속하는 대상(부모)를 가리킴
	}
}

class Bird implements Animal {
	@Override
	public void Sound() {
		System.out.println("짹짹");
	}
}

class Cat implements Animal {
	@Override
	public void Sound() {
		System.out.println("야옹");
	}
}

public class Ex02App {
	
	public static void play(Animal animal) {
		animal.Sound();
	}

	public static void main(String[] args) {
		Animal dog = new Dog(); // Dog, Animal 메모리에 저장 , Animal 주시
		play(dog);
		
		Animal bird = new Bird();
		play(bird);
		
		Animal cat = new Cat();
		play(cat);
	}

}
