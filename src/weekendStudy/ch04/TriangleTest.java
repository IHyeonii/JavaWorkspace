package weekendStudy.ch04;

public class TriangleTest {
  public static void main(String[] args) {
    Triangle t = new Triangle(10.0, 5.0); // Triangle 객체 생성하고 값 전달하여 초기화
    System.out.println(t.findArea());

    // 02-1
    Triangle t1 = new Triangle(5.0, 10.0);
    Triangle t2 = new Triangle(8.0, 8.0);
    System.out.println(t.isSameArea(t1));
    System.out.println(t.isSameArea(t2));
  }
}

class Triangle {
  // 속성 = 실수값의 밑변과 높이
  double bottom;
  double height;

  // 생성자 -> 객체 생성될 때 호출되어 속성값 초기화하기 위해 필요?
  public Triangle(double bottom, double height) {
    this.bottom = bottom;
    this.height = height;
  }

  // 접근 메서드
  public double getBottom() {
    return bottom;
  }
  public double getHeight() {
    return height;
  }

  // 넓이 계산 메서드
  public double findArea() {
    return bottom * height / 2;
  }

  // 삼각형 넓이 동일한지 비교하는 메서드 생성
//  public boolean isSameArea(Triangle value) {
//    // t랑 비교해서 같은면 true, 다르면 false 리턴
//    // 매개변수로 findArea 받아야 하나..?
//    if(this.findArea() == value.findArea()){
//      return true;
//    }else {
//      return false;
//    }
//  }
  public boolean isSameArea(Triangle value) {
    return this.findArea() == value.findArea();
  }
}