package weekendStudy.ch05;

public class SalaryManager {
  public static void main(String[] args) {

  }

  // 한 달 급여 계산하는 메소드, 매개변수로 int 연봉
  public double MonthlySalary(int yearlySalary) {
    double monthly = yearlySalary / 12;
    return monthly; //월 급여
  }
}
