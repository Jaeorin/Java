package study_190311;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteEx01 {

	public static void main(String[] args) {

		//FileOutputStream : byte�� ����ϱ� ������ ����ϱ� �����
		//FileWriter : ���ڸ� byte�� �ڵ����� ��ȯ������ ũ�Ⱑ ������

		//BufferedWriter   : ũ�� ���Ѿ��� �Է�(OS���� O)
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter
					("D:/workspace/Java/src/study_190311/test.txt"));
			bw.write("�ȳ�\r\n"); //���н��� ������ �������� : \n
			bw.write("�ݰ���");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//PrintWriter      : ũ�� ���Ѿ��� �Է�(OS���� X)
		try {
			PrintWriter pw = new PrintWriter(new FileWriter
						("D:/workspace/Java/src/study_190311/test2.txt"));
			pw.println("�ȳ�");
			pw.println("�ݰ���");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
