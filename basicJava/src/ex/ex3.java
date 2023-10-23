package ex;

import java.util.Random;
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);	 
		 System.out.print("가위 바위 보를 입력하세요: ");
		 String human = scanner.nextLine();
		 
		 Random random = new Random();
		 String []game = {"가위","바위","보"};
		 String com = game[random.nextInt(game.length)];
		 
		
		 System.out.println("게이머: " + human);
		 System.out.println("인공지능: " + com);
		 
		 String result="";
		 if(human.equals(com)) {
		 result = "무승부!";
		 }else if(human.equals("가위")&&com.equals("바위")
		 ||human.equals("보")&&com.equals("가위")
		 ||human.equals("바위")&&com.equals("보")){
		 result = "인공지능 승리!";
		  }else {
		  result = "게이머 승리!";
		  }
		  System.out.println("결과: " + result);
		  scanner.close();
	}
}
