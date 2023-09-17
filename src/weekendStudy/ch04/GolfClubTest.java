package weekendStudy.ch04;

public class GolfClubTest {
  public static void main(String[] args) {
    GolfClub g1 = new GolfClub();
    g1.print();

    GolfClub g2 = new GolfClub(8);
    g2.print();

    GolfClub g3 = new GolfClub("퍼터");
    g3.print();

  }
}

class GolfClub { // 골프채를 모델링
  int value = 7;

  String str;
  public void print(){
  }

  // g2 생성자에 그냥 숫자 8을 넣으면 에러 -> 오버라이딩
  public GolfClub() {
//    this.value = value;
    System.out.println(value + "번 아이언입니다.");
  }
  public GolfClub(int value) {
    this.value = value;
    System.out.println(value + "번 아이언입니다.");
  }

  public GolfClub(String str) {
    this.str = str;
    System.out.println(str + "입니다.");
  }
}