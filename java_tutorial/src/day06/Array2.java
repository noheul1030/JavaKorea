package day06;

public class Array2 {
	public static void main(String[] args) {
		// go()를 사용해서 실행 
		Array2Ex a = new Array2Ex();
		a.go();
	}
}

class Array2Ex{
	public void go() {
		// 카페메뉴와 가격
		String 메뉴[] = {"아메리카노","헤이즐넛라떼","아이스티","레몬에이드"};
		int 가격[] = {1500, 2000, 3000, 2500};
		
		// 배열값 수정
		가격[0]=2000;
		
		// 반복문 길이는 카페메뉴 갯수와 가격의 갯수가 같기 때문에 둘중 하나만 해주면 됨
		for (int i = 0; i < 메뉴.length; i++) {
			System.out.println(메뉴[i]+" : "+가격[i]+"원");
		
		}
	}
}
			
			