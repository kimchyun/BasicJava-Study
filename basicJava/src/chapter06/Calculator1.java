package chapter06;

public class Calculator1 {
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		a("실행결과: " + result);
	}
	
	void a(String message) {
		System.out.println(message);
	}
}
