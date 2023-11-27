package task;

import java.util.ArrayList;

public class ArrEx4 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(3);
    list.add(7);
    list.add(4);
    list.add(2);
    list.add(5);
    list.add(8);
    list.add(9);

    // get을 호출하는데 드는 시간이 존재
    // get 호출을 최대한 줄여보자 -> 처음엔 10회였어

    int preVal = list.get(0);

    for(int i = 1; i < list.size(); i++) {
      int nextVal = list.get(i);

      if(Math.abs(preVal-nextVal) == 3) {
        System.out.println(preVal);
      }
      preVal = nextVal; // 이 코드를 증감식 옆에 작성해주는게 continue; 걸리지 않아서 좋아
    }
  }
}
