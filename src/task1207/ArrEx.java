package task1207;

import java.util.*;

public class ArrEx {
  public void findNumber(int[] arr, int num) { // 배열에서 특정 숫자 찾기
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) {
        System.out.println(num + "과 일치하는 배열의 index : " + i + "번째");
      }
    }
  }

  public int[] reverseArr(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }
    return arr;
  }

  public void fineMN(int[] arr) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int num : arr) {
      if (num > max) {
        max = num;
      }

      if (num < min) {
        min = num;
      }
    }
    System.out.println("최대값: " + max);
    System.out.println("최소값: " + min);
  }

  public void average(int[] arr) {
    int sum = 0;

    for (int num : arr) {
      sum += num;
    }
    double avg = sum / (double) arr.length;

    System.out.println("요소의 합: " + sum);
    System.out.println("배열의 평균: " + avg);
  }

  public void removeDu(int[] arr2) {
    // 중복제거된 배열
    Set<Integer> setArr = new HashSet<>();

    for (int num : arr2) {
      setArr.add(num);
    }
    System.out.println(setArr);
  }

  public List<Integer> addValue(int[] arr, int index, int[] val) {
    // 추가된 값을 담을 배열
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (i == index) {
        System.out.println("추가되는 위치는: " + i);
        for (int j = 0; j < val.length; j++) {
          list.add(val[j]);
        }
      }
      list.add(arr[i]);
    }
    return list;
  }

  public void findMode(int[] arr) {

    int[] newArr = new int[arr.length];
    int max = 0;
    // arr배열의 값 = 새로운 배열의 index++ 하면 됨

    for (int i = 0; i < arr.length; i++) {
      int num = arr[i];
      // 기존 배열의 값을 num 변수에 저장해서
      newArr[num]++;
    }
    System.out.println("newArr: " + Arrays.toString(newArr));

    for (int i = 0; i < newArr.length; i++) {
      if (newArr[i] > max) {
        max = i;
      }
    }
    System.out.println("배열의 최빈값: " + max);
  }

  public void countArr(int[] arr) {
    int en = 0;
    int odd = 0;

    for (int num : arr) {
      if (num % 2 == 0) {
        en++;
      } else {
        odd++;
      }
    }
    System.out.println("짝수 개수: " + en);
    System.out.println("홀수 개수: " + odd);
  }

  public void multiArr(int[][] arr) {
    int sum = 0;
    int length = 0; // 배열 길이

    for(int[] temp : arr) {
      for (int i : temp) {
        sum += i;
      }
    }
    System.out.println("sum: " + sum);

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        length += j;
      }
    }
    System.out.println("배열 길이: " + length);
    System.out.println("평균: " + (sum / (double) length));
  }
}
