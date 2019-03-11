package study_190311;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class FileEx02 {

	public static void main(String[] args) {
		
		//FileReader
//		try {
//			FileReader fr =
//				new FileReader("D:/workspace/Java/src/study_190311/test.txt");
//			System.out.println(fr);
//			char[] cbuf = new char[1000];
//			fr.read(cbuf);
//			for (char c : cbuf) {
//				System.out.print(c);
//			}
//		} catch (IOException e1) {
//			System.out.println("FileNotFound");
//			e1.printStackTrace();
//		}
		//BuffredReader
		try {
			BufferedReader br =
					new BufferedReader(new FileReader
								("D:/workspace/Java/src/study_190311/test.txt"));
			System.out.println(br);
			while(true) {
				String inData = br.readLine();
				if(inData == null) break;
					System.out.println(inData);
			}
			br.close();
			
		} catch (IOException e) {
			System.out.println("FileNotFound");
			e.printStackTrace();
		}
			
	}
	
}
