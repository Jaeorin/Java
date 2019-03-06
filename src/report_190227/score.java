package report_190227;

class Score{
	
	static int strike = 0;
	static int ball = 0;
	static int out = 0;
	static int position[] = new int[4];
	static int myScore = 0;
	static int opponentScore = 0;
	static boolean pitcherCheck = true;
	static boolean change = true;
	static int playerNumber = 0;
	static String base;
	
	public static int strike() {
		strike ++;
		System.out.println("Strike(" + strike + ") ball(" + ball + ") out(" + out + ")");
		if(strike == 3) {
			out++;
			strike = 0;
			ball = 0;
			System.out.println(out + " out!!");
			change = true;
		}
		return strike;
	}
	
	public static int ball() {
		ball ++;
		System.out.println("Strike(" + strike + ") ball(" + ball + ") out(" + out + ")");
		if(ball == 4) {
			Score.position();
			ball = 0;
			change = true;
		}
		return ball;
	}
	
	public static int out() {
		out++;
		strike = 0;
		ball = 0;
		System.out.println("Strike(" + strike + ") ball(" + ball + ") out(" + out + ")");
		change = true;
		return out;
	}
	
	public static int[] position() {
		position[3] = position[2];
		position[2] = position[1];
		position[1] = position[0];
		position[0] = 1;
		strike = 0;
		ball = 0;
		
		for(int i = 0; i< 3; i++) {
			if(position[i] == 1) {
				base = "on";
			}else {
				base = "¡¡";
			}
			System.out.println((i + 1) + " base :  " + base);
		}
			
		if(position[3] == 1) {
			if(pitcherCheck == true) {
				myScore++;
				System.out.println("Your team : " + myScore + " vs " + "Opponent team : " + opponentScore);
			}else {
				opponentScore++;
				System.out.println("Your team : " + myScore + " vs " + "Opponent team : " + opponentScore);
			}
		}
		return position;
	}
	
	public static int[] homRun() {
		if(pitcherCheck == true) {
			for(int i = 0; i < 3; i++) {
				myScore = myScore + position[i];
			}
			for(int i = 0; i < 3; i++) {
				position[i] = 0;
			}
			myScore++;
			strike = 0;
			ball = 0;
			System.out.println("Your team : " + myScore + " vs " + "Opponent team : " + opponentScore);
			change = true;
		}else {
			for(int i = 0; i < 3; i++) {
				opponentScore = opponentScore + position[i];
			}
			for(int i = 0; i < 3; i++) {
				position[i] = 0;
			}
			opponentScore++;
			strike = 0;
			ball = 0;
			System.out.println("Your team : " + myScore + " vs " + "Opponent team : " + opponentScore);
		}
		return position;
	}
}