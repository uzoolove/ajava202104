package ch12.multi;

public class MultiThreadTest {
	public static void main(String[] args) {
		System.out.println("1. main 시작.");
		OddNum odd = new OddNum();
		EvenNum even = new EvenNum();
		
		odd.start();
		new Thread(even).start();
		
		// 3의 배수 출력
		// 익명 inner class
		// Thread를 상속받고 run() 메소드를 오버라이드 하는 객체를 생성
		new Thread() {
			public void run() {
				for(int i=3; i<=10; i+=3) {
					System.out.println("3의 배수: " + i);
				}
			}
		}.start();		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		
		System.out.println("8. main 완료.");
	}
}




















