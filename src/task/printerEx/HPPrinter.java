package task.printerEx;

public class HPPrinter extends Printer{
  String model;

  @Override
  public void print(String line) {
    System.out.println(String.format("HP %s:%s", model, line));
  }
  public HPPrinter(String model) {
    this.model = model;
  }
}
