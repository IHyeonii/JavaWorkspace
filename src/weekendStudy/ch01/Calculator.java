package weekendStudy.ch01;

public class Calculator {
  public static void main(String[] args) {
    // 더하기 빼기 곱하기 나누기 하고 결과 리턴해주는 메소드 생성

    // 클래스는 클래스고, 객체랑은 달라
    Calculator calc = new Calculator();
    System.out.println(calc.add(5, 10));

    int a = 10;
    int b = 8;
    System.out.println(calc.subtract(a, b));
    System.out.println(calc.multiply(a, b));
    System.out.println(calc.divide(b, a)); // 0
  }

  // 메소드는 클래스 안에 소속, main 문 밖에 선언
  public int add(int num1, int num2) {
    return num1 + num2;
  }
  public int subtract(int num1, int num2) {
    return num1 - num2;
  }
  public int multiply(int num1, int num2) {
    return num1 * num2;
  }
  public int divide(int num1, int num2) {
    return num1/num2;
  }
}
