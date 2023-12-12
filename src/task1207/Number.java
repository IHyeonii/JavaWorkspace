package task1207;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Random;

public class Number {
	public void gugudan() {
		// 2 ~ 9까지 숫자
		// 그 안에 for문 1 ~ 9
		// 출력 형태: 2 x 1 = 2

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");

			for (int j = 1; j < 10; j++) {
				String str = i + "x" + j + "=" + (i * j);
				System.out.println(str);
			}
		}
	}

	public void gugudanUpdate() {
		int[] num = new int[8];

		// 1. 배열에 2~9까지의 숫자를 담는다.
		for (int i = 0; i < 8; i++) {
			num[i] = i + 2;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + "단");

			for (int j = 1; j < 10; j++) {

				System.out.printf("%d x %d = %d%n", num[i], j, num[i] * j);
			}
		}
	}
	public void lotto() {
		// 1~45 숫자 중 랜덤으로, 중복없이 6개 추출
		
		// Math.random(); // 0.0 ~ 1.0의 double
		// Random 클래스 -> 특정 범위의 난수를 생성 가능 nextInt(int bound)
		
		Random random = new Random();
		int[] arr = new int[6];
		
		for (int i = 0; i < 6; i++) { // 6번 반복
			arr[i] = random.nextInt(45) + 1; // 0 ~44 값 +1 -> 1~45
			
			// 중복 제거하기
			// 한 번 더 생각해보깅
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = random.nextInt(45) + 1;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public void Calendar(int month) {
		// 1. 날짜 출력하기
		LocalDate date = LocalDate.now();
		System.out.println("오늘 날짜는 " + date);

		// 2. 날짜 + 시간
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("날짜랑 시간은 " + dateTime);

		// 3. 시간만 알고싶어 ?
		LocalTime time = LocalTime.now();
		System.out.println("지금 시간은 " + time);

		String format = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		System.out.println("출력 형식을 바꾸면? " + format);

		/**
		 * LocalDate, LocalTime, LocalDateTime을 나눠 둠
		 * */

		// 오늘부터 매개변수만큼 +day
		LocalDate plusMonth = date.plusMonths(month);
		System.out.println("지금부터 " + month + "개월 뒤: " +plusMonth);
	}
	public double convertC(int c) {
		double f = (c * 1.8) + 32;
		return f;
	}
}
