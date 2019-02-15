package study_181219;

public class RemoconApp {

	// if 매개변수
	static void remotePower(int ch) {

		if(ch==1) {
			System.out.println("TV ON");

		}else {
			System.out.println("TV OFF");

		}

	}

	public static void main(String[] args) {

		remotePower(1);
		remotePower(0);

	}

}

