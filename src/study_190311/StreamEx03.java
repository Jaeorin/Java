package study_190311;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx03 {

	public static void main(String[] args) {

		InputStreamReader reader = new InputStreamReader(System.in);
		
		// 8192Byte - 4096개의 문자를 한번에 받을 수 있음
		BufferedReader br = new BufferedReader(reader);
		
		try {
			String inData = br.readLine();
			System.out.println(inData);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
