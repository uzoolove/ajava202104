package ch05.test;

import ch05.Score6;

public class ScoreTest6 {
	public static void main(String[] args) {
		Score6 kim = new Score6(100, 90, 72);
		System.out.println(kim.toString());
		
		Score6 lee = new Score6(90, 95, 99);
		lee.setEng(lee.getEng()+10);
		
		System.out.println(lee);	// 오버라이딩
		
	}
}












