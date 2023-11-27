package jungsuk.ch06;

class Data {
  int x;
}
public class PrimitiveParamEx {
  public static void main(String[] args) {
    Data d = new Data();
    d.x = 10;
    System.out.println("main의 x = " + d.x);

    // change 메서드 호출
    change(d.x);
    System.out.println("메서드 실행 후 x = " + d.x);
  }

  static void change(int x) {
    x = 1000;
    System.out.println("change() : x = " + x);
  }
}
