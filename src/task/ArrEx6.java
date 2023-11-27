package task;

import java.util.ArrayList;

public class ArrEx6 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 100; i++) {
      list.add(i);
    }
    // 55번째 부터 20번째 까지 출력
    // 배열의 사이즈가 2 -> index 0, 1
    // 배열의 사이즈가 10 -> index 0, 1 .... 8, 9
    for(int i = 54; i > 18; i--) {
      System.out.println(list.get(i));
    }
  }
}
