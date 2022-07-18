package day08;
interface Inter1 {
	// 상속 전용 클래스
	// interface는 함수의 선언부만 존재
	final String str = "";		// 사용만 가능한 변수 
	public void go();			// 인터페이스의 
	
	// 선언만 된 메서드는 상속받은 클래스에서 반드시 구현
}
