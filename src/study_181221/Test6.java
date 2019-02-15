package study_181221;

public class Test6 {

	public static void main(String[] args) {

		int a[] = { 11, 8, 7, 4, 2 };

		for (int x = 0; x < a.length - 1; x++) {

			for (int y = 0; y < a.length - 1; y++) {

				if (a[y] > a[y + 1]) {

					int b;
					b = a[y + 1];
					a[y + 1] = a[y];
					a[y] = b;

				}

				// System.out.print(a[y] + " ");

			}

			// System.out.print(a[a.length - 1] + "  ");
			// System.out.println();

		}

		for (int z = 0; z < a.length; z++) {

			System.out.print(a[z] + " ");

		}

	}

}
