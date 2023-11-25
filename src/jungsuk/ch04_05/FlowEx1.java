package jungsuk.ch04_05;

public class FlowEx1 {
	public static void main(String[] args) {
		// 1 ~10까지 더하기
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(i + "번, 결과는 =" + sum);
		}

	}
}
