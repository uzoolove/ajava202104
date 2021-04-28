package ch11;

public class BellTest {
	public static void main(String[] args) {
		Bell b = new DoorBell();
		Bell b2 = new AlarmBell();
		b.ring();
		b2.ring();
	}
}

abstract class Bell{
	/*
	 * 벨소리가 울린다.
	 */
	abstract void ring();
}

class DoorBell extends Bell{
	@Override
	void ring() {
		System.out.println("띵동 띵동");
	}	
}

class AlarmBell extends Bell{
	@Override
	void ring() {
		System.out.println("띠리리리 띠리리리");
	}	
}
