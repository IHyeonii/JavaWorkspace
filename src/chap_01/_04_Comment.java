package chap_01;

public class _04_Comment { //주석 편
  public static void main(String[] args) {
    System.out.println("(10분 전) 잠시 후 결혼식, 착석해");

    // 위 문장에서 Ctrl+D -> 같은 문장 복사 됨
    System.out.println("(5분 전) 잠시 후 결혼식, 착석해");
    System.out.println("이제 시작할거야");

    // size 120을 130으로 변경해보자
    int size = 120;
    size = size + 10; // 오른쪽 값이 왼쪽 변수에 들어간다.
    System.out.println("사이즈는" + size + "으로 보여줘");

    // 여러 줄 주석 -> ctrl + shift + /
  }
}
