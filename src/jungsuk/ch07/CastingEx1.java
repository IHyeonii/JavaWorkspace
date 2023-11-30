package jungsuk.ch07;

public class CastingEx1 {
	public static void main(String[] args) {
		Car car = null; // 참조변수 선언
		FireEn fe = new FireEn(); // 인스턴스 생성과 초기화
		FireEn fe2 = null; // 참조변수 선언
		
//		fe.water();
		car = fe; // fe 참조변수 업캐스팅
		// fe가 가르키는 대상 = FireEn 이지만,
		// fe 주소값을 car 변수에 복사해줘도 둘의 타입이 달라서 car는 FireEn의 water 메소드는 사용 불가

		fe2 = (FireEn) car; // 조상 -> 자손으로 다운캐스팅
		fe2.water();
	
		
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive");
	}
	
	void stop() {
		System.out.println("stop");
	}
}

class FireEn extends Car {
	void water() {
		System.out.println("water");
	}
}


