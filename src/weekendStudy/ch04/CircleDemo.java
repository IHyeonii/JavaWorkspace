package weekendStudy.ch04;

class Circle { // 클래스 순서는 누가 먼저 오든 상관없어
  double radius; //얘는 클래스의 필드라 초기화 안 해도 기본값 사용
  double area() {
    return 3.14 * radius * radius;
  }
  void show(double x, double y) {
    System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
  }
}

public class CircleDemo {
  public static void main(String[] args) {
    // 다른 클래스 멤버에 접근하려면 -> 해당 클래스 객체 먼저 생성
    Circle circle = new Circle(); //클래스의 순서는 상관 없다.
    circle.radius = 10.0;
    circle.show(circle.radius, circle.area());
  }
}
