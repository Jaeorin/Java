package study_190311;

import java.io.FileInputStream;
import java.io.IOException;

public class FileEx01 {

	public static void main(String[] args) {

		try {
			FileInputStream input = new FileInputStream("D:/workspace/Java/src/study_190311/test.txt");
			System.out.println(input);
			byte[] b = new byte[3000];
			input.read(b);
			for (byte c : b) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
