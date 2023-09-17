package chap_03;

public class _01_String1 {
  public static void main(String[] args) {
    String str = "공부를 하는 것도 안 하는 것도 아닌 고 통 ...."; // 29chars
    System.out.println(str);

    // 문자열 길이
    System.out.println(str.length()); // 29 출력

    // 문장 사이 어떤 값이 포함되어 있는지
    System.out.println(str.contains("공부")); // true 출력
    System.out.println(str.contains("Java")); // false

    // 포함되는 경우, 문장의 시작 위치
    System.out.println(str.indexOf("공부")); // 위치정보 = 0, 첫 번째 위치 0부터
    System.out.println(str.indexOf("Java")); // 포함되지 않는 경우 -1 반환

    // 처음 일치하는 위치 정보
    System.out.println(str.indexOf("것")); // 7번째에 위치

    // 마지막에 일치하는 위치 정보
    System.out.println(str.lastIndexOf("것")); // 15번째 위치

    // 문장의 시작문구, 끝 문구 확인
    System.out.println(str.startsWith("공부")); // 이 문자열로 시작하면 true, 아니면 false
    System.out.println(str.endsWith(".")); // 이 문자열로 끝나면 true, 아니면 false
  }
}
