package study_190304;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsert {

	public static void main(String[] args) {
		// ����Ŭ�� scott ��Ű���� emp ���̺� Insert�� ����
		
		Connection con = null;   // DB���������� ���� ��ü
		PreparedStatement pstmt = null; // sql������ ���� ���尴ü
		
		String sql = "";
		
		// �Էµ�����. ����ڰ� �Է��ߴٰ� ����.
		int inputEmpno = 8002;  // �⺻Ű. �ߺ��� �ü�����.
		String inputEname = "������";
		int inputSal = 2500;
		
		try {
			// 1) DBMS(����Ŭ) ����̹� Ŭ���� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// 2) DB���� �õ� �� ����Ǹ� Connection ��ü�� ��ȯ
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB ���� ����!");
			
			sql = "INSERT INTO emp (empno, ename, sal, hiredate) ";
			sql += "VALUES (?, ?, ?, CURRENT_DATE) ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, inputEmpno);
			pstmt.setString(2, inputEname);
			pstmt.setInt(3, inputSal);
			
			// ����
			int rowCount = pstmt.executeUpdate(); // SELECT�� �̿��� INSERT,UPDATE,DELETE��
			                           // executeUpdate()�� ȣ���ؾ���.
			System.out.println(rowCount);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB ���� ����...");
		} finally {
			// ���ܹ߻� ���ο� ������� �����۾�
			// JDBC ��ü ������ ����� �������� ����.
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("=== ���α׷� ���� ���� ===");
		
		
		
		
	} // main()

}
