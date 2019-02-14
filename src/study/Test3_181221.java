package study;

public class Test3_181221 {

	public static void main(String[] args) {

		int a[] = { 32, 11, 12, 18, 36 };

		for (int i = 0; i < a.length; i++) { // '배열'.length : 배열의 수   ex) a.length = 5
			System.out.print(a[i] + "  ");
		}

		// 3과 4의 공배수를 구하시오.
		System.out.println();
		System.out.println(a[0]); // 배열은 첫번째부터 0~ 으로 호출한다
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		for (int i = 0; i < 5; i++) {

			int n1 = a[i] % 3;

			int n2 = a[i] % 4;

			int sum = n1 + n2;

			System.out.println(i + "번쨰 loop");
			System.out.println("sum : " + sum);

			if (sum == 0) {
				System.out.println(a[i] + "는 3과 4의 공배수");
			}

			else {
				System.out.println(a[i] + "는 3과 4의 공배수가 아님");
			}

		}

		// int b[]; : 선언
		// int c[] = { 1, 2, 3, }; : 초기화
		
	}

}
