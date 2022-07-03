package day04;

public class while3 {
	public static void main(String[] args) {
		// 3번 (while 사용)
		
		int i = 1;
		while (i <= 3) {
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		i++;
		}
		// 여기로
		i = 0;
		while(i < 3) {
			i++;
			System.out.println(i+"번");
		}
		
		// 1~10까지 출력 (while 사용)
		int num = 1;
		while(num <= 10) {
		System.out.println(num+"번");
		num++;
		}
		
		// 10 ~ 1번 까지 출력
		num = 10;
		while(num > 0 ) {
			System.out.println(num+"번");
			num--;
		}
	}
	
}
