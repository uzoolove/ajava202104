package ch03;

public class ScoreTest2 {
	public static void main(String[] args) {
		Score2 kim = new Score2();
		kim.kor = 100;
		kim.eng = 90;
		kim.math = 72;
		System.out.println("kim 총점: " + kim.sum());
		System.out.println("kim 평균: " + kim.avg());
		
		Score2 lee = new Score2();
		lee.kor = 90;
		lee.eng = 80;
		lee.math = 99;
		
		lee.eng += 10;
		System.out.println("lee 총점: " + lee.sum());
		System.out.println("lee 평균: " + lee.avg());
	}
}












