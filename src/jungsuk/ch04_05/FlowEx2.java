package jungsuk.ch04_05;


public class FlowEx2 {
	public static void main(String[] args) {
		// 5행 * 10열 별 찍기		
		for (int i = 0; i < 5; i++) {
			// 일단 가로로 10개
			for(int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println("-----------------------------");
		
		// 5행 별 하나씩 증가하는 삼각형 출력
		
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
