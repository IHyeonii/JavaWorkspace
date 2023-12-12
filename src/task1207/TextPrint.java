package task1207;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TextPrint {
  // 문자열 거꾸로 출력하기
  public String strReverse(String str) {
    // 반복문으로 바꿔서 다시 작성
    StringBuffer sb = new StringBuffer(str);
    String reverse = sb.reverse().toString();

    return reverse;
  }

  public String[] strReverseArr(String str, String reverseChar) {
//		String[] strArr = str.split(""); // 한 글자씩 배열에 담김 -> [오, 늘, 부, 터, ,] 공백을 문자로 포함
    String[] strArr = str.split(" "); // [오늘부터, 다시, 시작하는, 코딩]

    for (int i = 0; i < strArr.length; i++) {
      if (strArr[i].equals(reverseChar)) {

        StringBuffer sb = new StringBuffer(strArr[i]);
        String reverse = sb.reverse().toString();
        strArr[i] = reverse;
      }
    }
    return strArr;
  }

  public String collectionReverse(String str) { // 이건 14장 람다와 스트림 하고 다시볼 것
    // 빈 ArrayList 생성
    List<Character> list = new ArrayList<>();

    // 문자열의 각 문자를 ArrayList에 추가
    for (char ch : str.toCharArray()) { // 한 문자씩
      list.add(ch);
    }

    // ArrayList의 요소가 반전
    Collections.reverse(list); // 배열에 담긴게 출력 됨

    // ArrayList를 문자열로 변환
    String reverseStrValue = list.stream().map(String::valueOf).collect(Collectors.joining());
    return reverseStrValue;
  }

  public void removeDupliWord(String str) { // 좀 더 생각해보기 !
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {

      char start = str.charAt(i);

      if ((sb.indexOf(String.valueOf(start)) == -1)) {
        // 중복값 있으면 해당 문자의 인덱스를
        // 중복값 없으면 -1 반환
        sb.append(start);
      }
    }
    System.out.println(sb.toString());

    /**
     * 처음 내 코드
     * if ((str.indexOf(str.charAt(i)) == -1)) {
     * sb.append(str.charAt(i));
     */
  }

  public void convert(int num) {
    // 1. 숫자를 하나씩 끊어서 -> 문자로 변환
    String str = Integer.toString(num);
    String[] arr = str.split("");
    System.out.println(Arrays.toString(arr));

    for (int i = 0; i < arr.length; i++) {

      // switch문의 제약조건: 조건식은 정수
      switch (arr[i]) {
        case "1" :
          System.out.print("일");
          break;

        case "2" :
          System.out.print("이");
          break;

        case "3" :
          System.out.print("삼");
          break;

        case "4" :
          System.out.print("사");
          break;

        case "5" :
          System.out.print("오");
          break;

        case "6" :
          System.out.print("육");
          break;

        case "7" :
          System.out.print("칠");
          break;

        case "8" :
          System.out.print("팔");
          break;

        case "9" :
          System.out.print("구");
          break;
      }
    }
  }


}
