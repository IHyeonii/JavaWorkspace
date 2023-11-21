package chap_04;

public class _08_NestedLoop { // 이중 반복문
  public static void main(String[] args) {

    /* ...별(*) 사각형 만들기 = 가로 5번, 세로 5번

    *****
    *****
    *****
    *****
    *****

    */

    for (int i = 0; i < 5; i++) { // 0 1 2 3 4 = 5번 수행
      System.out.print("*");
      System.out.print("*");
      System.out.print("*");
      System.out.print("*");
      System.out.print("*"); // 줄바꿈 없이 5번 연속

      System.out.println(); // 그 다음 줄바꿈 => 원하는 결과 나옴
    }

    System.out.println("구분선-------");

    for (int i = 0; i < 5; i++) { // 0 1 2 3 4 반복
      for (int j = 0; j < 5; j++) {
        System.out.print("*"); // 5번 수행하고
      }
      System.out.println(); //여기서 줄바꿈을 5번
    }

    System.out.println("별 왼쪽 삼각형 만들기");

    // 첫 반복문은 줄 바꿈 역할
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i+1; j++) { // i = 0; j = 1, 2, 3, 4, 5 실행
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("오른쪽으로 삼각형 만들기");
  }
}
