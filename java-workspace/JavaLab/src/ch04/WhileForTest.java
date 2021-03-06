package ch04;

public class WhileForTest {
	public static void main(String[] args) {
		// 1~100 합계(while)
		int sum = 0;
		int n = 1;
		while(n <= 100) {
			sum += n;
			n++;
		}
		System.out.println("sum: " + sum);
		
		int sum2 = 0;
		for(int i=1; i<=100; i++) {
			sum2 += i;
		}
		System.out.println("sum2: " + sum2);
		
		/*
		 * 채팅앱을 구글플레이에 런칭했다.
		 * 가격은 1000원.
		 * 1일차에 1명이 다운로드 받음.
		 * 2일차에 2명이 다운로드 받음.
		 * 3일차에 4명이 다운로드 받음.
		 * 4일차에 8명이 다운로드 받음.
		 * ...
		 * 10일차의 총 매출은 얼마인가?(for)
		 */
		int price = 1000;
		int totalDownload = 0;
		int todayDownload = 1, day = 1;
		for(day=1; day<=10; day++) {
			totalDownload += todayDownload;
			todayDownload *= 2;
		}
		System.out.println(--day + "일 동안 총매출은 " + totalDownload*price);
		
		// 총 매출 1억을 넘기려면 몇일이 걸리는가?(while)
		day = 1;
		totalDownload = 0;
		todayDownload = 1;
		while(totalDownload < 100000000/price) {
			totalDownload += todayDownload;
			todayDownload *= 2;
			day++;
		}
		System.out.println(--day + "일 동안 총매출은 " + totalDownload*price);
	}
}














