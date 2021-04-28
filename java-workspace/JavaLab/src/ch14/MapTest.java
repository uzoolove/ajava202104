package ch14;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> fruits = new HashMap<>();
		
		fruits.put("월", "바나나");
		fruits.put("화", "딸기");
		fruits.put("수", "사과");
		fruits.put("목", "오렌지");
		fruits.put("화", "파인애플");
		fruits.put("금", "사과");
		fruits.put("토", "자몽");
	}
}
