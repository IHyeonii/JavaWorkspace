package jungsuk.ch07;

class Product {
	int price;
	int bonusPoint;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	// 매개변수 있는 생성자 -> 기본생성자 호출 안 됨
	public Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		
		
	}
	
}
class Computer extends Product {
	
}
class Buyer {
	
}



public class PolyArgumentEx {

}
