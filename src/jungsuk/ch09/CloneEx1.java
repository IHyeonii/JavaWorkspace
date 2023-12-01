package jungsuk.ch09;

class Point implements Cloneable {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	// clone을 오버라이딩 -> 원래 인스턴스에 영향 미치지 않게 하기
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {}
		return obj;
	}
	
}
public class CloneEx1 {
	public static void main(String[] args) {
		Point origin = new Point(3, 5);
		Point copy = (Point) origin.clone();
		
		System.out.println(origin);
		
		// 복제한 값 변경
		copy.x = 10;
		System.out.println(copy);
	}

}
