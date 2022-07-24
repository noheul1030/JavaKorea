package day10;

import java.util.Scanner;

public class Try1 {
	public static void main(String[] args) {
		MyClass1 a = new MyClass1();
		a.go();
	}
}

class MyClass1{
	int num1 = 10;
	int num2 = 0;
	
	public void go() {
		System.out.println("go 실행");
		scan();
		// 예외처리
		if(num2 != 0 ) {
			System.out.println(num1/num2);			// 0으로 나눔 
		}
			
		System.out.println("go 종료");
	}
	
	public void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num2에 넣을 숫자를 입력하세요 >>> ");
		int num = sc.nextInt();			// 숫자가 아닌 문자열을 넣으면 프로그램이 강제 종료 되어버림
		num2 = num;
		sc.close();
	}
}
		