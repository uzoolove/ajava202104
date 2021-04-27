package ch05.family;

public class Son extends Parent implements Gamer{
	
	// 기본생성자(자동생성)
//	public Son() {
//		super();	// 부모클래스의 생성자 호출
//	}

	public Son(String name) {
		super(name);
	}
	
	public void game() {
		System.out.println(name + ": 피씨방에 간다. RPG 게임을 한다.");
	}
	
	/*
	 * 메소드 오버라이딩(재정의)
	 * 	- 상속받은 메소드를 자식 클래스가 재정의
	 */
	public void play() {
		System.out.println(name + ": 나이트에 간다.");
	}
	
	public void study() {
		System.out.println(name + ": 도서관에서 공부한다.");
	}
	
	
	
}







