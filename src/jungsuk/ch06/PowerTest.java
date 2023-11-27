package jungsuk.ch06;

public class PowerTest {
  public static void main(String[] args) {
    int x = 2;
    int n = 5;
    long result = 0;

    for(int i = 1; i <= n; i++) {
      result += power(x, i);
    }
    System.out.println(result);

  }
  // x^1 ~ x^n 합 구하기
  static long power(int x, int n) {
    if (n == 1) {
      return x;
    }
   return x * power(x, n-1);
  }
}
/*
* i = 1; -> x = 2
* i = 2; -> x = 2 * 재귀(2, 2-1) -> 2 * 2
* i = 3; -> x = 2 * 재귀(2, 3-1=2) -> 2 * 2 * 재귀(2, 2-1) -> 2^3
* */