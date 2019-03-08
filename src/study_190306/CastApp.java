package study_190306;

class Zigu {
	void zigu_play() {
		System.out.println("나는 지구");
	}
}

class Asia extends Zigu {
	void asia_play() {
		System.out.println("나는 아시아");
	}
}

class Korea extends Asia {
}

class Busan extends Korea {
}

class Kangin extends Busan {
}

public class CastApp {
	public static void main(String[] args) {
		Busan b = new Busan();
		Zigu z = (Zigu) b;
		Asia a = (Asia) b;
		Korea k = (Korea) b;
		
		b.zigu_play();
		b.asia_play();
		
		z.zigu_play();
		
		a.asia_play();
		a.zigu_play();
		
		k.asia_play();
		k.zigu_play();
		
		Zigu z1 = (Zigu) k;
		System.out.println(z1);
		
	}
}

