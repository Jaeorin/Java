package study_190220Mk3;

// 인터페이스의 특징
// (1)추상함수(메서드)를 가진다
// (2) new로 객체 생성이 불가능하다
// (3) 구현하는 쪽에서 무조건 함수를 오버라이딩 해야한다
public interface Lamun {
	// 변수 앞에 public static final이 생략됨
	// 몸체({})가 없다
	// final이 붙으면 이후로 해당 변수를 수정할 수 없다
	// final로 만든 변수는 전부 대문자로 표기하는 암묵적 규칙이 있다
	void printName();
	// void 앞에 public abstract가 생략됨
	
}
