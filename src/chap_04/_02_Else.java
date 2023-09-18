package chap_04;

public class _02_Else {
  public static void main(String[] args) {
    int hour = 10;
    if (hour < 14) { //오후 2시 전이면
      System.out.println("아아 주문하고");
    } else { // 그 외의 경우
      System.out.println("이 문장이 수행된다");
    }
    System.out.println("여긴 if문 밖 -> 항상 출력");

    if (hour > 14) { //오후 2시 전이면
      System.out.println("아아 주문하고");
    } else { // 그 외의 경우
      System.out.println("이 문장만 수행된다");
    }
  }
}
