package ch03;

public class ScoreTest {
	public static void main(String[] args) {
		Score kim = new Score();
		kim.kor = 100;
		kim.eng = 90;
		kim.math = 72;
		kim.sum = kim.kor + kim.eng + kim.math;
		kim.avg = kim.sum / 3.0;
		System.out.println("kim 총점: " + kim.sum);
		System.out.println("kim 평균: " + kim.avg);
		
		Score lee = new Score();
		lee.kor = 90;
		lee.eng = 80;
		lee.math = 99;
		lee.sum = lee.kor + lee.eng + lee.math;
		lee.avg = lee.sum / 3.0;
		
		lee.eng += 10;
		System.out.println("lee 총점: " + lee.sum);
		System.out.println("lee 평균: " + lee.avg);
	}
}












