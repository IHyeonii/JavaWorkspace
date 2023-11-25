package jungsuk.ch04_05;

public class FlowEx33 {
	public static void main(String[] args) {
		// 구구단 5번째 까지만 출력
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//				
//				if (j == 5) {
//					break;
//				}
//				System.out.printf("%d * %d = %d%n", i, j, i*j);
//			}
//		}
		
		// 2단의 5번째 까지만 출력하려면?? 걍 이렇게 하면 안 되나, 이름붙이면 넘 복잡해
		for(int i = 2; i < 10; i++) {
			if(i > 2) {
				break;
			}
			for(int j = 1; j < 10; j++) {
				
				if (j == 5) {
					break;
				}
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
		}
		
	}
}
