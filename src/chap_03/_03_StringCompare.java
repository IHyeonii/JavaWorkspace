package chap_03;

public class _03_StringCompare {
  public static void main(String[] args) {
    // 문자열 비교
    String s1 = "Java";
    String s2 = "Python";

    System.out.println(s1.equals(s2)); // false
    System.out.println(s1.equals("Java")); // true
    System.out.println(s1.equals("java")); // false -> 대소문자 구분

    // true -> 대소문자 구분 없이 문자열 내용이 동일한지 체크
    System.out.println(s1.equalsIgnoreCase("java"));

    // 문자열 비교 심화 -> 비번 동일한지
    s1 = "1234"; // 제공된 번호
    s2 = "1234"; // 입력한 번호
    System.out.println(s1.equals(s2)); //true -> 내용 비교
    System.out.println(s1 == s2); //true -> 참조 비교

    // s1, s2 참조하는 곳(메모리 공간) 달라
    s1 = new String("1234");
    s2 = new String("1234");
    System.out.println(s1.equals(s2)); // 내용 -> true
    System.out.println(s1 == s2); // 참조 -> false




  }
}
