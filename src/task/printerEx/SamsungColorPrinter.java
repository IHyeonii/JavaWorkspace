package task.printerEx;

public class SamsungColorPrinter extends SamsungPrinter {
  int year = 0;
  // 이거 안 하면 오류나
  public SamsungColorPrinter(String model, int year) {
    super(model);
    this.year = year;
  }

  public SamsungColorPrinter(int year) {
    super("");
    this.year = year;
  }

  @Override
  public void print(String line) {
    System.out.println(String.format("colorPrintOverride %s, %d, %s", model, year, line));
  }

  public void colorPrint(String line) {
    System.out.println("color_color : " + line);
  }
}
