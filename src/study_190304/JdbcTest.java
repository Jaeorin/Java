package study_190304;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity) API
		// : 자바와 데이터베이스를 연결해주는 API를 의미.
		Connection con = null;   // DB연결정보를 가진 객체
		PreparedStatement pstmt = null; // sql문장을 가진 문장객체
		ResultSet rs = null;  // pstmt가 가진 문장이 SELECT문일때 결과를 ResultSet으로 가져옴.
		
		System.out.println(con);
		System.out.println(pstmt);
		System.out.println(rs);
		
		try {
			// 1) DBMS(오라클) 드라이버 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 2) DB접속 시도 후 연결되면 Connection 객체를 반환
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB 연결 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 연결 실패...");
		}
		
		System.out.println("=== 프로그램 정상 종료 ===");
	} // main()

}




