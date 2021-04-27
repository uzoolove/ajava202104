package ch05.test;

import ch05.Score3;

public class ScoreTest3 {
	public static void main(String[] args) {
		Score3 kim = new Score3();
		kim.kor = 100;
		kim.eng = 90;
		kim.math = 72;
		System.out.println("kim 총점: " + kim.sum());
		System.out.println("kim 평균: " + kim.avg());
		
		Score3 lee = new Score3();
		lee.kor = 90;
		lee.eng = 80;
		lee.math = 99;
		
		lee.eng += 10;
		System.out.println("lee 총점: " + lee.sum());
		System.out.println("lee 평균: " + lee.avg());
		
		// 학급 평균 출력
		double totalAvg = (kim.avg() + lee.avg()) / Score3.totalCount;
		System.out.println("학급 평균: " + totalAvg);
	}
}












