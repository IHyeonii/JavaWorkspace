package task1207Run;

import task1207.ArrEx;
import java.util.Arrays;
import java.util.List;

public class ArrRun {
	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}

		ArrEx arrEx = new ArrEx();
		// 배열에서 특정 숫자 찾기
		arrEx.findNumber(arr, 10);

		// 배열 뒤집기
		System.out.println("원본: " + Arrays.toString(arr));
		int[] reverse = arrEx.reverseArr(arr);
		System.out.println("reverse: " + Arrays.toString(reverse));

		// 배열의 최대값과 최소값 찾기
		arrEx.fineMN(arr);

		// 배열의 평균과 요소의 합
		arrEx.average(arr);

		// 중복값 제거
		int[] arr2 = {1, 3, 2, 2, 3, 5, 9, 9, 0, 2, 2, 5};
		System.out.println("arr2 길이: " + arr2.length); //12
		arrEx.removeDu(arr2);
		// 출력: [0, 1, 2, 3, 5, 9] // 근데 왜 정렬이 되지?

		System.out.println("------------배열의 특정 위치에 값 삽입하기-------------");
		// 배열, 인덱스와 삽입할 값을 넘겨주기
		// 삽입할 인덱스 위치
		int index = arr2.length / 2; //6

		// 삽입할 값
		int[] val = {0, 0, 0};
		List<Integer> list = arrEx.addValue(arr2, index, val);
		System.out.println(list);

		// 배열의 최빈값
		arrEx.findMode(arr2);

		// 배열의 홀수, 짝수의 개수 세기
		arrEx.countArr(arr2);

		// 이차원 배열의 합과 평균 계산
		// 선언과 동시에 초기화
		int[][] multiArr = {{1, 2, 3}, {4, 5, 6}}; // 2행 3열
		arrEx.multiArr(multiArr);

	}
}
