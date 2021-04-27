package ch05;

public class CallByReference {
	static void something(int first, MyObject second) {
		first += 10;
		second.value += 10;
		System.out.println("first: " + first + ", second: " + second.value);
	}
}

class MyObject{
	int value;
	MyObject(int value){
		this.value = value;
	}
}
