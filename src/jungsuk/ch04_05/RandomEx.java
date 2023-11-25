package jungsuk.ch04_05;

public class RandomEx {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println((int) (Math.random() * 10));
		} // int 형변환 할 때 Math 뒷부분도 감싸줘야 함,,,
	}
}
