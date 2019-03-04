package study_190304;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class JdbcSelect {

	public static void main(String[] args) {
		// ����Ŭ�� scott ��Ű���� emp ���̺� Select��
		
		Connection con = null;   // DB���������� ���� ��ü
		PreparedStatement pstmt = null; // sql������ ���� ���尴ü
		ResultSet rs = null;  // pstmt�� ���� ������ SELECT���϶� ����� ResultSet���� ������.
		String sql = "";
		
		// �˻�����. ����ڰ� �Է��ߴٰ� ����.
		String inputName = "A";
		int inputSal = 1000;
		
		try {
			// 1) DBMS(����Ŭ) ����̹� Ŭ���� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// 2) DB���� �õ� �� ����Ǹ� Connection ��ü�� ��ȯ
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB ���� ����!");
			
			sql = "SELECT empno, ename, sal, hiredate ";
			sql += "FROM emp ";
			sql += "WHERE ename LIKE ? ";
			sql += "AND sal >= ? ";
			sql += "ORDER BY empno";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+inputName+"%");
			pstmt.setInt(2, inputSal);
			
			// ����
			rs = pstmt.executeQuery(); // SELECT�� ���� ����� ResultSet���� ���Ϲ���
			                        // executeQuery()�� SELECT���϶��� ȣ���ؾ���.
			
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");
				Timestamp hiredate = rs.getTimestamp("hiredate");
				
				System.out.println(empno+"\t"+ename+"\t"+sal+"\t"+hiredate);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB ���� ����...");
		} finally {
			// ���ܹ߻� ���ο� ������� �����۾�
			// JDBC ��ü ������ ����� �������� ����.
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("=== ���α׷� ���� ���� ===");
		
		
		
		
	} // main()

}
