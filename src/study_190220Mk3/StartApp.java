package study_190220Mk3;

public class StartApp {
	
	static void makeLamun(Lamun lamun) {
		lamun.printName();
		System.out.println();
	}
	
	public static void main(String[] args) {

		Samyang samyang = new Samyang("삼양라면");
		makeLamun(samyang);
		
		Sin sin = new Sin("신라면");
		makeLamun(sin);
		
		Jin jin = new Jin("진라면");
		makeLamun(jin);
		
	}

}
