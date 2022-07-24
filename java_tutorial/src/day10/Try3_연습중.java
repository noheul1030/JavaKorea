package day10;

import java.util.Scanner;

public class Try3_연습중 {
	public static void main(String[] args) {
		MyClass3 pp = new MyClass3();
		pp.go();
	}
}

class MyClass3{
		// 함수 3개를 만들고 main 사용
		// 1. 스캐너의 sc.nextInt()
		// 2. 형변환 Integer.parseInt(sc.next())
		// 3. 나누기
		
		//예외 처리작업
	
	int num1,num2,num3;
	Scanner sc = new Scanner(System.in);
	public void go() {
		if((num1+num2+num3) < 10 ) {
			System.out.println(num1+num2+num3);			// 0으로 나눔 
		}
			
		System.out.println("프로그램 시작");
				
		System.out.println("숫자1을 입력하세요");
		num1 = sc.nextInt();
		System.out.println(num1);
		
		System.out.println("숫자2를 입력하세요");
		num2 = Integer.parseInt(sc.next());
		System.out.println(num2);
		
		num3 = num1 / num2;
		System.out.println(num3);

		sc.close();
		System.out.println("프로그램 종료");
	}
}

class MyClass4 extends MyClass3{
	@Override
	public void go() {
		System.out.println("go 실행");
		scan();
		// 예외처리
		try {
			System.out.println(num1+num2+num3);			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("10이 넘으면 안되!!");
		}
		
		System.out.println("go 종료");
	
	}

	private void scan() {
		
	}
}
