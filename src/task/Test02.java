package task;

import java.util.ArrayList;

public class Test02 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(3);

    // Sum함수를 사용해보자

    int sum1 = ArrayTest.Sum(list);
    System.out.println(sum1);
  }
}
