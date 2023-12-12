package jungsuk.ch04_05;

import java.util.Arrays;

public class MultiArr  {
  public static void main(String[] args) {
    // 2차원 배열 선언만 하면
    // 4행 3열의 공간에 int 기본값 0 저장
    // 1행: {0, 0, 0}
    // 2행: {0, 0, 0}
    // 3행: {0, 0, 0}
    // 4행: {0, 0, 0}
    // 행, 열의 index는 0부터 시작해서 길이-1
    int[][] arr1 = new int[4][3];

    // 선언과 동시에 초기화
    int[][] arr2 = {{1, 2, 3}, {4, 5, 6}}; // 2행 3열
    System.out.println(Arrays.deepToString(arr2));

    // 1행 1열 값을 바꿔보자
    arr2[0][0] = 3;
    System.out.println(Arrays.deepToString(arr2));




  }


}
