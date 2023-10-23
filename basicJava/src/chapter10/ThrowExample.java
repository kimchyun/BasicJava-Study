package chapter10;

public class ThrowExample {
	 public static void main(String[] args) {
		try {
			
			// throw => 예외 개발자가 만든다(8)
			Class.forName("");
			throw new Exception();
		} catch (Exception e) {
			//e.printStackTrace(); // 콜솔창에 에러 출력
			System.err.println("사용중에러발생 사용자에게 문의");
		}
	}
}
//﻿I throw new Exception(); => 개발자가 예외를 만들어서 던짐
