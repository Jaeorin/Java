package study_190304;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity) API
		// : �ڹٿ� �����ͺ��̽��� �������ִ� API�� �ǹ�.
		Connection con = null;   // DB���������� ���� ��ü
		PreparedStatement pstmt = null; // sql������ ���� ���尴ü
		ResultSet rs = null;  // pstmt�� ���� ������ SELECT���϶� ����� ResultSet���� ������.
		
		System.out.println(con);
		System.out.println(pstmt);
		System.out.println(rs);
		
		try {
			// 1) DBMS(����Ŭ) ����̹� Ŭ���� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// 2) DB���� �õ� �� ����Ǹ� Connection ��ü�� ��ȯ
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB ���� ����!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB ���� ����...");
		}
		
		System.out.println("=== ���α׷� ���� ���� ===");
	} // main()

}




