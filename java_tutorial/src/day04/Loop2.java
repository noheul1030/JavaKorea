package day04;

public class Loop2 {
	public static void main(String[] args) {
		// if 안에 if, switch
		// switch 안에 if, switch
		// for 안에 if
		for (int i = 0; i < 3; i++) {
			if(i == 1) {
				System.out.println("i의 값은 "+i);
			}
			if(i == 2) {
				System.out.println("i의 값은 3이다");
			}
		}
		
		// for 안에 for : 이중 for문
		
		for (int i = 0; i < 3; i++) {		// 바깥
			
			for (int j = 0; j < 3; j++) {		// 안쪽
				
				System.out.println("바깥i="+i+" 안쪽j="+j);
				
			}
		}
		// 이중 for문 끝
	}
}
