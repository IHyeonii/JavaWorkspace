package task.printerEx;

public class HPPrinter2 extends Printer{
  String model;

  @Override
  public void print(String line) {
    System.out.println(String.format("HP %s:%s", model, line));
  }
  public HPPrinter2(String model) {
    this.model = model;
  }
}
