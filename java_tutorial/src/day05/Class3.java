package day05;

public class Class3 {
	public static void main(String[] args) {
		// 클래스 안에서 클래스를 사용하기 위해선 변수로 만들어준다.(객체화)
		Car 아빠차 = new Car();			// 객체 : Object (대상, 물체), 클래스 : Class (반, 추상적)
		Car 엄마차 = new Car();
		Car 내차 = new Car();
		Car 동생차 = new Car();
		Car 홍길동차 = new Car();
		
		아빠차.차정보입력("검정","아빠","BMW");
		엄마차.차정보입력("빨강","엄마","SM5");
		내차.차정보입력("흰색","나","티코");
		동생차.차정보입력("파랑","동생","아우디");
		홍길동차.차정보입력("갈색","홍길동","구루마");
		
		System.out.println(아빠차.차정보출력());
		System.out.println(엄마차.차정보출력());
		System.out.println(내차.차정보출력());
		System.out.println(동생차.차정보출력());
		System.out.println(홍길동차.차정보출력());
		
		System.out.println();
		// Human 객체화
		Human 김아무개 = new Human();
		Human 이아무개 = new Human();
		Human 박아무개 = new Human();
		Human 노아무개 = new Human();
		
		// 메서드 사용
		김아무개.정보입력("김이슬","여자",28,168.9);
		이아무개.정보입력("이수현","여자",22,162.0);
		박아무개.정보입력("박한별","남자",34,178.8);
		노아무개.정보입력("노을","여자",32,160.2);
		
		System.out.println(김아무개.정보출력());
		System.out.println(이아무개.정보출력());
		System.out.println(박아무개.정보출력());
		System.out.println(노아무개.정보출력());
		
	}
}

class Car{
	String color;
	String onwer_name;
	String car_name;
	
	void 차정보입력(String 색상, String 주인, String 차이름) {
		color = 색상;
		onwer_name =  주인;
		car_name = 차이름;
	}
	
	String 차정보출력() {
		return "이 차의 주인은="+onwer_name+"/차의 이름과 색깔은 "+car_name+", "+color+" 입니다.";
	}
}
		
// Human : 이름, 성별, 나이, 키
class Human{
	String name;
	String sex;
	int age;
	double height;
	
	void 정보입력(String 이름, String 성별, int 나이, double 키) {
		
		/* // this. 을 붙이면 클래스에 있는 걸 사용
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		
		String 정보출력() {
			return name+"의 정보 : "+age+sex+height;
		
		 */
		
		name = 이름;
		sex = 성별;
		age = 나이;
		height = 키;
	}
	String 정보출력() {
		return "이 사람의 이름은: "+name+"/성별은: "+sex+"/나이는: "+age+"/키는: "+height+"cm 입니다.";
	}
}