package day13;

import java.util.ArrayList;

public class List1 {
	public static void main(String[] args) {
		Lst1 a = new Lst1();
		a.go();
		// 배열이 불편한 점을 극복하고자 List, Set, Map을 추가
		// List : 순서대로 추가
		// Set : 순서없이 추가
		// Map : 순번의 이름을 직접 정해서 추가
	}
}

class Lst1{
	public void go() {
		// List를 생성 (배열크기는 0)
		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();		// Integer == int
		ArrayList<Double> arr3 = new ArrayList<>();			// Double == double
		
		// 추가 add
		arr1.add("라면");			// String형 List
		arr1.add("김밥");
		arr1.add("떡볶이");
		arr1.add("순대");
		
		arr2.add(3000);			// int형 List
		arr2.add(2000);
		arr2.add(3500);
		arr2.add(4000);
		
		// 사용 get
		System.out.println(arr1.get(0));				// arr1[0]
		
		// 수정 set
		arr1.set(2,"라볶이");					// arr1[2] = "라볶이"
		
		// 삭제 remove
		arr1.remove(2);
		arr2.remove(2);				// 배열에는 없는 기능
		
		for (int i = 0; i < arr1.size(); i++) {			// 배열크기 size()
			System.out.println(arr1.get(i) + " : "+arr2.get(i));
		}
	}
}