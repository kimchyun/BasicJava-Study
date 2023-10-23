package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JDBCProgramming {
	public static void main(String[] args) throws Exception {
		//JDBC Programming
		//JDBC (Java DataBase Connectivity)
		/*
		 * 프로그래밍언어 - 데이터베이스
		 * 준비물: 드라이버(JDBC driver) : ojdbc8.jar
		 * 
		 * 1. 오라클 드라이버 로딩(등록) -실행
		 * 2. DB 접속 정보(ip, oracle service id, id, password)를 통해 접속
		 * 3. 접속된 DB에 query를 전송할 워크시트 생성
		 * 4. query 작성
		 * 5. 작성된 query를 db 서버에 전송
		 * 6. 전송 결과를 받아서 처리
		 * 7. 접속 종료 
		 */
		
		
		// 1. 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2.
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc05","java");
		// 3. 
		Statement statement = connection.createStatement(); // ->connection.prepareStatement(null);
		// 4. 대문자(ctrl shift x), 포맷팅(ctrl F7), 십자모양(alt shift a)
		
//		String sql = "";
//		sql += "SELECT";
//		sql += "    mem_id,";
//		sql += "    mem_name,";
//		sql += "    mem_hp,";
//		sql += "    mem_mail ";
//		sql += "FROM";
//		sql += "    member";
		
		// 문자열 concatenation(결합) : String vs StringBuilder vs StringBuffer
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT");
		builder.append("    mem_id,");
		builder.append("    mem_name,");
		builder.append("    mem_hp,");
		builder.append("    mem_mail ");
		builder.append("FROM");
		builder.append("    member");
		String sql = builder.toString();
		
		// 5.
		ResultSet resultSet = statement.executeQuery(sql); // executeUpdate(sql) => insert, update, delete
		
		// 6.
		while (resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			System.out.printf("%s\t%s\t%s\t%s\n",memId, memName, memHp, memMail );
		}
		
		// 7.
		resultSet.close();
		statement.close();
		connection.close();
	}
}
