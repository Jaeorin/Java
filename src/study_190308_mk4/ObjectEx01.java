package study_190308_mk4;

class Animal {
	
	@Override
	public String toString() {
		return "Animal 객체입니다.";
	}
}

public class ObjectEx01 {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		// 모든 클래스는 본인을 호출 시 기본적으로 toString이 적용되어 나온다
		System.out.println(a);
		System.out.println(a.toString());

		StringBuilder sb = new StringBuilder();
		sb.append("안녕");
		String hello = sb.toString();
		System.out.println(hello);
		
		// 숫자에 문자를 더하면 문자가 됨(묵시적 형변환)
		int num = 1;
		String num2 = num + "";
		
		// 문자를 Integer.parseInt() 함수를 이용해 숫자로 변환가능(명시적 형변환)
		String data = "10";
		int data2 = Integer.parseInt(data);
		
		System.out.println(num2 + data2);
		
		String name1 = "물";
		String name2 = "물";
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
	}
}
