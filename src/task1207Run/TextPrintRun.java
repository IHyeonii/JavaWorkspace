package task1207Run;

import java.util.Arrays;
import java.util.StringTokenizer;

import task1207.CountStr;
import task1207.TextPrint;

public class TextPrintRun {
	public static void main(String[] args) {
		String str = "오늘부터 다시 시작하는 코딩";

		TextPrint tp = new TextPrint();
		String reverseVal1 = tp.strReverse(str);
		System.out.println(reverseVal1);

		String[] arr = tp.strReverseArr(str, "다시");
		System.out.println(Arrays.toString(arr));

		String reverseVal = tp.collectionReverse(str);
		System.out.println(reverseVal);

		System.out.println("-----문자열 길이-----");
		System.out.println(str.length()); // 15 : 공백 포함

		String[] strArr = str.split("");
		System.out.println(strArr.length); // 15 : 공백 포함
		
		System.out.println("-----대소문자 변환-----");
		String eng = "ABCDEFG";
		
		String smallEng = eng.toLowerCase();
		System.out.println(smallEng);
		System.out.println(smallEng.toUpperCase());
		
		System.out.println("--------중복문자 재거----------");
		String engLine = "aaslkdjfka";
		tp.removeDupliWord(engLine);

	}
}
