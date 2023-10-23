package chapter06;

public class CarCExample {
	public static void main(String[] args) {
		CarC myCarC = new CarC();
		
		myCarC.setGas(5); //실행 후 스택에있는 setGas가 사라짐
		
		boolean gasState = myCarC.isLeftGas(); //true로 반환 // 실행 후 스택에있는 isLeftGas가 사라짐
		if(gasState) {
			System.out.println("출발합니다.");
			myCarC.run();
		}
		
		if(myCarC.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
		}else {
			System.out.println("gas를 주입하세요");
		}
	}
}
