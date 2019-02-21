package report_190220;

class Card{

	String kind;      	    	//카드의 무늬 - 객체변수
	int number;			//카드의 숫자 - 객체변수
	static int width = 100;     //카드의 너비 - 클래스변수
	static int height = 250;    //카드의 높이 - 클래스변수

}

public class GlobalLocalVariable {

	public static void main(String[] args){

		System.out.println("Card의 너비는 :"+ Card.width);
		System.out.println("Card의 높이는 :"+ Card.height);
		//이렇게 클래스 변수는 객체화를 시키지 않아도
		//'클래스명.변수명'으로 직접사용이 가능하다.

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		//kind와 number는 객체변수이므로 Card클래스를 객체화
		//시켜야지만 '클래스명.변수명'으로 사용이 가능하다.

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		//객체변수는 객체화를 시킬때마다 서로 다른 저장공간을 가지게된다.

		System.out.println("c1카드는"+c1.kind+" "+c1.number+"번이며," +
			           " 크기는 ("+c1.width +"," + c1.height+")이다.");
		System.out.println("c2카드는"+c2.kind+" "+c2.number+"번이며," +
	           	   	   " 크기는 ("+c2.width +"," + c2.height+")이다.");
		//위 print구문을 출력하면
		//c1카드는 Heart 7번이며, 크기는(100,250)이다.
		//c2카드는 Spard 4번이며, 크기는(100,250)이다.
		//로 출력된다.

		c1.width = 200;
		c1.height = 300;
		//c1의 width와 height를 각각 200과 300으로 초기화 시켰다.

		System.out.println("c1카드는"+c1.kind+" "+c1.number+"번이며," +
				" 크기는 ("+c1.width +"," + c1.height+")이다.");
		System.out.println("c2카드는"+c2.kind+" "+c2.number+"번이며," +
				" 크기는 ("+c2.width +"," + c2.height+")이다.");

		//c1의 width와 height를 변경했기때문에 위 프린트 구문에서
		//c1의 높이와 너비만 바뀔거 같지만 실제로 출력하면
		//c1카드는 Heart 7번이며, 크기는(200,300)이다.
		//c2카드는 Spard 4번이며, 크기는(200,300)이다.
		//처럼 c2의 높이와 너비도 변경된다. 

	}

}