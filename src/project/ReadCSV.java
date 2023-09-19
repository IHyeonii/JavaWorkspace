package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
  public static void main(String[] args) throws IOException {
    //파싱할 CSV파일 -> 콤마 기준으로 데이터를 구분한다.

    File targetFile = new File("C:\\Users\\ihyeon\\Desktop\\Qbic_1stTask\\projectFile.csv");

    BufferedReader reader = new BufferedReader(new FileReader(targetFile));

    String str; // 한줄씩 읽어서 String 변수에 담아

    // List에 담아
    List<String> list = new ArrayList<>();

    // 일단 전체 읽어오고 결합하기
    while ((str = reader.readLine()) != null) {
      list.add(str); //그게 넣이 아니면 list에 담아줄거야

      // 여기서 출력하면 한 줄 읽고 다시 첫줄로 올라가서 값이 반복 됨
    }
    // 여기서 출력해야 한 줄로 모든 데이터 출력
    System.out.println(list);

    reader.close();
    // 대괄호 없애서
    // 첫 줄만 읽어서 쉼표로 잘라 ->
    //

  }
}
