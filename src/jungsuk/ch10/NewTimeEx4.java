package jungsuk.ch10;

import java.time.Duration;
import java.time.LocalTime;

public class NewTimeEx4 {
  public static void main(String[] args) {
    LocalTime time1 = LocalTime.of(0, 0, 0);
    LocalTime time2 = LocalTime.of(12, 34, 56);

    // 시간의 차이는 Duration
    Duration du = Duration.between(time1, time2);
    System.out.println(time1);
    System.out.println(time2);
    System.out.println(du); // PT12H34M56S


    // 왜 초단위만 더했는데 time2를 다 가져오지 ?????
    // Duration에 getHour 같은 메서드X -> Du
    LocalTime tpm = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
    System.out.println(tpm.getHour()); // 12
    System.out.println(tpm.getMinute()); //34
    System.out.println(tpm.getSecond()); //56
    System.out.println(tpm.getNano()); //0

  }
}
