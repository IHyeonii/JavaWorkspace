package chap_04;

public class _01_If {
  public static void main(String[] args) {
    // 오후 2시 전에는 ok, 2시 이후는 주문 x
    int hour = 10; // 오전 10시

    if(hour < 14) { // 조건
      System.out.println("아아 +1"); // 참일 때 수행할 명령
    }
    System.out.println("주문 완료");

    hour = 15;
    if(hour < 14) { // 조건이 거짓이면
      System.out.println("아아 +1"); // 참일 때 명령 수행 안 되고
    }
    System.out.println("주문 완료"); // 이것만 출력

    System.out.println("조건 추가: 오후 2시 이전 && 모닝커피 안 마신 경우만 주문");

    hour = 10;
    boolean morningCoffee = false;

    if(hour < 14 && morningCoffee == false) {
      //참일 때 수행할 문장
      System.out.println(" 주문해 ~~");
    }
    System.out.println("여긴 참, 거짓 상관 없이 출력");

    if(hour > 14 && morningCoffee == false) {
      // 거짓이라 이 문장 출력 x
      System.out.println(" 주문해 ~~");
    }
    System.out.println("이 문장만 출력된다");


  }
}
