package chap_03;

public class _02_String2 {
  public static void main(String[] args) {
    String s = "공부를 하는 것도 안 하는 것도 아닌 고 통 ...."; // 29chars

    // 문자열 변환 : 도 -> 콤마로 바꿔보자
    System.out.println(s.replace("도", ","));

    // 시작위치와 끝 위치 지정해서 출력
    System.out.println(s.substring(4)); // 인덱스 기준 7부터 시작 (이전 내용 출력x)

    // indexOf 로 찾으려는 문자열 위치를 찾아서 사용 가능
    System.out.println(s.substring(s.indexOf("고"))); // 고 통 .... 출력

    // 시작 위치는 시작 단어를 포함하지만, 끝 위치는 그 직전까지 출력
    System.out.println(s.substring(s.indexOf("고"), s.indexOf(".")));

    // 공백 제거
    s = "        하기 싫어.     ";
    System.out.println(s.trim()); // 앞 뒤 공백 제거

    // 문자열 결합
    String s1 = "Java";
    String s2 = "왜";
    System.out.println(s1 + s2); // Java왜
    System.out.println(s1.concat(", ").concat(s2)); // Java, 왜
  }
}
