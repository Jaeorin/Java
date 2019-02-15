package study_181221;

public class Test1 {

	public static void main(String[] args) {

		int password = 1032032000;

		int check = 0;

		while (true) {

			if (password == check) {

				break;

			}

			check++;

		}

		System.out.println("비밀번호는" + check);

	}

}
