package task;

import java.util.Arrays;

public class ForEx2 {
  public static int test() {
    int[] arr = {-5, -4, 3, 2, 1, 1, 2, 3, 4, 5};

    // 배열의 복사, 오리지널 배열과 배열 길이를 지정해야 함, 길이 크기 5로 하면 크기가 5인 배열로 생성
    int[] arr2 = Arrays.copyOf(arr, arr.length);
    System.out.println(Arrays.toString(arr2));


    int val = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] > 0) {
        //val = arr[i];
        return val = arr[i];

        // return문 뒤에는 다른 코드 올 수 없음
      }
    }
    return -1;
  }
  public static void main(String[] args) {

    System.out.println(test());
  }
}
