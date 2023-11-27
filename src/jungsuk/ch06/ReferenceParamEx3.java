package jungsuk.ch06;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReferenceParamEx3 {
  public static void main(String[] args) {
    int[] arr = {3, 2, 1, 6, 5, 4};
//    System.out.println(Arrays.toString(arr)); //여기서 배열의 값을 보려면 Arrays.toStirng 필요
    // arr은 배열의 값이 저장된 주소를 들고 있어서
    // 근데, 아래 printArr 메서드에서 Arrays 필요 없는 이유는 -> 반복문으로 값을 꺼낸거라 출력 가능
    printArr(arr);
    sortArr(arr);
    printArr(arr);
    System.out.println("sum= " + sumArr(arr));
  }

  // 배열의 모든 요소 출력 -> 배열을 넘겨받아서, sout
  static void printArr(int[] arr) {
    for (int print : arr) {
      System.out.print(print);
    }
    System.out.println();
  }

  // 배열의 모든 요소 합
  static int sumArr(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  // 배열을 오름차순 정렬
  static void sortArr(int[] arr) {
      Arrays.sort(arr);

    // 기본이 오름차순 정렬, 내림은 reverse -> Integer만 가능하네
//      Integer[] arr2 = {3, 2, 1, 6, 5, 4};
//      Arrays.sort(arr2, Collections.reverseOrder());
  }
}
