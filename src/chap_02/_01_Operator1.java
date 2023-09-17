package chap_02;

public class _01_Operator1 {
  public static void main(String[] args) {
    // 증감연산
    int val = 10;

    // 1을 더한 다음 연산해
    System.out.println(++val); // 11출력

    // 연산 하고 1을 더해
    System.out.println(val++); // 11출력

    // 은행 대기번호
    int waiting = 0;
    System.out.println("대기 인원 : " + waiting++); // 대기인원 : 0
    System.out.println("대기 인원 : " + waiting++); // 대기인원 : 1
    System.out.println("대기 인원 : " + waiting++); // 대기인원 : 2
    System.out.println("총 대기 인원 : " + waiting); // 총 대기인원 : 3
  }
}
