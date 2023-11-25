package jungsuk.ch04_05;

import java.util.Arrays;

public class ArrEx10 {
	public static void main(String[] args) {
		// 길이가 10인 배열에 0-9 사이 임의의 값 저장
		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random()*10);
		}
	
		// 버블정렬 알고리즘 -> 크기순으로 정렬
		System.out.println(Arrays.toString(numArr));
		
		// 배열의 마지막은 최대값이니까 그 전까지만 반복
		for(int i = 0; i < numArr.length-1; i++) { // 이 코드는 정렬을 한번만하고 끝나.			
			if (numArr[i] > numArr[i+1]) {
				int temp = numArr[i];
				numArr[i] = numArr[i+1]; // 값 변경하고
				numArr[i+1] = temp;
			} // i번째 값이 i+1보다 클 때만 수행, 그렇지 않으면 문장 수행 안 하고 기존 값 유지
		}
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(numArr));
		
		System.out.println("-----------------------------------");
		for(int i = 0; i < numArr.length-1; i++) {	//처음 반복에서 마지막 배열에 가장 큰 값이 들어감
			for(int j = 0; j < numArr.length-1-i; j++) { // 두 번째부턴 마지막 값을 제외해나가도 된다. 
				if (numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1]; // 값 변경하고
					numArr[j+1] = temp;
				}
			}
		}
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(numArr));
	
	}
}
