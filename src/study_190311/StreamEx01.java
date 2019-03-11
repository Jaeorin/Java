package study_190311;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
	// 읽어온 값을 항상 아스키코드로 받음
	// 1byte씩 받음
	// 항상 캐스팅을 함
	public static void main(String[] args) {
		
		InputStream in = System.in;
		
		try {
			int inData = in.read();
			System.out.println(inData); //아스키코드
			System.out.println((char)inData);
		} catch (IOException e) {
			System.out.println("Error");
		}
		
		System.out.println("Stil Running");

	}
	
}
