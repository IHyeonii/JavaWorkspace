package java_edition3.ch02;

public class VarEx3 {
  public static void main(String[] args) {
    char ch = 'a';

    System.out.println(ch);

    //문자의 유니코드 알고싶으면?
    int code = (int) ch;
    System.out.println(code);

    int a = 5;
    a *= 2;
    System.out.println(a);

    a /= 2;
    System.out.println(a);

  }
}
