package chap_02;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    // 키보드로 데이터 입력받을 때 = System.in
    // Scanner 클래스 사용하면 데이터 쉽게 입력받을 수 있음

    // 1. System.in 객체와 연결된 Scanner 객체 생성
    Scanner in = new Scanner(System.in);
    int x = in.nextInt(); // 키보드로 입력한 정수 데이터를 변수에 대입
    int y = in.nextInt();

    System.out.printf("%d * %d은 %d 입니다.", x, y, x * y);
    // 콘솔창에 x, y 값 입력하면 출력 됨
  }
}
