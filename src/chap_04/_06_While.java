package chap_04;

public class _06_While {
  public static void main(String[] args) {
    // For문 -> 정해진 횟수만큼 반복할 때 사용

    // 명확한 횟수 모를 땐 -> while문 사용

    // 수영장에서 25미터 다다를때까지 반복
    int distance = 25; //전체 거리
    int move = 0; //현재 이동 거리

    while (move < distance) { // 조건이 참인동안 반복을 수행
      System.out.println("발차기 계속 해");
      System.out.println("현재 이동 거리 =" + move); // 처음은 0
      // 값이 24 됐을때까지 출력하고, 그 다음 27은 거짓이라 반복문 탈출해서 "도착" 출력
      move += 3; // 3m씩 이동 가정
    }
    System.out.println("도착");
  }
}
