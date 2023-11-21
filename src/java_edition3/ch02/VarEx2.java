package java_edition3.ch02;

import task.Task1;

import java.util.Date;
import java.util.Scanner;

public class VarEx2 {
  public static void main(String[] args) {
    Task1 task1 = new Task1();
    // Task1 클래스 타입의 참조변수 task1 선언 및 초기화
    // 참조변수는 객체의 주소를 값으로 갖는다 
    System.out.println(task1); // task.Task1@4eec7777
    
    // 객체생성 연산자 new의 결과는 생성된 객체의 주소
    // 대입연산자에 의해 참조변수 task1에 주소가 저장
    // 이제 task1 변수로 생성된 객체 사옹 가능

    // 입력받기 : Scanner 객체 생성
    Scanner scanner = new Scanner(System.in);
    System.out.println("입력해");

    String input = scanner.nextLine(); // 입력받은 내용을 input 변수에 저장
    System.out.println("입력 내용=" + input);




  }
}
