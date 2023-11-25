package jungsuk.ch04_05;

public class FlowEx3 { //구구단출력
	public static void main(String[] args) {
		// 1. 숫자를 1~9까지 출력하고 
		// 계산식도 1~9까지
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
//				System.out.println(i + "*" + j + "=" + i*j);
				System.out.printf("%d * %d = %d%n", i, j , i*j);
			}
		}
	}

}
