package jungsuk.ch08;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int num = 100;
		int result = 0;

		ExceptionEx2 ex = new ExceptionEx2();

		// 예외처리 안 된 test1 호출 -> 컴파일 에러
		// 여기서도 throws Exception으로 예외처리를 JVM에 넘기거나
		// try - catch 로 내가 원하는대로 처리 가능
		try {
			ex.test1(num, result);
		} catch (Exception e) {
			// 나는 예외처리나는 부분 "0"으로 출력하고 싶어
			System.out.println("0");
		}
		
		System.out.println("------------ 구분선 --------------");

		// 예외처리 하고 넘기면, 호출한 메소드에선 예외 발생한 지 몰라
		// 그리고 지금 코드는 예외 발생 직전까지만 숫자 출력
		ex.test2(num, result);

	}

	// 랜덤값 0으로 정수 나누게 될 경우 예외처리 필요
	// 1. 예외를 던져 줄 수도 있고
	void test1(int num, int result) throws Exception {

		for (int i = 0; i < 10; i++) {
			result = num / (int) (Math.random() * 10);
			System.out.println(i + ":" + result);
		}
	}

	// 2. 예외를 처리하고 줄 수도 있어
	void test2(int num, int result) {
		for (int i = 0; i < 10; i++) {
			try {
				result = num / (int) (Math.random() * 10);
				System.out.println(i + ":" + result);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
