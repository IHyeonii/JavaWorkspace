package jungsuk.ch06;

public class TestClass {
  void instanceMethod() {}
  static void staticMethod() {}
  void instanceMethod2() {
    instanceMethod();
    staticMethod();
  }
  static void staticMethod2() {
    // 인스턴스 메소드 둘 다 호출 불가
    staticMethod(); // static 메소드만 호출 됨

    // 클래스 메소드가 인스턴스 메소드나 변수 호출하려면? 객체 생성
    TestClass t = new TestClass();
    t.instanceMethod();
    t.instanceMethod2();
  }
}
