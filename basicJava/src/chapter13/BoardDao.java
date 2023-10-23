package chapter13;

import java.util.ArrayList;
import java.util.List;

//Data Access Object : DAO => 
// 데이터베이스에 접속해 데이터를 select, insert, delete, update할대 사용하는 메소드
public class BoardDao {
	//조회하는 메소드 만들기
	public List<Board2> getBoardlist(){
		List<Board2> list = new ArrayList<Board2>();
		list.add(new Board2("제목1","내용1"));
		list.add(new Board2("제목2","내용2"));
		list.add(new Board2("제목3","내용3"));
		return list;
		
	}

}
