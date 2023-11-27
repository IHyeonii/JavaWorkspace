package jungsuk.ch06;

class MyMath2 {
  long a, b;
  long add() {
    return a + b;
  }
  // 오버로딩: 매개변수 개수나 타입 다르면 이름이 같아도 다른 메서드로 정의
  static long add(long a, long b) {
    return a + b;
  }
}

public class MyMathTest2 {
  public static void main(String[] args) {

  }
}
