package day14;

import java.util.ArrayList;

public class Join2 {
	public static void main(String[] args) {
		Music1 a = new Music1();
		Music2 b = new Music2();
		
		a.start();
		try {
			a.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		b.start();
	}
}

// 쓰레드1 : 배경음악1 (1초씩 10번)
// 쓰레드2 : 배경음악2 (1초씩 5번)
// 배경음악1이 끝나면 배경음악2가 시작될 수 있게 해주세요

class Music1 extends Thread{
	ArrayList<String> Music = new ArrayList<>();
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("배경음악1 시작");
		
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			}
		}
	}
}


class Music2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("배경음악2 시작");
				
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			}
		}
	}
}

