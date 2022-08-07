package day14;

public class Thread1 {
	public static void main(String[] args) {
		MyClass1 a = new MyClass1();
		MyClass2 b = new MyClass2();
		MyClass3 c = new MyClass3();
//		a.go();
//		b.go();
//		c.go();
		a.start();			// start: 추가 쓰레드 run메서드 실행
		b.start();			// start: 추가 쓰레드 run메서드 실행
		c.start();			// start: 추가 쓰레드 run메서드 실행
		
		// 프로그램 : 개발자가 만든 애플리케이션
		// 프로세스 : 실행중인 프로그램
		// 쓰레드 : 프로세스의 실질적인 동작수행을 담당
		// 멀티쓰레드 : 하나의 프로세스에 여러개의 쓰레드를 동작시키는 것 (원래는 main쓰레드만 작동)
		// ex : 캐릭터를 움직이면서 배경음악이 재생되면서 채팅을 주고받는다.
		
		// main 쓰레드 외에 추가 쓰레드를 생성하는 법
		// 클래스를 만들어 쓰레드를 상속받고 run에 내용을 입력한 다음 start로 실행한다.
	}
}

class MyClass1 extends Thread{
	
	// 쓰레드를 상속받으면 run이라는 메서드를 사용할 수 있다.
	@Override
	public void run() {				// run :추가 쓰레드가 수행할 내용
		go();
	}
	
	public void go() {
		for (int i = 0; i < 10; i++) {
			System.out.println("UI화면 갱신(캐릭터 움직임, 대화창");				// 10번
			try {
				sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}			// 0.5초 멈춤
		}
	}
}

class MyClass2 extends Thread{
	@Override
	public void run() {				// run :추가 쓰레드가 수행할 내용
		go();
	}
	
	public int go() {
		for (int i = 0; i < 10; i++) {
			System.out.println("배경음악 재생 중");				// 10번
			try {
				sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}			// 0.5초 멈춤
		}
		
		return 0;
	}
}

class MyClass3 extends Thread{
	@Override
	public void run() {				// run :추가 쓰레드가 수행할 내용
		go();
	}
	
	public String go() {
		for (int i = 0; i < 10; i++) {
			System.out.println("채팅 메세지 송수신(네트워크)");				// 10번
			try {
				sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}			// 0.5초 멈춤
		}
		
		return "";
	}
}