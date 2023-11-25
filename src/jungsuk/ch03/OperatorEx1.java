package jungsuk.ch03;

public class OperatorEx1 {
  public static void main(String[] args) {
    // 전위, 후위 -> 단독사용일 땐 차이x

    int i = 5, j = 0;

    j = i++;
    System.out.println(i); // 6
    System.out.println(j); //5

    i = 5;
    j =0;

    j = ++i;
    System.out.println(i); //6
    System.out.println(j); //6

    // 전위형 ++i : 변수값 증가시킨 후 읽어오고
    // 후위형 i++ : 변수값을 읽어온 후 증가
  }
}
