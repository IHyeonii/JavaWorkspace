package jungsuk.ch06;

class Tv {
	public static void main(String[] args) {
		
	}
	// 속성 = 멤버변수
	String color;
	boolean power;
	int channel;
	
	// 기능 = 메서드
	void power() {
		power = !power;
	}
	void channerUp() {
		++channel;
	}
	
	void channerDown() {
		--channel;
	}
}

/*
 * public 클래스가 있을 경우, 클래스 명은 소스파일 이름과 동일해야 한다 = 대표 클래스
 * */
public class TvTest {

}
