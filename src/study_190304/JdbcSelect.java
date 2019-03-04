package study_190304;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class JdbcSelect {

	public static void main(String[] args) {
		// 오라클의 scott 스키마의 emp 테이블 Select문
		
		Connection con = null;   // DB연결정보를 가진 객체
		PreparedStatement pstmt = null; // sql문장을 가진 문장객체
		ResultSet rs = null;  // pstmt가 가진 문장이 SELECT문일때 결과를 ResultSet으로 가져옴.
		String sql = "";
		
		// 검색조건. 사용자가 입력했다고 가정.
		String inputName = "A";
		int inputSal = 1000;
		
		try {
			// 1) DBMS(오라클) 드라이버 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 2) DB접속 시도 후 연결되면 Connection 객체를 반환
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB 연결 성공!");
			
			sql = "SELECT empno, ename, sal, hiredate ";
			sql += "FROM emp ";
			sql += "WHERE ename LIKE ? ";
			sql += "AND sal >= ? ";
			sql += "ORDER BY empno";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+inputName+"%");
			pstmt.setInt(2, inputSal);
			
			// 실행
			rs = pstmt.executeQuery(); // SELECT문 실행 결과를 ResultSet으로 리턴받음
			                        // executeQuery()는 SELECT문일때만 호출해야함.
			
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");
				Timestamp hiredate = rs.getTimestamp("hiredate");
				
				System.out.println(empno+"\t"+ename+"\t"+sal+"\t"+hiredate);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 연결 실패...");
		} finally {
			// 예외발생 여부에 관계없이 정리작업
			// JDBC 객체 닫을때 사용의 역순으로 닫음.
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("=== 프로그램 정상 종료 ===");
		
		
		
		
	} // main()

}
