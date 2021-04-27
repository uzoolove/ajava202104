package api;

public class WrapperTest {
	public static void main(String[] args) {
//		int i = 123;
//		System.out.println(i);
//		System.out.println((double)i);
		
		Integer i = new Integer(123);
		System.out.println(i.intValue());
		System.out.println(i.doubleValue());
		
		System.out.println("100" + "100");
		System.out.println(Integer.parseInt("100") + Integer.parseInt("100"));
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		Integer i2 = 100; // Integer = int;	// auto boxing java1.5
		int i3 = new Integer(200);	// int = Integer; auto unboxing
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.println(n1 + n2);
	}
}






