package day04;

import java.util.Scanner;

public class For3 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			// 나이에 따라서 50대이상, 40대이상, 30대이상, 20대이상, 미성년자
			
			Scanner sc = new Scanner(System.in);
			System.out.println("나이를 입력하세요 >>>");
			int age = sc.nextInt();		
			
			if (age >= 50) {
				System.out.println("50대 입니다.");
			}else if (age >= 40) {
				System.out.println("40대 입니다.");
			}else if (age >= 30) {
				System.out.println("30대 입니다.");
			}else if (age >= 20) {
				System.out.println("20대 입니다.");
			}else {
				System.out.println("미성년자 입니다.");
			}
			// for 안에서 if 사용 가능
		}
	}
}
