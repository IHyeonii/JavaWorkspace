package jungsuk.ch09;

class Person {
	long id;
	
	// equals 메서드를 재정의 -> 주소값이 아닌 객체의 값을 비교
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Person) {
			return id == ((Person) obj).id;
		} else {
			return false;
		}
	}
	public Person(long id) {
		this.id = id;
	}
	
	// toStirng 오버라이딩
	@Override
	public String toString() {
		return "Person [id=" + id + "]";
	}
}


public class EqualEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(100);
		Person p2 = new Person(100);
		
		if (p1 == p2) {
			System.out.println("p1과 p2는 같은 사람");
		} else {
			System.out.println("p1과 p2는 다른 사람");
		}
		
		System.out.println("--------- 구분선 ----------");
		
		
		if (p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람");
		} else {
			System.out.println("p1과 p2는 다른 사람");
		}
		
		System.out.println("--------- 구분선 ----------");
		
		System.out.println("p1: " + p1); // 주소값 -> toString 오버라이딩 후: Person [id=100]
	
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println("str1: " + str1); // 이건 주소값 아닌 문자열 abc 출력
		System.out.println("str2: " + str2);
		
		if (str1 == str2) {
			System.out.println("== 값이 true");
		} else if (str1.equals(str2)) {
			System.out.println("equals 결과가 true");
		} else {
			System.out.println("false");
		}
		
		System.out.println("--------- 구분선 ----------");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
