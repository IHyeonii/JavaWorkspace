package chap_04;

public class _03_ElseIf {
  public static void main(String[] args) {
    // 한라봉 에이드 있으면 한 잔 주문하고
    // 없으면, 망고주스
    // 이것도 없으면 아아 주문해줘

    boolean hallabong = true;
    boolean mango = true;

    if (hallabong == true) { // 얘가 참이면
      System.out.println("한라봉 주문"); // 이 문장만 출력하고
    } else if (mango == true) {
      System.out.println("망고 주문");
    } else {
      System.out.println("아아");
    }
    System.out.println("끝~~~"); // if문 빠져나옴

    System.out.println("----조건 2");
    hallabong = false;

    if (hallabong == true) { //거짓이면
      System.out.println("한라봉 주문");
    } else if (mango == true) { // 이리로 와서
      System.out.println("망고 주문"); // 출력하고
    } else {
      System.out.println("아아");
    }
    System.out.println("끝~~~"); // if문 빠져나옴

    // else if 여러번 사용 가능
  }
}
