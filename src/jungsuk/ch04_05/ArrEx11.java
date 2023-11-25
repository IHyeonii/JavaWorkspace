package jungsuk.ch04_05;

import java.util.Arrays;

public class ArrEx11 {
	public static void main(String[] args) {
		// 길이가 10인 배열에 0-9 사이 임의의 값 저장
		// 해당 배열에 저장된 각각의 숫자가 몇 번 반복하는지 세어서 배열에 담아 
		int[] numArr = new int[10];
		int[] count = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random()*10);
		}
		
		for (int i = 0; i < numArr.length; i++) {
			count[numArr[i]]++;
		}
		System.out.println(Arrays.toString(numArr));
		System.out.println(Arrays.toString(count));
	
	}
}
