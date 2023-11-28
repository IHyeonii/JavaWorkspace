package task;

import java.util.Arrays;

public class ForEx3 {

  public static void main(String[] args) {
    int[] arr = {-5, -4, 3};
    int[] arr2 = {5, 4, 1};

    // arr 배열의 주소값을 복사
    arr2 = arr;

    // 이제 arr2와 arr이 같은 객체를 가르키기 때문에, index[2] 값이 수정 됨
    arr2[2] = 9;

    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr2));

  }
}
