package jungsuk.ch04_05;

import java.util.Arrays;

public class ArrEx7 {
	public static void main(String[] args) {
		//배열 생성 후 0 ~9 값으로 초기화
		int[] arr1 = new int[10];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
		}
		
		System.out.println(Arrays.toString(arr1));
		
		// random 함수로 배열의 임의의 위치의 값과 배열 첫 번째 요소값을 교환하는거 5번 수행
		for (int i = 0; i < 100; i++) {
			
			// 더블타입. 0.0~1.0까지 -> 0~9까지 임의 값 얻으려면 *10 하고 int 형변환해
			int num = (int) (Math.random()*10);
			int temp = arr1[0]; // temp에 0번째 값을 저장하고
			arr1[0] = arr1[num]; // 0번째 값에 랜덤값을 저장
			arr1[num] = temp; // 랜덤값에는 0번째 값을 저장하는걸 5번 반복
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}		
	}
}
