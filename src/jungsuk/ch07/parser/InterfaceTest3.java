package jungsuk.ch07.parser;

class InstanceManager {
	public static I getInstance() {
		return new B();
	}
}

class A1 {
	void methodA() {
		I i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}

class B1 implements I {

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("methodB in classB");
	}	
	public String toString() {
		return "class B";
	}
}

public class InterfaceTest3 {
	public static void main(String[] args) {
		A1 a = new A1();
		a.methodA();
	}

}
