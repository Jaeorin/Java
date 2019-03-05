package study_190304;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsert {

	public static void main(String[] args) {
		// 오라클의 scott 스키마의 emp 테이블 Insert문 수행
		
		Connection con = null;   // DB연결정보를 가진 객체
		PreparedStatement pstmt = null; // sql문장을 가진 문장객체
		
		String sql = "";
		
		// 입력데이터. 사용자가 입력했다고 가정.
		int inputEmpno = 8002;  // 기본키. 중복값 올수없음.
		String inputEname = "성춘향";
		int inputSal = 2500;
		
		try {
			// 1) DBMS(오라클) 드라이버 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 2) DB접속 시도 후 연결되면 Connection 객체를 반환
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB 연결 성공!");
			
			sql = "INSERT INTO emp (empno, ename, sal, hiredate) ";
			sql += "VALUES (?, ?, ?, CURRENT_DATE) ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, inputEmpno);
			pstmt.setString(2, inputEname);
			pstmt.setInt(3, inputSal);
			
			// 실행
			int rowCount = pstmt.executeUpdate(); // SELECT문 이외의 INSERT,UPDATE,DELETE는
			                           // executeUpdate()를 호출해야함.
			System.out.println(rowCount);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 연결 실패...");
		} finally {
			// 예외발생 여부에 관계없이 정리작업
			// JDBC 객체 닫을때 사용의 역순으로 닫음.
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("=== 프로그램 정상 종료 ===");
		
		
		
		
	} // main()

}
