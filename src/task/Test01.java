package task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test01 {
  public int textCount(String filename, String search) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(filename));

    String str;
    str = reader.readLine(); // 한 줄을 다 읽어라
    int count = 0; // 디폴트 0이지만, 초기화 시켜라

    while (str != null){
      String[] result = str.split(" ");
      for(String test : result){
        int nety = test.compareToIgnoreCase(search);
//        System.out.println(nety + "=" + test);

        if(nety == 0){
          count++;
        }
      }

      str = reader.readLine(); // 위에 전체가 한 줄 도는거야. 그리고 다음 줄 돌아
    }
    reader.close(); // 난 다 봤다고 알려줘야 지
    return count;
  }

  public static void main(String[] args) throws IOException {
    Test01 obj = new Test01();
    int nety = obj.textCount("C:\\Data\\JVM.txt", "Nety");
    System.out.println(nety);
  }

    // 특정 테스트 파일에서 Nety라는 이름이 몇 회 발생하는지

    // 1. 텍스트 파일을 읽는다.

    // 2. 첫 줄에서 값 여부 채크

    // 3. 있으면 카운트하고

    // 4. 없으면 다음줄로 넘어가 -> 이걸 반복해서

    // 5. 총 합을 리턴한다.

}
