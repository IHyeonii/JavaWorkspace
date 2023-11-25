package jungsuk.ch04_05;

public class FlowEx31 {
	public static void main(String[] args) {
		// 1~10 까지 출력하는데, 3의 배수는 출력하지 마
		
		// continue는 반복문 끝으로 이동 = continue 이후 문장을 수행하지 않고
		// for문의 증감식으로 이동해 다음 조건을 수행한다.
		// break 문도 이후 문장을 수행하지 않는 점은 동일하지만, break문은 반복문을 탈출한다는 차이가 있다.
		for (int i = 1; i < 11; i++) {
			if (i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
