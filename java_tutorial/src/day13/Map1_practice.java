package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map1_practice {
	public static void main(String[] args) {
		HM2 a = new HM2();
		a.go();
		
		Nations b = new Nations();
		//b.go();
	}
}

class Nations{
	private String search;
	HashMap<String,String> hm = new HashMap<>();
	public void go() {
		// 수도 put
		hm.put("한국", "서울");
		hm.put("영국", "런던");
		hm.put("미국", "워싱턴");
		hm.put("중국", "베이징");
		hm.put("일본", "도쿄");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("어느 나라 수도가 궁금하신가요?(0 입력은 종료) >>> ");
			// 나라를 전체 보여주기 hm.keySet()
			System.out.println(hm.keySet());
			// 나라를 입력받아서
			search = sc.nextLine();
			// 수도를 알려주기
			if(hm.containsKey(search)) {			
				System.out.println(hm.get(search));
			}
			else if(search.equals("0")) {
				break;
			}
			else {
				System.out.println("그런 나라 없음");
			}
		}
		System.out.println("입력을 종료합니다.");
	}
}

class HM2{
	public void go() {
		HashMap<String,Integer> hm = new HashMap<>();
		
		hm.put("아메리카노", 1500);
		hm.put("카페라떼", 2500);
		hm.put("카페모카", 2500);
		hm.put("카라멜마끼아또", 3500);
		
		System.out.println(hm.containsKey("아메리카노"));
		System.out.println(hm.containsValue(2500));
		
		hm.remove("카라멜마끼아또");
		hm.get("아메리카노");
		
		System.out.println(hm.keySet());
		Set<String> keySet = hm.keySet();
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("메뉴 : "+key+"\t 가격 : "+hm.get(key));
		}
	}
}