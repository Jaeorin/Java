package study_190311;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class MyConnection {

	public static void main(String[] args) {
		
		// Network UrlConnection 사용해보기
		System.out.println("웹 주소를 입력하세요.");
		
		// BufferedReader(new InpitStreamReader(System.in))
		// 키보드 입력을 받을 경우 Scanner(System.in)를 대신 사용할 수 있다
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		String address = sc.nextLine();
		System.out.println(address);
		

		try {
			// 1번 Url객체 생성
			URL url = new URL(address);
			// 2번 URLConnection 연결
			URLConnection con = url.openConnection();
			// 3번 버퍼연결
			BufferedReader download = new BufferedReader
					(new InputStreamReader(con.getInputStream(), "UTF-8"));
			PrintWriter pw = new PrintWriter(new FileWriter
					("D:/workspace/Java/src/study_190311/naver.html"));
			// 4번 다운로드
			while(true) {
				String line = download.readLine();
				if(line == null) break;
				pw.println(line);
			}
			download.close();
			pw.close();
			System.out.println("download end");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
