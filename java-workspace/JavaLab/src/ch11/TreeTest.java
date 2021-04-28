package ch11;

public class TreeTest {
	public static void main(String[] args) {
		Tree t1 = new PineTree();
		Tree t2 = new Maple();
		t1.leafShape();
		t2.leafShape();
	}
}

interface Tree{
	// 나뭇잎을 그린다.
	void leafShape();
}

class PineTree implements Tree{

	@Override
	public void leafShape() {
		// TODO Auto-generated method stub
		System.out.println("뽀족한 소나무 잎을 그린다.");
	}
	
}

class Maple implements Tree{

	@Override
	public void leafShape() {
		// TODO Auto-generated method stub
		System.out.println("별모양의 단풍나무 잎을 그린다.");
	}
	
}