package day09;

public interface Interface1 {
	// 인터페이스 : 상수 + 함수 선언
	// 상수 : 변수는 변수인데 값 변경이 안됨, 앞에 final 붙여줘야함
	// 함수 선언 : {} 구현부 없음
	final int num = 0;	// 0에서 변경할 수 없음
	final static String str1= "";
	// final : 한번 값을 주면 변경이 안됨(상수), 법적인 문제
	// static : 우선순위가 높다. 클래스간에 객체화없이 사용이 가능
	
	void go();		// {}가 없으니 선언 : 상속받은 곳에서 반드시 만들어줘야함
	
}
