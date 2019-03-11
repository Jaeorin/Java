package study_190311;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteEx01 {

	public static void main(String[] args) {

		//FileOutputStream : byte로 써야하기 때문에 사용하기 어려움
		//FileWriter : 문자를 byte로 자동으로 변환하지만 크기가 고정됨

		//BufferedWriter   : 크기 제한없이 입력(OS구분 O)
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter
					("D:/workspace/Java/src/study_190311/test.txt"));
			bw.write("안녕\r\n"); //유닉스나 리눅스 내려쓰기 : \n
			bw.write("반가워");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//PrintWriter      : 크기 제한없이 입력(OS구분 X)
		try {
			PrintWriter pw = new PrintWriter(new FileWriter
						("D:/workspace/Java/src/study_190311/test2.txt"));
			pw.println("안녕");
			pw.println("반가워");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
