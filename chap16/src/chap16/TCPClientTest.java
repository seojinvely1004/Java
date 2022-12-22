package chap16;

import java.net.Socket;

public class TCPClientTest {//2. 클라이언트 접속

	public static void main(String[] args) throws Exception{
		Socket s = new Socket("127.0.0.1", 10000);
		System.out.println("====클라이언트가 서버로 접속하였습니다===");
		s.close();
		System.out.println("====클라이언트가 서버의 접속을 해제하였습니다====");

	}

}
