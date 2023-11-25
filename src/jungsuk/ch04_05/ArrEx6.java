package jungsuk.ch04_05;

public class ArrEx6 {
	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		// 배열 두 번째 요소부터 비교해서 -> 배열값이 max보다 크면 그 값을 max에 담고, 그렇지 않으면 min에 담아
		
		for(int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.printf("max는 %d, min은 %d", max, min);
	}
}

/*
 * if문은, 조건식이 참일때만 괄호안의 문장이 수행되고
 * 		  조건식이 거짓일 땐 문장을 수행하지 않고 다음 문장으로 넘어간다.
 * if-else문은, 조건식이 참일 때 if문 수행하고, 그렇지 않은 경우 else 문 수행
 * 			   둘 중 어느 한 블럭을 수행한 후 전체 if문을 벗어나며, 모두 수행되지 않는 경우는 있을 수 없다.
 * if-else if문은, 결과가 참인 조건식을 만나면 해당 블럭만 수행하고, 'if-else if문' 전체를 벗어난다.
 * 				  결과가 참인 조건식이 하나도 없으면 마지막 else 문을 수행하고, 이 else 문은 생략 가능
 * 				  else 문을 생략하는 경우, if-else if 문의 어떤 블록도 수행되지 않을 수 있다.
 */