package day15;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Socket1 {
	public static void main(String[] args) {
		MyServer ms = new MyServer();
		MyClient mc = new MyClient();
		
		ms.go(15000);			// 내 컴퓨터 IP에 15000번을 통해서 연락
		// IP : 시작(윈도우키) + R -> cmd 입력 -> ipconfig 입력
		// 192.168.43.245
		//mc.go("192.168.43.245", 15000);
	}
}

class MyServer{
	// 서버
	InputStream is;					// 메시지 받기
	OutputStream os;				// 메시지 보내기
	ServerSocket serverSocket;		
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket socket;					// 통신을 위해 필요
	
	public void go(int port) {
		try {
			serverSocket = new ServerSocket(port);
			while(true) {
				System.out.println("요청 대기");
				socket = serverSocket.accept();			// accept : 유저접속을 기다리는 메서드
				System.out.println("접속 IP : "+socket.getInetAddress());
				is = socket.getInputStream();
				os = socket.getOutputStream();
				ois = new ObjectInputStream(is);
				oos = new ObjectOutputStream(os);
				String msg = (String)ois.readObject();			// 메시지 수신
				System.out.println("클라이언트의 메시지 : "+msg);
				
				String respon = "서버가 준 메시지 :"+msg;
				oos.writeObject(respon);			// 메시지 송신
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// 유저
class MyClient{
	InputStream is;
	OutputStream os;
	//ServerSocket serverSocket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket socket;
	Scanner sc = new Scanner(System.in);
	private String msg = null;
	
	public void go(String ip, int port) {
		try {
			socket = new Socket(ip, port);			// 서버에 접속
			os = socket.getOutputStream();			// 메시지 보내기용
			oos = new ObjectOutputStream(os);		// 통신을 위한 추가처리

			System.out.println("보낼 메시지 >>> ");
			String msg = sc.next();
			oos.writeObject(msg);				// 메시지 송신

			is = socket.getInputStream();			// 메시지 받기용
			ois = new ObjectInputStream(is);		// 통신을 위한 추가처리
			
			String server_msg = (String)ois.readObject();			// 서버의 응답메시지를 수신
			System.out.println(server_msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}