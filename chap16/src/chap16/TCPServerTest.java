package chap16;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {//1.서버실행_클라이언트의 접속을 기다린다.

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("[서버는 10000 포트에서 대기중입니다]");
		Socket s = ss.accept();
		System.out.println("[서버는 클라이언트 접속 허용합니다]");
		s.close();
		System.out.println("[서버는 클라이언트 접속 해제합니다]");

	}

}
