package day09;

public class Class2 {
	public static void main(String[] args) {
		starbucks부평 star = new starbucks부평();
		star.커피();
		star.계산();
		
		starbucks강남 s1 = new starbucks강남();
		s1.커피();
		s1.계산();
		
		starbucks신촌 s2 = new starbucks신촌();
		s2.커피();
		s2.계산();
		
		starbucks부평 s3 = new starbucks부평();
		s3.커피();
		s3.계산();
		
		// 다형성 : 객체화를 할 때 자료형을 상속한 인터페이스의 이름으로 통일
		starbucks star1 = new starbucks강남();
		starbucks star2 = new starbucks신촌();
		starbucks star3 = new starbucks부평();
		starbucks 스타[] = new starbucks[30];
		
		스타[0] = new starbucks강남();
		스타[1] = new starbucks신촌();
		
		스타[0].커피(); 		// 강남점
		스타[1].커피(); 		// 신촌점
		
		스타[0] = new starbucks부평();
		스타[0].커피(); 		// 부평점
		
		star1.계산();			// 강남점
		star1 = new starbucks부평();
		star1.계산();			// 부평점
		
		//sg = new starbucks부평();		안됨		//starbucks강남 sg = new starbucks부평();
		// starbucks star1 = new starbucks부평();		가능
		// starbucks star1 = new starbucks인천();		가능
				
		// 다형성 : 코드수정을 줄이고 재사용 비율을 늘린다.
	}
}

// 스타벅스
interface starbucks{
	// 커피를 만든다
	// 계산을 한다
	void 커피();
	void 계산();
}
// 스타벅스 강남점{
// 스타벅스 강남점에서 커피를 만든다
// 스타벅스 강남점에서 커피를 판다
// }
class starbucks강남 implements starbucks{
	public void 커피() {
		System.out.println("강남점 커피만들기");
	}
	public void 계산() {
		System.out.println("강남점 커피계산하기");
		
	}
}
// 스타벅스 신촌점
class starbucks신촌 implements starbucks{
	public void 커피() {
		System.out.println("신촌점 커피만들기");
	}
	public void 계산() {
		System.out.println("신촌점 커피계산하기");
		
	}
}
// 스타벅스 부평점
class starbucks부평 implements starbucks{
	public void 커피() {
		System.out.println("부평점 커피만들기");
	}
	public void 계산() {
		System.out.println("부평점 커피계산하기");
		
	}
}