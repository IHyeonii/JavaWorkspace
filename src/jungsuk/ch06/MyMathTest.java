package jungsuk.ch06;

public class MyMathTest {
  public static void main(String[] args) {
    // 2. MyMath 클래스의 메서드 사용하려면 -> 인스턴스 생성해야 함
    MyMath m = new MyMath();
    long val = m.add(2L, 3L);
    System.out.println(val);
  }
  long multiply(long a, long b) {
    return  a * b;
  }
  double divide(double a, double b) {
    // 1. 같은 클래스 내의 메서드끼린 참조변수 없이 호출 가능
    multiply(1L, 2L);
    return  a / b;
  }
}

class MyMath {
  long add(long a, long b) {
    return  a + b;
  }
  long subtract(long a, long b) {
    return  a - b;
  }
}
