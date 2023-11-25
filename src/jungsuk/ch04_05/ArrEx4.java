package jungsuk.ch04_05;

import java.util.Arrays;

public class ArrEx4 {
	public static void main(String[] args) {

		// 0 ~9, 20 ~ 29를 담은 배열을 생성한 후 둘을 하나의 배열로 합쳐
		int[] arr1 = new int[10];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
		}

		// 기존보다 길이 2배인 배열 생성
		int[] arr2 = new int[arr1.length * 2];

		// 기존 배열 내용 복사: for문 사용
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (i+1) * 10;
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int[] result = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, result, 0, arr1.length);
		System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
		System.out.println(Arrays.toString(result));

	}
}
