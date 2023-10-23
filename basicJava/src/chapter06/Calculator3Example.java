package chapter06;

public class Calculator3Example {
	public static void main(String[] args) {
		Calculator3 calculator = new Calculator3();
		System.out.println("15+30=" + calculator.plus(15,30));
		
		//double result = 5*5*calculator.pi; //static이 안붙어있으면
		
		//반지름이 5인 원의 넓이를 구한다
		double result = 5*5*Calculator3.pi;
		System.out.println("반지름이 5인 원의 넓이: " + result);
		
		//100-24
		System.out.println(Calculator3.minus(100,24));
	}
}
