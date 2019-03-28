package study_190328;

public class DBTest {

	public static void main(String args[]) {
		booklistScanner booklistscanner = new booklistScanner();
		name name = new name();
		booklistscanner.sqlRun();
		name.sqlRun();
	}

}
