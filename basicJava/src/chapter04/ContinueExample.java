package chapter04;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2 !=0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
//for-if-continue 일때 if가 참이면 반복, 거짓이면 continue 그 다음
//if문 => 홀수일때 반복, 짝수일때 continue