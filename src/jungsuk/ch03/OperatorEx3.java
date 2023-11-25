package jungsuk.ch03;

public class OperatorEx3 {
  public static void main(String[] args) {
    // i는 2의 배수 또는 3의 배수
    int i = 10;

    if (i%2 == 0 || i%3 == 0){
      System.out.println(i);
    }

    int j = 5;
    if (j%2 == 0 || j%3 == 0){
      System.out.println(j);
    } else {
      System.out.println("틀렸어");
    }
  }
}
