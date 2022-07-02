package day02;

public class If2 {
	public static void main(String[] args) {
		// 버스를 탔습니다.
		// 카드를 찍습니다.
		// 나이에 따라서 멘트를 다르게 해주세요.
		// 나이가 20이상이면 "성인", 나이가 14~19은 "청소년", 나이가 14 미만이면 "어린이" 로 출력해주세요.
		
		int 나이 = 17;
		
		if(나이 >= 20) {
			System.out.println("성인 입니다.");
		}
		else if(나이 >= 14 ) {
			System.out.println("청소년 입니다.");
		}
		else if(나이 < 14) {
			System.out.println("어린이 입니다.");
		}
	
	}
}
