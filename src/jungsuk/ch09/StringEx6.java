package jungsuk.ch09;

public class StringEx6 { // 기본값 -> String 변환
	public static void main(String[] args) {
		int val = 100;
		String sVal = String.valueOf(val); // int -> String
		
		// double -> String
		double val2 = 200.0;
		String dVal = String.valueOf(val2);
		
		// String의 sVal, dVal을 형변환해서 더하기 => 반환타입은 double
		// 문자열을 형변환 할 때 
		double sum1 = Integer.parseInt("+"+sVal) + Double.parseDouble(dVal);
		double sum2 = Integer.parseInt(sVal) + Double.parseDouble(dVal);
		
		System.out.println(sum1); // 이것도 결과가 300.0
		System.out.println(sum2);
		
		// 소수점 첫째자리 까지만
		System.out.println(String.format("%s + %s = %.1f", sVal, dVal, sum2));
	}
}
