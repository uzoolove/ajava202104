package ch05.test;

import ch05.Score4;

public class ScoreTest4 {
	public static void main(String[] args) {
		Score4 kim = new Score4();
		kim.setKor(100);
		kim.setEng(90);
		kim.setMath(72);
		System.out.println("kim 총점: " + kim.sum());
		System.out.println("kim 평균: " + kim.avg());
		
		Score4 lee = new Score4();
		lee.setKor(90);
		lee.setEng(95);
		lee.setMath(99);
		
		lee.setEng(lee.getEng()+10);
		
		System.out.println("lee 총점: " + lee.sum());
		System.out.println("lee 평균: " + lee.avg());
		
	}
}












