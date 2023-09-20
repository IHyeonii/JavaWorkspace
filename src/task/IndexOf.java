package task;

public class IndexOf {
  public static void main(String[] args) {
    String str = "LINESTRING (124.71740503299382 37.82432241942286, 124.71664903321634 37.823676635159025) b2b";
    String str2 = "abcdef";


    int start = str.indexOf('(');
    int end = str.indexOf(')');
    int find = str2.indexOf('c');
    int find2 = str2.indexOf('b');
    System.out.println("find = " + find);
    System.out.println("find = " + find2);

    // indexOf = 왼쪽부터 문자열이나 char 찾는다.
    // 값이 없으면 -1 출력
    System.out.println(str.indexOf(4)); // 4가 8개 있는뎅
//		System.out.println(str.inde);
    System.out.println(str.indexOf('(')); // 괄호가 포함 된 인덱스값 출력 -> 이걸 사용하면 되지 않을까아
    System.out.println(str.indexOf(')'));

    String result = str.substring(start, end);
    System.out.println(result);
  }
}
