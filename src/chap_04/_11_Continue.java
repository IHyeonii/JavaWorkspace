package chap_04;

public class _11_Continue {
  public static void main(String[] args) {
    // 치킨 노쇼 손님 있으면 다음으로 넘어가

    int max = 20; // 최대 판매 수량
    int sold = 0; // 현재 판매 수량
    int noShow = 17; // 대기번호 17번이 노쇼함

    for (int i = 1; i <= 50; i++) {
      System.out.println(i + "번 손님 .. 치킨 받아가여");

      // 노쇼 발생하면 어떻게 할래
      if (i == noShow) {
        System.out.println(i + "번 손님, 다음으로 넘어갑니다?");
        continue;
      }

      sold++; //판매처리
      if (sold == max) {
        System.out.println("재료소진여");
        break;
      }
    }
    System.out.println("영업 끝");


  }
}
