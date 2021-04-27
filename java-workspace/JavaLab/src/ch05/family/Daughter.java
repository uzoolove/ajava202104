package ch05.family;

public class Daughter extends Parent{
	
	// 기본생성자(자동생성)
//	public Son() {
//		super();	// 부모클래스의 생성자 호출
//	}

	public Daughter(String name) {
		super(name);
	}
	
	private void makeup() {
		System.out.println(name + ": 화장한다.");
	}
	
	public void play() {
		makeup();
		System.out.println(name + ": 클럽에 간다.");
	}
	
	public void study() {
		System.out.println(name + ": 과외를 받는다.");
	}
	
	
}
