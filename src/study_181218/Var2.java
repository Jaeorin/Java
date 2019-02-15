package study_181218;

public class Var2 {
	public static void main(String[] args) {
		int num = 20;
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
		
		String name = "홍길동";
		System.out.println(name+"님에게 1000원을 입금하였습니다.");
		System.out.println(name+"님이 1000원을 입금받았습니다.");
		
		//묵시적 형변환 : 각기 다른 타입을 결합할 때 크기가 큰 타입으로 자동변환
		int i = 1;
		System.out.println(i+10); //같은 타입간의 결합 연산자 사용
		System.out.println(i+"10"); //다른 타입같의 결합 연산자 사용
		System.out.println(i+9.5); //묵시적 형변환으로 int(4바이트)에서 double(8바이트)로 자동변환
		
		//연산자(+, -, /, *, %)
		System.out.println(6+4);
		System.out.println(6-4);
		System.out.println(6/4); //int 타입 사용으로 인해 결과값 1.5에서 소수점이 버려짐
		System.out.println(6/4.0); //double 타입 사용으로 인한 묵시적 형변환으로 소수점 값까지 출력
		System.out.println(6*4);
		System.out.println(6*4.0);
		System.out.println(6%3); //% : 값을 나눈 뒤 나머지 값을 표시
		
		//부등호를 이용한 boolean 타입(true, false) 변수 사용
		//System.out.println(1==1); //== : 앞뒤의 값이 같은지 여부
		System.out.println(1==2);
		System.out.println(1<99);
		System.out.println(1>99);
		System.out.println(1<=1); //<= : 좌측 값이 우측 값보다 작거나 같은지 여부
		System.out.println(1>=1); //>= : 위와 반대
		//System.out.println(1!=1); //!= : 앞이 뒤의 값과 다른지 여부
		System.out.println(1!=99);
		System.out.println(!true); //값 앞에 ! : 완전부정
		System.out.println(!false);

	}

}
