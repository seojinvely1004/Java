package chap16;

import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerTest {//1.서버실행_클라이언트의 접속을 기다린다.

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("product.txt");
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("[서버는 10000 포트에서 대기중입니다]");
		int cnt = 0;
		while(true) {
			Socket s = ss.accept();//실행x/10/....
			String clientip = s.getInetAddress().getHostAddress();
			System.out.println("[서버는 " + clientip + "클라이언트 접속 허용합니다]");
			cnt++;
			if(cnt == 3) { break;}
			//클라이언트 요청청받는다 = 입력스트림
		    //BufferedReader br = new BufferedReader(new InputStreamReader(is)); 			
			//String request = br.readLine();
			//Scanner sc = new Scanner(is);
		    //String request = sc.nextLine();
			
			//클라이언트 3개 " " = 입력스트림
			InputStream is = s.getInputStream();
			Scanner sc = new Scanner(is);
			String name = sc.next();
			String price = sc.next();
			String balance = sc.next();
			fw.write(name + " - " + price + " - " + balance);
			
		    String response = "추가 완료되었습니다";
		    OutputStream os = s.getOutputStream();
		    byte[] by = response.getBytes();
		    os.write(by);
 		    System.out.println("[서버는 클라이언트로 " + "응답을 전달합니다.]");
			//////////////////////////////////
			fw.close();
			is.close();
			os.close();
 		    s.close();
			System.out.println("[서버는 클라이언트 접속 해제합니다]");
		}
	}

}
