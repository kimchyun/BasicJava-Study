package chapter20;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO(Data Access Object): DBMS에 직접 접근해서 CRUD를 하는 클래스
public class MemoDAO {
//	public static void main(String[] args) throws Exception {
		//TDD(Test Driven Development): 테스트 주도 개발
//		MemoDAO dao = new MemoDAO();
//		dao.insertMemo(new MemoVO("첫번째 메모", "오늘이 자바 마지막 날"));
//		List<MemoVO> memos = dao.getMemos();
//		for (MemoVO vo : memos) {
//			System.out.println(vo);
//		}
		
//		MemoVO memo = dao.getMemo(1);
//		System.out.println(memo);
//	}
	public List<MemoVO> getMemos() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc05","java");
		Statement statement = connection.createStatement();
		String sql = "SELECT id, title, content, register_date, modify_date From memo";
		ResultSet resultSet = statement.executeQuery(sql);
		List<MemoVO> list = new ArrayList<>();
		while(resultSet.next()) {
			int id = resultSet.getInt("id");
			String title = resultSet.getString("title");
			String content = resultSet.getString("content");
			Date registerDate = resultSet.getDate("register_date");
			Date modifyDate = resultSet.getDate("modify_date");
			list.add(new MemoVO(id, title, content, registerDate, modifyDate));
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
	
//	// 전체 Select, 한개 Select, insert, update, delete
//	
//	public List<MemoVO> getMemos(){
//		return null;
//	}
//	// select * from memo where id =?
	public MemoVO getMemo(int searchId) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc05","java");
		String sql = "select id, title, content, register_date, modify_date from memo where id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, searchId);
		ResultSet resultSet = statement.executeQuery();
		MemoVO vo = null;
		if (resultSet.next()) {
			int id = resultSet.getInt("id");
			String title = resultSet.getString("title");
			String content = resultSet.getString("content");
			Date registerDate = resultSet.getDate("register_date");
			Date modifyDate = resultSet.getDate("modify_date");
			vo = new MemoVO(id, title, content, registerDate, modifyDate);	
		}
		resultSet.close();
		statement.close();
		connection.close();
		return vo;
	}
	
	// insert into memo(title, content) values (?,?)
	public int insertMemo(MemoVO vo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc05","java");
		String sql = "INSERT INTO memo (id, title, content) VALUES (memo_seq.nextval, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getTitle());
		statement.setString(2, vo.getContent());
		int count = statement.executeUpdate();
		statement.close();
		connection.close();
		return 0;
	}
	
	// update memo set title = ?, content = ?, modify_date = sysdate where id = ?
	public int updateMemo(MemoVO vo) {
		return 0;
	}
	
	// delete from memo where id = ?
	public int deleteMemo(int deleteId) {
		return 0;
	}
	
}
