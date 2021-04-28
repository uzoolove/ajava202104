package ch14;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
//		List<String> fruits = new ArrayList<String>();
		List<String> fruits = new LinkedList<>();
//		List<String> fruits = new Vector<>();	// 스레드에 안전하게 셜계
		
//		Set<String> fruits = new HashSet<>();
//		Set<String> fruits = new LinkedHashSet<>();
//		Set<String> fruits = new TreeSet<>();
		
		fruits.add("바나나");
		fruits.add("딸기");
		fruits.add("사과");
		fruits.add("오렌지");
		fruits.add("파인애플");
		fruits.add("사과");
		fruits.add("자몽");
		
//		fruits.add(new Score6(23,67,99));
		
		printFruits(fruits);
	}
	
	static void printFruits(Collection<String> fruits) {
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
	}
	
//	static void printFruits(Set<String> fruits) {
//		Iterator<String> it = fruits.iterator();
//		while(it.hasNext()) {
//			String fruit = it.next();
//			System.out.println(fruit);
//		}
//	}
//	
//	static void printFruits(List<String> fruits) {
//		for(int i=0; i<fruits.size(); i++) {
//			String fruit = fruits.get(i);
//			System.out.println(fruit);
//		}
//	}
	
//	static void printFruits(LinkedList fruits) {
//		for(int i=0; i<fruits.size(); i++) {
//			String fruit = (String)fruits.get(i);
//			System.out.println(fruit);
//		}
//	}
//	
//	static void printFruits(ArrayList fruits) {
//		for(int i=0; i<fruits.size(); i++) {
//			String fruit = (String)fruits.get(i);
//			System.out.println(fruit);
//		}
//	}
}
















