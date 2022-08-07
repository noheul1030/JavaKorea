package day14;

import java.util.Scanner;

public class Thread2 {
	public static void main(String[] args) {
		Thread_1 a = new Thread_1();
		Thread_2 b = new Thread_2();
		Thread_3 c = new Thread_3();
		Thread tt3 = new Thread(c);			// Runnable로 만들었을 경우 Thread 객체화 해줘야함
		
		a.start();
		b.start();
		tt3.start();
	}
}

// 쓰레드를 생성하여 동시에 2개의 작업을 수행하세요
// 쓰레드1 : 스캐너를 사용해서 입력받으면 출력
// 쓰레드2 : 무한반복으로 0.5초마다 Hello World 출력

class Thread_1 extends Thread{
	private Scanner sc = new Scanner(System.in);
	private String str = "";
	int Num = 0;
	
	@Override
	public void run() {				// run 으로 만들고 start로 실행
		// 입력받으면 출력
		System.out.println("횟수를 입력하세요 >>> ");
		Num = Integer.parseInt(sc.nextLine());
		System.out.println("단어를 입력하세요 >>> ");
		str = sc.next();
		go();
	}
	public void go() {
		for (int i = 0; i < Num; i++) {
			System.out.println(str);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

class Thread_2 extends Thread{
	@Override
	public void run() {					// 추가쓰레드의 main함수(run 으로 만들고 start로 실행)
		go();
	}
	public void go() {
		for (;;) {			// 무한반복
			System.out.println("Hello World");				
			try {
				sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}			// 0.5초 멈춤
		}
	}
}

// 자바는 다중상속이 안되기 때문에 추가로 상속할 수 있는 인터페이스를 제공 : Runnable
class Thread_3 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("BGM 재생 중");
			try {
				Thread.sleep(200);			// 0.2초 쓰레드 중지
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}

