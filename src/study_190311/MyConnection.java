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
		
		// Network UrlConnection ����غ���
		System.out.println("�� �ּҸ� �Է��ϼ���.");
		
		// BufferedReader(new InpitStreamReader(System.in))
		// Ű���� �Է��� ���� ��� Scanner(System.in)�� ��� ����� �� �ִ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		String address = sc.nextLine();
		System.out.println(address);
		

		try {
			// 1�� Url��ü ����
			URL url = new URL(address);
			// 2�� URLConnection ����
			URLConnection con = url.openConnection();
			// 3�� ���ۿ���
			BufferedReader download = new BufferedReader
					(new InputStreamReader(con.getInputStream(), "UTF-8"));
			PrintWriter pw = new PrintWriter(new FileWriter
					("D:/workspace/Java/src/study_190311/naver.html"));
			// 4�� �ٿ�ε�
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
