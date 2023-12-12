package task1207Run;

import task1207.Number;

public class NumberRun {
	public static void main(String[] args) {
		// 1. 구구단
		Number number = new Number();
		number.gugudan();
		
		System.out.println("---------- 구분선 ----------");
		number.gugudanUpdate();
		
		System.out.println("---------- lotto ----------");
		number.lotto();

		System.out.println("---------- 날짜, 시간 출력 ----------");
		number.Calendar(3); // 년도도 바뀜

		System.out.println("---------- 소수점 이하 자릿수 반올림하기 ----------");
		double result = 10 / 3.0;

		System.out.println(result); // 3.3333333333333335
		System.out.printf("%.2f", result); //3.33

		System.out.println();
		System.out.println("---------- 온도변환 ----------");
		// 섭씨 온도를 매개변수로 받아 화씨 온도로 변환
		// 섭씨 범위: 0 ~ 100
		double f = number.convertC(20);
		System.out.println("convert: " + f);

		//섭씨 -40도부터 ~ 100도까지 5도 단위로 : 반복문

	}
}
