package chap_04;

public class _05_For {
  public static void main(String[] args) {

    // 반복문 사용
    for(int i = 0; i < 10 ; i++) { // 선언, 조건, 증감
      System.out.println("반복할 문장" +i); // i = 0~9까지 출력되고,
      // 9가 i++ -> 10 되고, 조건 부합하지 않아서 for문 빠져나옴
    }

    // 짝수만 출력하자 -> fori + 엔터
    for (int i = 0; i < 10; i += 2) {
      System.out.println("짝수 출력 +" + i); // 0, 2, 4, 6, 8
    }

    // 홀수만 출력
    for (int i = 1; i < 10; i += 2) {
      System.out.println("홀수 출력 +" +i); // 1, 3, 5, 7, 9
    }

    // 1 부터 10까지 합 = 55
    int sum = 0;

    for (int i = 1; i <= 10 ; i++) { // i < 11 동일
      sum += i;
      System.out.println("여기서 sout하면 증가되는 값 다 출력" +sum);
    }
    System.out.println("총 합은 여기서 =" + sum);






  }

}
