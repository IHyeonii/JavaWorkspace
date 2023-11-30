package jungsuk.ch08;


public class ThrowEx {
	public static void main(String[] args) {
		ThrowEx ex = new ThrowEx();
		
		try {
			ex.test1();  // 5. 컴파일에러
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
	}
	
	void test1() throws Exception {
		System.out.println("테스트중");
		test2(); // 4. 호출하면 컴파일 에러 -> try - catch 하거나, throws로 또 던져줄 수 있어
	}
	void test2() throws Exception { // 3. throws 사용하면, 이 메서드 호출하는 쪽으로 예외처리를 넘긴다. 왜 ??
		throw new Exception(); // 1. 고의로 예외 `생 -> 컴파일 에러
	}
}

// 2. 예외 처리하는 방법
// 2-1. Try-catch 문
// 2-2. 메서드에 예외를 선언(throws)
