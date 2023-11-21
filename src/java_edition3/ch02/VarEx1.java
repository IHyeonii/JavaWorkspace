package java_edition3.ch02;

public class VarEx1 {
  // 두 변수의 값 교환하기
  public static void main(String[] args) {
    int x = 10;
    int y = 20;

//    if(x != y) {
//      x = y;
//      y = x;
//    }

    System.out.println(x + "," + y); // 20, 20

    // 임시 저장소 필요
    int temp = x; // temp == 10;

    x = y;
    y = temp;

    System.out.println(x + "," + y);
  }
}
