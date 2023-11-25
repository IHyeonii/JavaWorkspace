package jungsuk.ch04_05;

import java.util.Arrays;

public class ArrEx3 {
	public static void main(String[] args) {
		//배열 크기 부족할 때
		// 1. 큰 배열 생성 -> 2.이전 배열 복사
		
		int[] arr1 = new int[5];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i+1;
		}
		
		// 기존보다 길이 2배인 배열 생성
		int[] arr2 = new int[arr1.length * 2];
		
		// 기존 배열 내용 복사: for문 사용
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1 = arr2; // 기존 arr1에 arr2 값을 저장 -> arr1의 주소가 바뀜
		
		System.out.println(Arrays.toString(arr1));
	}

}
