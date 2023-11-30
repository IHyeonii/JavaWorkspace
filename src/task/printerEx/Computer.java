package task.printerEx;

import java.sql.Connection;

public class Computer {
  public static void main(String[] args) {
    Computer c = new Computer();
    c.booting();

    String line = "전이현 출력";

    Printer p = new HPPrinter("HP");
    Printer p2 = new SamsungPrinter("SSG");

    c.connectPrinter(p);
    c.print(line); // 프린터가 있어야 프린트가 된다.
    c.connectPrinter(p2);
    c.print(line);
//    c.connectPrinter(new SamsungColorPrinter("SSG2", 2023));
//    c.print(line);
//    c.connectPrinter(new HPPrinter2("HP2"));
//    c.print(line);

  }
  Printer p = null;
  void connectPrinter(Printer p) {
    this.p = p;
  }
  void booting() {
    System.out.println("booting");
  }
  void print(String str) {
    if (p == null) {
      return;
    }
    p.print(str);
  }
  void shutDown() {
    System.out.println("shutDown");
  }
}
