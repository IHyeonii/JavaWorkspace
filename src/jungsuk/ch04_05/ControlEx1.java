package jungsuk.ch04_05;

public class ControlEx1 {
	public static void main(String[] args) {
		int score = 60;
		char grade = ' ';
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		System.out.printf("학점은 %c 입니다.", grade);
	}
	
	int score2 = 80;
	// 90미만 80이상에게 B 주려면?
	
}
