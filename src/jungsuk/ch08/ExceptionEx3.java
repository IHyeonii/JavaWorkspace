package jungsuk.ch08;

import jungsuk.ch10.IHUtils;

import java.util.Arrays;

public class ExceptionEx3 { // 사용자
  public static void main(String[] args) {
    int[] list = {1, 2, 3, 4, 5};
    int[] list2 = {1, 2, 3, 4, 5};

    int[] ret = IHUtils.listSum(list, list2);
    System.out.println(Arrays.toString(ret));
    System.out.println(IHUtils.maxVal(ret));

    IHUtils ih = new IHUtils();
    int re = ih.minVal(ret);
    System.out.println(re);
  }

  // list1 + list2 = 새로운 리스트에 담아서 return
}
