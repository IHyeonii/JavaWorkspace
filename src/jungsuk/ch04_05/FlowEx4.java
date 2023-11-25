package jungsuk.ch04_05;

public class FlowEx4 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		// 두가지 방법으로 배열 출력하기
		for(int val : arr) {
			System.out.println(val);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
