package study_190311;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
	// �о�� ���� �׻� �ƽ�Ű�ڵ�� ����
	// 1byte�� ����
	// �׻� ĳ������ ��
	public static void main(String[] args) {
		
		InputStream in = System.in;
		
		try {
			int inData = in.read();
			System.out.println(inData); //�ƽ�Ű�ڵ�
			System.out.println((char)inData);
		} catch (IOException e) {
			System.out.println("Error");
		}
		
		System.out.println("Stil Running");

	}
	
}
