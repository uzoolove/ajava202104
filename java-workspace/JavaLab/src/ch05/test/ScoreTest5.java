package ch05.test;

import ch05.Score5;

public class ScoreTest5 {
	public static void main(String[] args) {
		Score5 kim = new Score5(100, 90, 72);
		System.out.println(kim.toString());
		
		Score5 lee = new Score5(90, 95, 99);
		lee.setEng(lee.getEng()+10);
		
		System.out.println(lee);	// 오버라이딩
		
	}
}












