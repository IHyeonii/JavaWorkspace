package jungsuk.ch07;

class Person {
	public int age; // 다른 패키지, 클래스에서 접근 가능
	protected int height; // 동일한 패키지, 상속관계 클래스만 접근
	String name; // default : 동일한 패키지 내부에서만, 동일한 패키지 내에서 상속 가능
	private int weight; // 동일한 패키지 내부에서만 접근, 상속X
		
	// private 변수에 접근할 수 있는 Getter 메서드 제공
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}

class Child extends Person {
	int number;
}

public class InheritanceEx {
	public static void main(String[] args) {
		Child c = new Child();
		c.age = 10;
		c.height = 160;
		c.name ="aa";
		c.number = 3; // child 클래스에서 정의한 변수
		c.setWeight(40); // setter -> private 변수 값 변경
		
		// getter -> private 변수에 접근
		System.out.println(c.getWeight());
	}

}
