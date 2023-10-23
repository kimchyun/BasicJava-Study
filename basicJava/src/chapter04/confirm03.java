package chapter04;

import java.util.Random;

public class confirm03 {

	public static void main(String[] args) {
		while(true) {
			Random random = new Random();
			int num1 = random.nextInt(6)+1;
			int num2 = random.nextInt(6)+1;
			
			System.out.println("("+ num1 + ", " + num2 + ")");
			if ((num1 +num2)==5) {
		    break;
		}

      }
   }
}