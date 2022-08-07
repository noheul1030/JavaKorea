package day14;

public class Sync2 {
	public static void main(String[] args) {
		DressRoom a = new DressRoom();
		Thread human1 = new Thread(a, "사람1");
		Thread human2 = new Thread(a, "사람2");
		Thread human3 = new Thread(a, "사람3");
		
		human1.start();
		human2.start();
		human3.start();
	}
}
// 의상실은 한명이 사용 중이면 다른 사람들은 대기해야한다
// 동기화
class DressRoom implements Runnable{
	private int time;
	@Override
	public void run() {
		synchronized (this) {
			time = 0;
			System.out.println("탈의실 들어가기");
			while(time < 5) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				time++;
				System.out.println(Thread.currentThread().getName()+"이 탈의실 이용 중..."+time+"초");
			}
			System.out.println("탈의실 비움");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}