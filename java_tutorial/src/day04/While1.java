package day04;

public class While1 {
	public static void main(String[] args) {
		// if(){} : 조건문
		// switch(){} : 조건문
		// while(){} : 반복문
		
		// 안녕하세요 5번 -> 14번
		while(10 > 5) {
			// while : ~동안, ()안에 있는 조건이 맞는 동안에는 {}의 내용을 반복실행
			// 대신, {}내용 모두 실행하고는 ()의 조건을 다시 검사
			// if(){} : ()안에 있는 조건이 맞으면 {}내용 모두 실행
			System.out.println("반복수행합니다.");
		}

	}
}
