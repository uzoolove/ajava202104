package ch05;

public class Score4 {
	private int kor;
	private int eng;
	private int math;
	
	
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		if(eng > 100) {
			eng = 100;
		}
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	// setter
	public void setKor(int kor) {		
		this.kor = kor;
	}
	// getter
	public int getKor() {
		return this.kor;
	}
	
	public int sum() {
		int total = kor + eng + math;
		return total;
	}
	
	public double avg() {
		double result = sum() / 3.0;
		return result;
	}
}
