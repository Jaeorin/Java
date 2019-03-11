package study_190311;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx03 {

	public static void main(String[] args) {

		InputStreamReader reader = new InputStreamReader(System.in);
		
		// 8192Byte - 4096���� ���ڸ� �ѹ��� ���� �� ����
		BufferedReader br = new BufferedReader(reader);
		
		try {
			String inData = br.readLine();
			System.out.println(inData);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
