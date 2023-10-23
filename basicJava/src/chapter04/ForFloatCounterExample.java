package chapter04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}

	}

}
//0.1은 float 타입으로 정확하게 표현x, 그래서 0.1보다 약간 커서 9번만 실행