package report_190227;

public class mainApp2 {

	public static void main(String[] args) {
	
		String s = "prasad";
		String s2 = "prasad";
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(s.equals(s2));
		System.out.println(s == s2);
	}
}