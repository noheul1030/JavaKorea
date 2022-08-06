package day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		HashSet1 a = new HashSet1();
		a.go();
		// Set은 순서가 없다.
		// Set은 중복없이 저장할 때만 쓰인다
		TreeSet1 b = new TreeSet1();
		b.go();
	}
}

class HashSet1{
	public void go() {
		HashSet<Integer> hs1 = new HashSet<>();
		
		// 추가 add
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		
		// HashSet은 순서가 없기 때문에
		// 반복자 Iterator 의 도움으로 전체조회가 가능하다
		Iterator<Integer> it1= hs1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}

class TreeSet1{
	public void go() {
		// HashSet : 순서x, 중복 금지
		// TreeSet : 글자정렬순, 중복 금지
		// a -> b -> c
		TreeSet<Integer> ts1 = new TreeSet<>();
		
		// 추가 add
		ts1.add(1);
		ts1.add(4);
		ts1.add(3);
		ts1.add(2);
		
		Iterator<Integer> it1= ts1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}
// Set : 잘 안씀