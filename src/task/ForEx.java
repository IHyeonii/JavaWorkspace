package task;

public class ForEx {
  public static void main(String[] args) {
    ForEx e = new ForEx();
    e.sum(10);
  }
// n=10; 0~10 값 for문, while문 사용해서 구하기 -> n > 0;
  int sum(int n) {
    int val = 0;

    for(; n > 0; n--) { // 초기값 생략해도 구분자는 넣어줘야 한다.
      val += n;
    }

    System.out.println(val);
    return  val;
  }

  // while문으로 하면??
  int sum2(int n) {
    int val = 0;

    while (n > 0) {
      val += n;
      n--; // 이 코드가 위에 있으면 시작을 9로 하는거
    }
    return val;
  }
}
