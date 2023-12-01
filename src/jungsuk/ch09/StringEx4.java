package jungsuk.ch09;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringEx4 {
	public static void main(String[] args) {
		String animals = "d,cat,bear";
		String[] arr = animals.split(",");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/", "[","]");
		StringJoiner sj2 = new StringJoiner("/");
		
		for (String s : arr) {
			sj.add(s);
			sj2.add(s);
		}
		System.out.println(sj.toString()); // 출력: [d/cat/bear]
		System.out.println(sj2.toString()); // 출력: d/cat/bear
	}
}
