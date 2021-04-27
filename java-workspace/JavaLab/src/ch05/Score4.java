package ch05;

public class Score4 {
	private int kor;
	private int eng;
	private int math;
	
	public int sum() {
		int total = kor + eng + math;
		return total;
	}
	
	public double avg() {
		double result = sum() / 3.0;
		return result;
	}
}
