package task;

import java.util.ArrayList;

public class ArrayTest {
  public static void main(String[] args) { // static =
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);

    // list에 데이터를 1~10까지 넣고 -> 합계 구해

    for(int i = 0; i <= 10 ; i++) {
      list.add(i);
    }

    int size = list.size();
    System.out.println("list 개수=" + size);

    // 클래스 사용하려면 선언해라
//    task.ArrayTest test = new task.ArrayTest(); // 호출하려면 클래스의 생성자가 필요해
//    int sum = test.Sum(new ArrayList<>(list));
//    System.out.println("호출한 값" + sum);

    int sum = Sum(new ArrayList<>(list));
    System.out.println("호출한 값" + sum);
  }
  public static int Sum(ArrayList<Integer> list) { // ArrayList는 타입 명시가 기본이잖아. 이걸 안 써주면
    // 매개변수로 리스트를 받아서 여기서 sum 출력해
   int sum = 0;

//    for(int i = 0; i < list.size(); i++) {
//      sum += list.get(i);
//    }

    for(int j : list) { // 그럼여기서 문자인지 뭔지 모르니까 Object 타입이 넘어온거야
      sum += j;
    }

//    System.out.println(sum);
    return sum;
  }
}
