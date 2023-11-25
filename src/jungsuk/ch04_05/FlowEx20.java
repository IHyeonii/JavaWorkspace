package jungsuk.ch04_05;

public class FlowEx20 {
	public static void main(String[] args) {
		// 이중배열 모양 만들기: 5행 5열
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 6; j++) {
				System.out.printf("[%d, %d] \t", i, j);
			}
			System.out.println();
		}
		
		// i == j인 경우만 출력하기
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 6; j++) {
				
				
				if (i == j) {
					System.out.printf("[%d, %d] \t", i, j);
				} else {
					System.out.printf("%5c", ' ');
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
