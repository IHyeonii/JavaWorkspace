package jungsuk.ch07.parser;

class A { // user
	public void methodA(B b) { // I 인터페이스 구현 전 B 클래스를 상속한 경우
		b.methodB();
	}
	
	public void methodA1(I i) { // 인터페이스를 매개변수로 받아서
		i.methodB();
	}
}

class B implements I { // provider
	public void methodB2() { // 같은 클래스 내에서도 private 선언하면 A 클래스에서 호출 못 해
		// 당연하지. 그러니까 get set 하는거 아냐 ???
		System.out.println("methodB in classB");
	}

	@Override
	public void methodB() {
		System.out.println("구현메소드는 못 건들여");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		
//		I i = new B();
//		a.methodA1(i);
		a.methodA1(new B());
	}
}
