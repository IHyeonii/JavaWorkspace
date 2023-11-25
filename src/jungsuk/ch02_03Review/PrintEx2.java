package jungsuk.ch02_03Review;

import java.text.DecimalFormat;

public class PrintEx2 {
  public static void main(String[] args) {
    double v = 3333333.336;
//    double v2 = 10_000_000 / 3.0;
    double v2 = 3333333.336;

    DecimalFormat df = new DecimalFormat("###,###.##");
    String val = df.format(v2);
    System.out.println(val);

    // %o -> 정수형인데, double 값을 넣어서 오류
//	    System.out.printf("더블 값은 = %o", v);
    System.out.printf("더블 값은 = %f", v);
    System.out.printf("더블 값은 = %.2f", v);

    System.out.println('\n');
    String value = String.format("%.2f", v);
    System.out.println("value= " + value);

    System.out.printf("v는 %f, v2는 %f", v, v2);
    System.out.println('\n');
    System.out.printf("v는 = %,.2f, v2는 %s", v, val);
  }
}
