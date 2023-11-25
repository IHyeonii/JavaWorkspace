package jungsuk.ch02;

import java.math.BigInteger;

public class OverFlow {
	public static void main(String[] args) {
		// 오버플로우 방지
		
		//1. 정수타입 허용범위 확인
		System.out.printf("byte: %d ~ %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("short: %d ~ %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("int: %d ~ %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("long: %d ~ %d%n",Long.MIN_VALUE, Long.MAX_VALUE);

		System.out.println("------ 구분선--------");
		// 백단위 소수점 추가
		System.out.printf("short: %,d ~ %,d%n", Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("int: %,d ~ %,d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("long: %,d ~ %,d%n",Long.MIN_VALUE, Long.MAX_VALUE);
		
		System.out.println();
		System.out.println("------ BigInteger--------");
		//2. 연산하는 경우 -> BigInteger 클래스 사용
		// 정수를 문자열로 저장 -> 무한한 숫자를 저장
		BigInteger bi1 = new BigInteger("1000000000"); //문자열로 값을 줘야 함
		BigInteger bi2 = new BigInteger("1000000");
		
		System.out.printf("덧셈: %,d%n", bi1.add(bi2));
		System.out.printf("뺄셈: %,d%n", bi1.subtract(bi2));
		System.out.printf("곱셈: %,d%n", bi1.multiply(bi2));
		System.out.printf("나눗셈: %,d%n", bi1.divide(bi2));
		System.out.printf("나머지: %,d%n", bi1.remainder(bi2));

	}

}
