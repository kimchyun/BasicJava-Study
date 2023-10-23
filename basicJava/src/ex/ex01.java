package ex;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫");
		double num1 = Double.parseDouble(scanner.nextLine());
		System.out.println("두");
		double num2 = Double.parseDouble(scanner.nextLine());
		
		if(num2 !=0) {
			System.out.println("결과:" + (num1/num2));
		}else {
			System.out.println("결과: 무한대");
		}
		

	}

}
