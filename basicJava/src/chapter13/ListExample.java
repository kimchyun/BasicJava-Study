package chapter13;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board2> list = dao.getBoardlist();
		
		for(Board2 board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
		
	}
}
