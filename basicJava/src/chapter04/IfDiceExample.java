package chapter04;

import java.util.Random;
import java.util.Scanner;

public class IfDiceExample {

	public static void main(String[] args) {
		//Math.random() 0부터 1미만 실수
		//SecureRandom
		Random random = new Random();
		int num = random.nextInt(6) +1; //+1하면 1~6까지 //0~5까지 임의의 수 반환
		
	}

}
