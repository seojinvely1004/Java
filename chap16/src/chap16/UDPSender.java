package chap16;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception{
		DatagramSocket ds = new DatagramSocket();//랜덤하게 port생성
		System.out.println("[발신자 : 발신 시작]");
		String data = "지금 몇시에요?";
		byte by[] = data.getBytes();
		DatagramPacket dp = new DatagramPacket
				(by, by.length, 
				new InetSocketAddress("127.0.0.1", 15000));//byte배열에 있는 것 전부 다 보낸다.
		ds.send(dp);
		System.out.println("[발신자 : 발신 처리]");
		System.out.println("[발신자 : 발신 종료]");
		
		byte b[] = new byte[1000];//수신받은 내용 저장 할 배열
		DatagramPacket receivedp = new DatagramPacket(b, b.length);
		ds.receive(receivedp);
		String s = new String(b);//byte배열을 String으로 만든다
		
		System.out.println(dp.getAddress() + " 주소의 "
		+ dp.getPort() + "포트에서" + s.trim() + "받았습니다.");
		
		ds.close();
	

	}

}
