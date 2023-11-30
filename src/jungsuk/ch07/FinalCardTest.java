package jungsuk.ch07;

class Card {
	final int num;
	final String kind;
	static int weight = 100;
	static int height = 200;
	
	// final 변하지 않는 상수 = 매개변수가 있는 생성자 선언 -> 인스턴스마다 final 변수에 다른 값 할당
	public Card(int num, String kind) {
		this.num = num;
		this.kind = kind;
	}
}

public class FinalCardTest {
	public static void main(String[] args) {
		Card c = new Card(10, "heart");
		System.out.println(c.num);
		System.out.println(c.kind);
		System.out.println(c.weight);
		System.out.println(c.height);
		
		Card c2 = new Card(20, "space");
		System.out.println(c2.num);
		System.out.println(c2.kind);
	}
}
