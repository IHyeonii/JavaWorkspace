package jungsuk.ch09;

import java.util.Arrays;

public class ArrCopy {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6};
		
		int[] arr2 = Arrays.copyOf(arr1, 10);
		int[] arr3 = Arrays.copyOf(arr1, arr1.length); // 이렇게 하면 길이까지 동일한 배열 복사 가능
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("----------------------------------");
		// arr1, arr2는 가르키는 주소가 달라서 arr2 변경이 arr1에 영향을 미치지 않는다.
		arr2[7] = 100;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("----------------------------------");
		// 원본 배열에서 특정 범위(시작 인덱스 ~ 종료 인덱스)에 포함되는 값을 복사
		int[] arr4 = Arrays.copyOfRange(arr1, 1, arr1.length); // arr1 배열의 인덱스 1번부터 끝까지
		System.out.println(Arrays.toString(arr4));	
	}
}
