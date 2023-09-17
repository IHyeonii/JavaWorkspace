package weekendStudy.ch04;

public class DiceTest {
  public static void main(String[] args) {
    Dice d = new Dice();
    System.out.println("주사위 숫자는 = " + d.roll());
  }
}

class Dice {
  // 6개 면(face)
  int face; // 이건 안 쓰면 왜 있냐

  // 굴리기(roll) 동작
  public double roll() {
    return Math.random() *6;
  }
}
