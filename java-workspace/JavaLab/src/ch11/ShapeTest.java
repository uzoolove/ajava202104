package ch11;

public class ShapeTest {

	public static void main(String[] args) {
		Shape s1 = new Circle(5);	// 2. 다형성 조건(up casting)
		Shape s2 = new Rectangle(10, 20);
		
		s1.draw();	// 다형성
		s2.draw();
		
		printArea(s1);
		printArea(s2);
	}
	
	static void printArea(Shape s) {
		s.area();	// 다형성
	}

}

abstract class Shape{
	public void draw() {
		System.out.println("도형 그릴 준비를 한다.");
	}
	public abstract void area();
//	public void area() {
//		System.out.println("도형의 넓이를 계산한다.");
//	}
}

class Circle extends Shape{	// 1. 다형성 조건(상속)
	private int r;
	public Circle(int r) {
		this.r = r;
	}
	
	public void draw() { // 3. 다형성 조건(오버라이딩)
		super.draw();
		System.out.println("원을 그립니다.");
	}
	
	public void area() {
		System.out.println("원의 넓이는 " + Math.PI * r * r + " 입니다.");
	}
}

class Rectangle extends Shape{
	private int w;
	private int h;
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}
	
	public void draw() {
		super.draw();
		System.out.println("사각형을 그립니다.");
	}
	
	public void area() {
		System.out.println("사각형의 넓이는 " + w * h + " 입니다.");
	}
	
}








