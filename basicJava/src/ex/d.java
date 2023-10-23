package ex;

import java.util.Random;

public class d {

	public static void main(String[] args) {
		int[] dice = new int[6];
		for(int i=1; i<=10000;i++) {
			Random random = new Random();
			int r = random.nextInt(6)+1;
			dice[r-1]++;
		}
		System.out.println("---");
		System.out.println("면\t빈도");
		System.out.println("---");
		for(int i=0; i<dice.length;i++) {
			System.out.println((i+1)+"\t"+dice[i]);
		}
	}

}
