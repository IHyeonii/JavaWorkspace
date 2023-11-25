package jungsuk.ch04_05;

import java.util.Arrays;

public class ArrayEx1 {
	public static void main(String[] args) {
		// String은 참조변수 기본값 = null, int = 0
		// 참조형 = 기본형 타입 제외한 모두
		String[] arr = new String[3];
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = new int[3];
		System.out.println(Arrays.toString(arr2));
		
		// 기능 = 함수 = 메서드
		
		String str = "ABCDE";
		char ch = str.charAt(1); // 한 문자만 추출
		System.out.println(ch);
		
		// 문자열 일부 추출
		String temp = str.substring(1, 4);
		System.out.println(temp);
		
		char[] chArr = {'A', 'B', 'C'};
		String str1 = new String(chArr);
		System.out.println(str1);
		
		
		
		
	}
}
