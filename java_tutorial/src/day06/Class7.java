package day06;

public class Class7 {
	public static void main(String[] args) {
		
		Person 홍길동 = new Person();
		홍길동.setName("홍길동");
		홍길동.setNation("한국");
		홍길동.setAge(23);
			
		Person 아무개 = new Person();
		아무개.setName("아무개");
		아무개.setNation("캐나다");
		아무개.setAge(22);
		
		System.out.println(홍길동.getName()+"은 "+홍길동.getNation()+"에서 온 "+홍길동.getAge()+"살 이다.");
		System.out.println(아무개.getName()+"는 "+아무개.getNation()+"에서 온 "+아무개.getAge()+"살 이다.");
		
		// 홍길동은 한국에서 온 23살이다.
		// 아무개은 캐나다에서 온 22살 이다.
	}
}

// 클래스명 : Person
// 변수 : 이름, 나라, 나이
// 함수 : get, set

// getter/setter 만들기: 우클릭 -> source -> Generate getter/setter...
class Person{
	private String name;
	private String nation;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}