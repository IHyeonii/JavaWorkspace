package task;

import java.util.ArrayList;

public class ArrEx5 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(3);
    list.add(7);
    list.add(4);
    list.add(2);
    list.add(5);
    list.add(8);
    list.add(9);

    // sum >= 15 -> break; 원하는 값은 14

    int sum = 0;

    for(int i = 0; i < list.size(); i++) {
      int check = sum + list.get(i);

      if (check >= 15) {
        break;
      }
      sum = check;
    }
    System.out.println(sum);
  }

  // 기존코드는 무조건 sum += list.get(i) -> 16이 출력 됨
}
