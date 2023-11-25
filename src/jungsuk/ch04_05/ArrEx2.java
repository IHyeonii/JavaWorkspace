package jungsuk.ch04_05;

import java.util.Arrays;

public class ArrEx2 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		System.out.println(Arrays.toString(arr));
		
		// 길이가 5인 배열 생성해서 50 ~ 90까지 10단위 값 입력하기
		int[] arr2 = new int[5];
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = 50 + (i*10);
		}
		System.out.println(Arrays.toString(arr2));
		
		// 배열에 저장, 출력 모두 같은 형태
		System.out.println(arr2[3]);

	}
}
