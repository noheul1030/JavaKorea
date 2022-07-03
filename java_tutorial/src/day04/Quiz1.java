package day04;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/* 
		퀴즈1) 비밀번호 맞추기 만들기, 기회는 5번까지
		퀴즈2) 대한민국 수도맞추기 만들기, 맞추면 break,게임 종료하려면 0입력
		퀴즈3) 구구단 중 입력한 단수에 대해서만 출력하기 (continue)
		*/
		
		String pw = "1234";
		Scanner sc = new Scanner(System.in);
		String pw_sc;
		
		for (int i = 1; i <= 5; i++) {
				System.out.println("비밀번호 입력 >>> ");
				pw_sc = sc.next();
				if(pw.equals(pw_sc)) {
					System.out.println("로그인 성공");
					break;
				}else {
				System.out.println("비밀번호가 틀렸습니다.");
				}
			}
		
		String 수도 = "서울";
		Scanner nc = new Scanner(System.in);
				String 수도_nc;
				
		for (int i = 1; i < i+1; i++) {
			System.out.println("대한민국 수도 입력 >>> ");
			수도_nc = nc.next();
			
			if(수도.equals("0")) {
				System.out.println("게임을 종료합니다.");
				break;	
			}
			if(수도.equals(수도_nc)) {
				System.out.println("정답입니다!");
				break;
			}
			else if(!(수도.equals(수도_nc))) {
				System.out.println("틀렸습니다.");
			}
			
		}
	}
}
