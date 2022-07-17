package day07;

public class Constructor2 {
	public static void main(String[] args) {
		Person 홍길동 = new Person("홍길동","한국",23);
		Person 아무개 = new Person("아무개","캐나다",22);
		
		홍길동.go();
		아무개.go();
	}
}

class Person{
	private String 이름;
	private String 나라;
	private int 나이;
	
	// 생성자를 통해서 set
	
	Person(String 이름, String 나라,int 나이){
		set이름(이름);
		set나라(나라);
		set나이(나이);
	}
	
	public void go() {		// main
		// go 함수를 통해서 syso(get)
		personInfo();
	}
	
	public void personInfo() {
		System.out.println("이름은 "+get이름()+", 나라는 "+get나라()+", 나이는 "+get나이()+"입니다.");
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get나라() {
		return 나라;
	}

	public void set나라(String 나라) {
		this.나라 = 나라;
	}

	public int get나이() {
		return 나이;
	}

	public void set나이(int 나이) {
		this.나이 = 나이;
	}
}