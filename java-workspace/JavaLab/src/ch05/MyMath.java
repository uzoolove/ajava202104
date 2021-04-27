package ch05;

public class MyMath {
	/*
	 * 메소드 오버로딩
	 * 	- 같은 클래스내에서 동일한 이름의 메소드를 중복 정의
	 * 	- 단, 매개변수의 개수, 타입, 순서를 다르게 정의해야한다.
	 */
	// 10 + 20의 결과를 출력한다.
	void printSum() {
		int n1 = 10;
		int n2 = 20;
		int result = n1 + n2;
		System.out.println(n1 +  " + " + n2 + " = " + result);
	}
	
	// 10 + 지정한 수의 결과를 출력한다.
	void printSum(int n2) {	// 매개변수
		int n1 = 10;
		int result = n1 + n2;
		System.out.println(n1 +  " + " + n2 + " = " + result);
	}
	
	// 지정한 두 수의 합계를 출력한다.
	void printSum(int n1, int n2) {	// 매개변수
		int result = n1 + n2;
		System.out.println(n1 +  " + " + n2 + " = " + result);
	}
	
	// 지정한 두 수의 합계를 반환한다.
	int getSum(int n1, int n2) {	// 매개변수
		int result = n1 + n2;
//		return (n1 +  " + " + n2 + " = " + result);
		return result;
	}
	
	public static void main(String[] args) {
		MyMath m = new MyMath();
		m.printSum();
		m.printSum(30);	// 인자값
		m.printSum(40);
		m.printSum(10, 20);
		m.printSum(30, 40);
		int str = m.getSum(50, 60);
		System.out.println(str);
	}
}
