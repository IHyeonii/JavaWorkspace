package jungsuk.ch09;

public class StringEx7 {
	public static void main(String[] args) {
		// Hello.java 문자열에서 소수점 이전의 문자, 소수점 이후의 문자 추출하기
		
		String str = "Hello.java";
		
		// substring 으로 추출
		// 소수점 위치를 찾아야 함
		
		int point = str.indexOf('.');
		System.out.println(point); // indexNum = 5;
		
		String first = str.substring(0, point); // 시작~ 끝 위치 전까지
		String end = str.substring(point+1); //시작위치부터 끝까지
		System.out.println("first=" + first);
		System.out.println("end=" + end);
	}
}
