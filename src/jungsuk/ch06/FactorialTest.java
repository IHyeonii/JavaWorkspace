package jungsuk.ch06;

public class FactorialTest {
  public static void main(String[] args) {
    // 팩토리얼 구현: 5! = 5 * 4 * 3 * 2 * 1 = 120

  // static 없으면 이렇게 인스턴스 생성해줘야 호출 가능
//    FactorialTest t = new FactorialTest();
//    t.factorial(5);

    System.out.println(factorial(5));

  }
  static int factorial(int n) {
    int result = 0;

    if (n == 1) {
      result = 1;
    } else {
      result = n * factorial(n -1); // 재귀호출 = 무한반복
    }
    return result;
  }
}
