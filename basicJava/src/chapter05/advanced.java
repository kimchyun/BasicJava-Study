package chapter05;

import java.util.Iterator;

public class advanced {

	public static void main(String[] args) {
		int [] scores= {95,71,84,93,87};//배열을 리터럴형식으로 초기화
		int sum=0;
		//1. for i
//		for (int i=0 ; i<scores.length;i++) {
//			sum=sum+scores[i];
		//2. foreach 향상된 for문
		for (int score : scores) {
			sum=sum+score;
			
		}
		//3. foreach라는 함수
		System.out.println(sum);
		}

	}


