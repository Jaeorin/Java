package study;

public class Money_181219 {

	public static void main(String[] args) {

		// 동전 갯수 구하기
		// 500원, 100원, 50원, 10원,
		int money = 95630; // int 4바이트, 정수
		int restMoney = money; // call by value
		// 또는 int rest_money = money; 사용, 메모장 커멜표기법 참조
		int count;
		
		count = restMoney/500; // count는 restMoney를 500으로 나눈 값이다
		System.out.println("500원 : " + count); // 필요한 500원의 갯수를 출력한다
		restMoney = restMoney - (500 * count); // restMoney의 값을 money에서 500원으로 빠진 값으로 변경한다, 2680원(원래 restMoney값) - 2500원 (500*count(5개)) = 180원
		System.out.println("남은 금액 : " + restMoney); // 남은 금액을 출력한다
		
		count = restMoney/100;
		System.out.println("100원 : " + count);
		restMoney = restMoney - (100 * count);
		System.out.println("남은 금액 : " + restMoney);
		
		count = restMoney/50;
		System.out.println("50원 : " + count);
		restMoney = restMoney - (50 * count);
		System.out.println("남은 금액 : " + restMoney);
		
		count = restMoney/10;
		System.out.println("10원 : " + count);
		restMoney = restMoney - (10 * count);
		System.out.println("남은 금액 : " + restMoney);

	}

}

