package jungsuk.ch02;

public class VarEx4 {
  int var = 3;

  public String toString() {
    return "VarEx4{" +
        "var=" + var +
        '}';
  }

  public static void main(String[] args) {
    int x = 10, y = 20;
    int temp = 0;

    System.out.println("x:" + 10 + "y:" + 20 + new VarEx4());

    double a = 3.0 / 2.0 ;
    double b = 3.0 / 2;

    System.out.println(a);
    System.out.println(b);

    long c = 40000;

    String str = "";
    str = "으아" + 3;
    System.out.println(str);

  }

}
