package jungsuk.ch04_05;

public class FlowEx24 {
	public static void main(String[] args) {
		//while 문으로 10 -> 0 카운트하고 종료문구 출력
		
		int i = 10;
		
		while(i > 0) {
			System.out.println(i--);
		}
		System.out.println("카운트 종료");
	}

}
