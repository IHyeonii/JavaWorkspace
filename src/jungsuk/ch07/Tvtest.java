package jungsuk.ch07;

class Tv {
	private int channel; // private 변수는 상속 안 됐어
	String codeNum; // default값
	boolean power;

}

class CaptionTv extends Tv {
	boolean caption;
}

public class Tvtest {
	public static void main(String[] args) {
		CaptionTv t = new CaptionTv();
		t.codeNum = "??"; // 상속받은거 사용
		t.caption = false;
	}
}
