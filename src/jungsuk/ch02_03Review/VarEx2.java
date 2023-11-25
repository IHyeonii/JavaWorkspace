package jungsuk.ch02_03Review;

public class VarEx2 {
  public static void main(String[] args) {
    VarEx1 ex1 = new VarEx1("이현이");
    VarEx1 ex2 = new VarEx1("바보");

    // 여기서 final 변수지만 객체마다 다른 값을 할당가능
    System.out.println(ex1);
    System.out.println(ex2);

    // 하지만 수정은 불가
    ex1.age = 30;
//    ex1.name = "바꿔"; Cannot assign a value to final variable 'name'
    System.out.println(ex1);
  }

  public void function1(int num) throws Exception {
    if(num == 3) {
      throw new Exception();
    }
  }

  public void function2() throws Exception {
    function1(3);
  }
}
