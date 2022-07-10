package day06;

public class Class4 {
	public static void main(String[] args) {
		// 사칙연산 클래스를 사용
		
		사칙연산 nc = new 사칙연산();
		nc.add(9, 3);
		nc.sub(7, 1);
		nc.mul(8, 4);
		nc.div(8, 2);
		
		System.out.println();
	}
}

class 사칙연산{
	// 더하기, 빼기, 곱하기, 나누기
	
	void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	void sub(int n1, int n2) {
		System.out.println(n1-n2);
	}
	
	void mul(int n1, int n2) {
		System.out.println(n1*n2);
	}
	
	void div(int n1, int n2) {
		System.out.println(n1/n2);
		
		return;
	}
}