package jungsuk.ch07;

public class Circle {
	// 1. 변수 선언해서 사용해도 되지만,
	int x;
	int y;
	int r; // 반지름
	
	// 2. Point 클래스 재사용해서 작성할 수도 있다.
	Point p = new Point();
	int r1;
}

class Point {
	int x;
	int y;
}

/**
 * 클래스간의 포홤관계
 * 장점 
 * 1. 클래스를 작은 단위로 모듈화 = 다른 프로그램에 재사용 가능
 * 	  모듈화: 
 * 2. 유연성: 클래스 간 결합도를 낮춰, 한 클래스 수정해도 다른 클래스에 미치는 영향 최소화

 * 단점
 * 1. 포함 되는 클래스의 객체 생성 -> 메모리 사용량 증가
 * */