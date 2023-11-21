package java_edition3.ch03;

public class InstanceofTest { //객체 타입 확인
  public static void main(String[] args) {
    Parent parent = new Parent();
    Child child = new Child();

    System.out.println(parent instanceof Parent);
    System.out.println(child instanceof Parent);
    System.out.println(parent instanceof Child);
  }
}

class Parent{}
class Child extends Parent{}
