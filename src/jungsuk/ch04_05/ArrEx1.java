package jungsuk.ch04_05;

import java.util.Arrays;

public class ArrEx1 {
	public static void main(String[] args) {
		//변수 = 하나의 값만 저장
		//배열 = 같은 타입의 여러 변수를 묶음으로 저장
		
		//int형 변수에 100개의 값을 저장해야 할 때, 배열을 사용하는 경우 -> 편리함 외의 이점은 ?
		// 하나의 변수명에 값을 목록으로 관리하기 때문에 코드 가독성이나, 변수의 index 번호 접근 가능하기 때문에 개발자가 편리하다
		// 반복문 사용으로 특적 값을 가져오거나 수정 등이 가능한다.
		
		// 길이가 5인 배열 = int값 5개 저장 가능, index: 0~4
		int[] arr = new int[5]; //초기화하면 각 배열의 요소에는 디폴트값 0 생성
		
		// index 3에 100 저장해
		arr[3] = 100;
		
		System.out.println(arr); // 배열의 변수는 참조변수를 위한 공간 = 배열의 주소가 저장
		System.out.println(Arrays.toString(arr));
		
		// arr[3] 값을 변수에 저장해
		int val = arr[3];
		System.out.println(val);
		
//		arr[5] = 100; // 인덱스 범위 벗어나면?
//		System.out.println(Arrays.toString(arr));
		// ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

		// 길이가 0인 배열 = 값을 저장할 공간 x
		int[] arr2 = new int[0];
//		arr2[0] = 1;
		System.out.println(Arrays.toString(arr2)); // [] 출력
		
		
		
		
	}

}
