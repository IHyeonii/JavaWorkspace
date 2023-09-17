package chap_02;

public class _05_Operator5 {
  public static void main(String[] args) {
    // 삼항 연산자
    // 결과변수 = ( 조건 ) ? (참인경우 ) : (거짓인 경우)

    int x = 3;
    int y = 5;
    int max = ( x > y) ? x : y;
    System.out.println(max);

    boolean value = ( x > y) ? true : false;
    System.out.println(value);
  }
}
