package task;

import java.util.ArrayList;
import java.util.List;

public class ArrEx3 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(9);
    list.add(4);
    list.add(0);
    list.add(10);

    // ArrEx2를 StringBuilder 사용해서 출력
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < list.size(); i++) {
      if (i == 0) {
        sb.append(list.get(i));
      } else {
        sb.append(",").append(list.get(i));
      }
    }
    System.out.println(sb.toString());
  }
}