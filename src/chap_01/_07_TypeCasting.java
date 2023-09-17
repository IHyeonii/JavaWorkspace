package chap_01;

public class _07_TypeCasting { //형변환
  public static void main(String[] args) {
    // 1. 정수형 -> 실수형
    int score = 93;
//    score = score + 98.8; // 에러 -> 연산 결과는 실수인데 변수가 정수형이라

    // (원하는 형태 자료형)변수명
    System.out.println((double)score); // 93.0출력

    // 2. 실수형 -> 정수형
    float score_f = 93.3F;
    double score_d = 93.8;
    System.out.println((int)score_f); // 93출력
    System.out.println((int)score_d); // 93출력

    // 3. 정수 + 실수 연산 -> 정수형 변수에 값 넣으려면 실수를 정수로
    score = 93 + (int) 98.8;

    // 4. 정수 + 실수 = 실수라, 실수형 변수에 오류없이 들어감
    score_d = 93 + 98.8;

    // 5. 변수에 형변환 된 데이터 집어넣기
    double convertDouble = score; // 더블 변수에 정수형 데이터 들어감 : 191 -> 191.0 으로 자동 형변환

    // int -> long -> float -> double 로 가면 자동 형변환 된다.
    // 큰 값(double) -> .. -> 작은 값(int) : 수동 형변환 시켜

    // 6. 숫자 -> 문자열로
//    String s1 = 93;
    String s1 = String.valueOf(93); // String 클래스가 제공하는 valueOf 사용
    System.out.println(s1);

    // 6-1.
    s1 = Integer.toString(98);
    System.out.println(s1);

    // 7. 문자열 -> 숫자
    int i = Integer.parseInt("95"); // 문자열을 파싱한다.
    System.out.println(i);
  }
}
