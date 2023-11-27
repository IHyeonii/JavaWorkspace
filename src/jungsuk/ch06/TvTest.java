package jungsuk.ch06;

class Tv {
	// 속성 = 멤버변수
	String color;
	boolean power;
	int channel;
	
	// 기능 = 메서드 = 함수 -> 데이터를 갖고 작업 함
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

/**
 * 소스파일 하나에 클래스가 여러개일 때
 * public 붙는 클래스 = 소스파일과 클래스명 동일해야 함 (대표클래스)
 * */
public class TvTest {
	public static void main(String[] args) {
		Tv tv = new Tv(); // Tv라는 클래스(설계도) 만들고 -> 실제 객체(TV) 생성
		tv.color = "블랙";
		tv.channel = 7;

		tv.channelDown();
		System.out.println("현재 채널은 :" + tv.channel);

		// 기본타입 제외하고 전부 참조형
		// 참조형은 변수에 메모리의 주소값을 저장
		System.out.println(tv);

		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		System.out.println("현재 채널은 :" + tv.channel);

		tv.power();
		System.out.println("전원: " + tv.power);

		tv.power();
		System.out.println("전원: " + tv.power);

		// 메소드로 채널, 전원 온오프 컨트롤 -> 속성변수는 메소드 수행으로 생성된 값을 들고있다 ?
	}
}
