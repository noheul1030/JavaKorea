package day07;

public class Extends2 {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.Info("홍길동",22);
		
		Member m1 = new Member();
		m1.Info("아무개",33);
	}
}

class Human{
	//private String name;		// private : 내 클래스 안에서만 사용 가능
	//double weight;			// default : 내 패키지 안에서만 사용 가능
	protected int age;			// protected : 상속받은 곳까지는 허용
	//public double height;		// public : 모두 사용 가능
	protected String name;
	
	public void Info(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("이름은 "+name+"이고, 나이는 "+age);
	}
}

class Member extends Human{
	// Human 의 코드가 복붙되어 있음
	public void Info(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("회원의 이름은 "+this.name+"이고, 나이는 "+this.age);
	}
}