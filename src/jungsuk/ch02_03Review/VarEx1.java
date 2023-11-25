package jungsuk.ch02_03Review;

public class VarEx1 {
  int age;
  final String name;

  public VarEx1(String name) { // 생성자 -> 객체가 생성될 때 호출되는 메서드
    // 생성자가 초기화 -> 기본값을 들고 있고
    this.name = name;
  }

  public String toString() {
    return "VarEx1 [age=" + age + ", name=" + name + "]";
  }

  public static void main(String[] args) {
    VarEx1 obj = new VarEx1("");
    System.out.println(obj.name);

//		int a;
//		System.out.println(a);
  }
}
