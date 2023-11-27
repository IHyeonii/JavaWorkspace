package jungsuk.ch06;

public class TvArr {
  public static void main(String[] args) {
    /**
     * 접근 제한자가 없는 class = default 접근 제한을 가진다.
     * 동일한 패키지에 소속된 클래스에서만 import 없이 사용 가능
     * */

    // 객체를 여러 개 다뤄야 할 때, 각각 new 생성해줘도 되지만, 배열로 다루는것도 가능
    Tv tv1, tv2, tv3;

    Tv[] tvs = new Tv[3]; // 이렇게 한 번에 생성 가능
    // 길이가 3인 객체의 배열에는, 참조변수 기본값 null 초기화되고, 참조변수 tvs는 객체의 주소를 저장

    tvs[0] = new Tv();
    tvs[1] = new Tv();
    tvs[2] = new Tv();

    // tv객체 100개 생성 -> 반복문으로 저장해봐
    Tv[] tvArr = new Tv[100];

    for(int i = 0; i < tvArr.length; i++) {
      tvArr[i] = new Tv();
    }
  }
}
