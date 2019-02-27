package study_190227;

public class TestApp {

	public static void main(String[] args) {

		String a = "Text";
		String b = "Text";
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		System.out.println(a);
		System.out.println(b);
		
		a = "Text2";
		
		String c = new String("Text");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		System.out.println(b == c);
		System.out.println(b.equals(c));
	
	}

}
