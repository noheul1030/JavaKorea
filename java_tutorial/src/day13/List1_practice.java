package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List1_practice {
	public static void main(String[] args) {
		ArrayList1 a = new ArrayList1();
		//a.go();
		
		Lst4 b = new Lst4();
		b.go();
	}
}

class ArrayList1{
	public void go() {
		ArrayList<String> arr1 = new ArrayList<>();  		// arr1 = {};
		arr1.add("아메리카노");			// arr1 = {"아메리카노"}
		arr1.add("카페라떼");				// arr1 = {"아메리카노","카페라떼"}
		arr1.add("카페모카");				// arr1 = {"아메리카노","카페라떼","카페모카"}
		arr1.add("카라멜마끼아또");			// arr1 = {"아메리카노","카페라떼","카페모카","카라멜마끼아또"}
		arr1.add(0, "에스프레소");			// arr1 = {"에스프레소","아메리카노","카페라떼","카페모카","카라멜마끼아또"}
		arr1.set(4, "오렌지주스");			// arr1 = {"에스프레소","아메리카노","카페라떼","카페모카","오렌지주스"}
		arr1.remove(4);					// arr1 = {"에스프레소","아메리카노","카페라떼","카페모카"}
		arr1.remove("카페모카");			// arr1 = {"에스프레소","아메리카노","카페라떼"}
		
		System.out.println(arr1.indexOf("에스프레소"));		// 0 
		System.out.println(arr1.get(0));					// "에스프레소"
		System.out.println(arr1.size());					// 3
		
		for (int i = 0; i < arr1.size(); i++) {
			System.out.print(arr1.get(i)+" ");
			
		}
	}
}

class Lst4{
	public void go() {
		ArrayList<String> arr2 = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
	while(true) {
		System.out.print("추가할 항목 입력(0을 입력하면 종료) >>> ");
		
		String str = scanner.next();
		if(str.equals("0")) {
			break;
		}else {
			arr2.add(str);
		}
	}
	
	for (int i = 0; i < arr2.size(); i++) {
		System.out.print(arr2.get(i)+" ");
		
		}
	}
}