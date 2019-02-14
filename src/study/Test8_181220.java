package study;

public class Test8_181220 {

	public static void main(String[] args) {

		System.out.println("1.");

		for (int a = 0; a < 4; a++) {
			System.out.print("*");

		}

		System.out.println();

		System.out.println("2.");

		for (int b = 0; b < 4; b++) {
			for (int c = 0; c < 4; c++) {
				System.out.print("*");

			}

			System.out.println();

		}

		System.out.println("3.");

		for (int d = 1; d < 5; d++) {
			for (int e = 0; e < d; e++) {
				System.out.print("*");

			}

			System.out.println();

		}

		System.out.println("4.");

		for (int d = 1; d < 4; d++) {
			for (int e = 3; e > d; e--) {
				System.out.print("  ");
			}
			for (int e = 1; e < d; e++) {
				System.out.print("*");
			}
			for (int e = 0; e < d; e++) {
				System.out.print("*");
			}

			System.out.println();

		}

		System.out.println("5.");

		for (int a = 1; a < 6; a++) {
			if (a < 4) {
				for (int x = 3; x > a; x--) {
					System.out.print("  ");
				}
				for (int x = 1; x < a; x++) {
					System.out.print("*");
				}
				for (int x = 0; x < a; x++) {
					System.out.print("*");
				}

			}

			else {
				for (int x = 3; x < a; x++) {
					System.out.print("  ");
				}
				for (int x = 5; x > a; x--) {
					System.out.print("*");
				}
				for (int x = 6; x > a; x--) {
					System.out.print("*");
				}

			}

			System.out.println();

		}

	}

}
