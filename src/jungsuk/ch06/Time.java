package jungsuk.ch06;

public class Time {
  /**
   * 변수를 private 선언하면
   * 해당 클래스 내부에서 메서드를 통해 접근하거나
   * 클래스 외부에서 제공된 public 메서드를 통해서만 접근 가능
   * */
  private int hour;
  private int minute;
  private float second;

  public int getHour() {
    return hour;
  }
  public int getMinute() {
    return minute;
  }

  public float getSecond() {
    return second;
  }

  // 조건1. 시, 분, 초는 모두 0보다 크거나 같아야 한다
  // 조건2. 시의 범위는 0~23, 분과 초의 범위는 0~59
}
