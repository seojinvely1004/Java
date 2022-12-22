package chap16;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientTest {//2. 클라이언트 접속

	public static void main(String[] args) throws Exception{
		System.out.println("상품 정보를 입력하세요");
		Scanner key = new Scanner(System.in);//키보드로부터 입력을 연결
		System.out.println("상품명 : ");
		String name = key.next();//공백 엔터 구분자(제외)
		System.out.println("가격 : ");
		String price = key.next();
		System.out.println("수량 : ");
		String balance = key.next();
		
		Socket s = new Socket("127.0.0.1", 10000);
		String serverip = s.getInetAddress().getHostAddress();
	
		System.out.println("====클라이언트가" + serverip + " 서버로 접속하였습니다===");
		OutputStream os = s.getOutputStream();
		//String request = name + "-" price + "-" + balance;
		//byte [] by = request.getBytes();
 	    //os.write(by);
 	    
		name = name + " ";
		price = price + " ";
		balance = balance + " ";
		os.write(name.getBytes());
		os.write(price.getBytes());
		os.write(balance.getBytes());
		//////////////////////////////////
		InputStream is = s.getInputStream();
		
		Scanner sc = new Scanner(is);
		String response = sc.nextLine();
		System.out.println("[클라이언트가 서버로부터" + response + "응답을 전달받았습니다.]");
		s.close();
		System.out.println("====클라이언트가 서버의 접속을 해제하였습니다====");

	}

}
