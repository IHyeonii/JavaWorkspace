package chap_04;

public class _10_Break {
  public static void main(String[] args) {
    // 치킨 10마리만 판매, 1인당 1마리만 구매 가능
    // 손님은 20명 대기

    int max= 10;

    for (int i = 1; i <= 20; i++) {
      System.out.println(i + "번 손님 치킨요");

      if(i == max) {
        System.out.println("금일 재료소진. 끝 ~~~");
        break; // 반복문 탈출
        // break 없으면, if문 실행하고 그 다음 for문 반복함
      }
    }
    System.out.println("영업 종료"); // for 문 밖에서
  }
}
