package task.printerEx;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
  public static void test() {
    Printer p = new SamsungColorPrinter("colorP", 2024);
    p.print("인터페이스");

    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(9);
    arr.add(2);
    arr.add(3);
    System.out.println("before" + arr.toString());

    Collections.sort(arr);
    System.out.println("after" + arr.toString());
  }
  public static void main(String[] args) {
    test();
  }
}
