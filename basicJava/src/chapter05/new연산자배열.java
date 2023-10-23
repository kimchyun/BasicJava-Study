package chapter05;

public class new연산자배열 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		//System.out.println(arr1[0]);
		//System.out.println(arr1[1]);
		//System.out.println(arr1[2]);
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] :" +arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] :" +arr1[i]);
		}
	}
}
