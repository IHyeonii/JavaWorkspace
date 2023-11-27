package task;

import java.util.ArrayList;
import java.util.List;

public class ArrEx2 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(9);
    list.add(4);
    list.add(0);
    list.add(10);

    // 콤마 구분자로 출력하되, 마지막 숫자를 콤마 없이
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i));

      if (i < list.size() - 1) {
        System.out.print(",");
      }


    }
  }
}