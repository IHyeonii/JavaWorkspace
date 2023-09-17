package weekendStudy.ch04;

public class LocalVariable {
  public static void main(String[] args) { // 메인 메서드

    // 지역변수 = 매개변수, 메서드 내부, for문 등 내부블록에 선언 된 변수
    int a = 0; // 지역변수 선언과 초기화
    double b;

    System.out.println("a="+ a);
//    System.out.println("b="+ b); 지역변수는 기본값 없어서 초기화 안 하면 사용 불가

    for(int e = 0; e < 10; e++) {
//      int a = 1; 이미 선언 된 지역변수 = 블록 달라도 사용 불가
      System.out.println(e); // for문의 지역변수 e
    }
  }
}
