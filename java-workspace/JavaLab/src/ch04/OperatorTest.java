package ch04;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 100;
		short s = 30000;
		int i = 200000000;
		long l = 23423543425346345L;
		float f = 23453452345345.6785678F;
		double d = 23453455463456.34523452345;
		char c1 = '안';
		char c2 = 'a';
		boolean b1 = true;
		boolean b2 = true;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(b1);
		System.out.println(b2);
		
		int bb = b + 100;	// 작은 크기의 데이터를 큰 크기로 자동 형변환 수행
		System.out.println(bb);
		
		byte bbb = (byte)bb;	// 큰 크기의 데이터를 작은 크기로 변환(명시적 형변환)
		System.out.println(bbb);
		
		int bbbb = bbb;	// 자동 형변환
		System.out.println(bbbb);
	}

}
















