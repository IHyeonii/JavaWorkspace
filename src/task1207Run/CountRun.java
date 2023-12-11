package task1207Run;

import java.io.IOException;
import java.util.StringTokenizer;

import task1207.CountStr;

public class CountRun {
	public static void main(String[] args) {
		String str = "오늘부터 다시 시작하는 코딩";

		// 구분자 지정X -> 공백을 기본 구분자로 나눠줌
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st.countTokens()); // 4개

		System.out.println("-----공백을 포함하지 않고 한 글자씩 세기-----");
		CountStr count = new CountStr();
		count.countStr(str);

		// 특정 문자 개수 세기
		String path = "C:\\Users\\qbic\\Desktop";
		String fileNm = "specificChar.txt";
		try {
			count.specificChar(path, fileNm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
