package chap_01;

public class _03_Variables {
  public static void main(String[] args) {
    // 변수 = 데이터(값)을 저장하는 공간

    // 배송 문자의 경우
    System.out.println("이현님, 배송이 시작됩니다.");
    System.out.println("이현님, 배송이 완료되었습니다.");

    // 내용이 반복되는 경우 -> "이현" 이름 부분을 변수로 저장해뒀다, 저장된 데이터로 출력 가능

    // 1. name 이라는 이름의 문자열 변수 선언
    String name;
    name = "이현"; // 오른쪽 값을 왼쪽 변수(객체)에 집어넣을게

    // name 이라는 문자열 변수는 "이현"이라는 값을 갖게 됨

    System.out.println(name + "님, 배송이 완료되었습니다.");

    // 2. 변수 선언과 동시에 초기화 가능
    String name2 = "이현";

    // 3. 정수형 변수 : int < Long
    int hour = 15;
    System.out.println(name2 + "님, 배송이" + hour + "시에 도착합니다.");

    // int 에 큰 값을 넣으려면
    Long l = 100000000000000L; // 뒤에 L을 안 붙여주면 int형 자료인 줄 알아
    System.out.println("Long 값은" + l);

    // 4. 실수 값 = double
    double score = 90.5;
    char grade = 'A'; // String 긴 문자열, char 한 글자 문자열 -> 작은 따옴표

    // float 에 실수값 넣으려면? -> 정밀한 소수 값 double 사용
    float f = 3.14F;

    // 위에 선언한 name 변수 그대로 사용, 값만 바꿔보자
    name = "전이현";
    System.out.println(name + "님, 이번 학점은" + grade + "세요.");

    // true, false -> boolean
  }
}
