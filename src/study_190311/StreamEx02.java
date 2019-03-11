package study_190311;

import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx02 {

	public static void main(String[] args) {
		
		// InputStreamReader : 아스키코드를 자동으로 문자화 시켜준다
		InputStreamReader reader = new InputStreamReader(System.in);
		
		char[] inData = new char[3];
		
		try {
			reader.read(inData);
			System.out.println(inData);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
