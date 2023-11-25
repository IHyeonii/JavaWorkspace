package jungsuk.ch04_05;

public class ArrEx5 {
	public static void main(String[] args) {
		int[] score = {100, 88, 100, 100, 90};
		int x = 0;
		// 총점과 평균 구하기
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println(sum);
		
		avg = sum / score.length;
		System.out.println(avg); // int, int 연산결과 == int
		
		avg = sum / (double) score.length;
		System.out.println(avg);
		
		
	}

}
