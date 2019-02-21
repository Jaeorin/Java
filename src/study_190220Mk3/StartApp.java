package study_190220Mk3;

public class StartApp {
	
	static void makeLamun(Lamun a) {
		a.printName();
		System.out.println();
	}
	
	public static void main(String[] args) {

		Samyang samyang = new Samyang();
		samyang.name = "삼양라면";
		makeLamun(samyang);
		
		Sin sin = new Sin();
		sin.name = "신라면";
		makeLamun(sin);
		
		Jin jin = new Jin();
		jin.name = "진라면";
		makeLamun(jin);
		
	}

}
