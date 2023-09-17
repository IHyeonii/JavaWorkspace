package weekendStudy.ch04;

class Phone {
  String model;
  int value;
  void print() { // 메서드 -> main이 없어서 이거 없음 sout 안 됨
    System.out.println(value + "만 원짜리 " + model + "스마트폰");
  }
}
public class PhoneDemo { // 소스파일이랑 동일한 클래스명에 public 사용
  public static void main(String[] args) {
    Phone myPhone = new Phone(); // Phone 타입의 객체 생성

    myPhone.model = "갤럭시"; // 객체의 필드에 값 대입
    myPhone.value = 100;

    myPhone.print(); // 객체의 메서드 호출
  }

}
