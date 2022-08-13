package day15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Stream3 {
	public static void main(String[] args) {
		MyProgram a = new MyProgram();
		//a.go("C:\\Users\\내컴퓨터사용자이름\\Desktop\\scan.txt");
	}
}

class MyProgram{
	
	Scanner sc = new Scanner(System.in);
	String msg = "";
	FileOutputStream fout = null;
	
	public void go() {
		try {
			fout = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\\\scan.txt");
			// 스캐너를 통해서 입력받은 문자열을
			// 바탕화면의 scan.txt에 기록 (로그 남기기)
			System.out.println("내 메시지 >>> ");
			msg = sc.nextLine();
			System.out.println(msg);
			msg = msg + "\n";			// 한줄 띄워서 기록
			byte[] log = msg.getBytes();
			fout.write(log);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("기록 실패");
		}finally {
			try {
				fout.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		// msg를 바탕화면의 scan.txt에 기록하기
		
		}
	}
}
