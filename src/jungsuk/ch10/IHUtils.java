package jungsuk.ch10;

public class IHUtils {
  public static int[] listSum(int[] list1, int[] list2) {
    if (list1 == null || list2 == null) {
      return null;
    }

    int[] result = new int[list1.length];

    for (int i = 0; i < list1.length; i++) {
      result[i] += list1[i] + list2[i];
    }
    return result;
  }

  public static int maxVal(int[] list) {
    int maxVal = Integer.MIN_VALUE;

    for (int val : list) {
      if (maxVal < val) {
        maxVal = val;
      }
    }
    return  maxVal;
  }

  public int minVal(int[] list) {
    int minVal = Integer.MAX_VALUE;

    for (int val : list) {
      if (minVal > val) {
        minVal = val;
      }
    }
    return  minVal;
  }

}
