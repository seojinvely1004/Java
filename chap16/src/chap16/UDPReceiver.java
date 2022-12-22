package chap16;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPReceiver {//1. 포트를 갖고있는 리시버 먼저 시작해야 한다.

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(15000);//랜덤하게 port생성
		System.out.println("[수신자 :수신 시작]");
		/*String data = "오늘 오후 5시30분에 종료합니다.";
		byte by[] = data.getBytes();
		DatagramPacket dp = new DatagramPacket(by, by.length, new InetSocketAddress("127.0.0.1", 15000));//byte배열에 있는 것 전부 다 보낸다.
		ds.send(dp);
		System.out.println("[발신자 : 발신 처리");*/
		byte b[] = new byte[1000];//수신받은 내용 저장 할 배열
		//한글 영문 숫자 --> 1문자 2바이트 
		//getBytes() --> 영문 숫자 특수문자 1바이트로취급, 한글 - 3바이트로 취급
		DatagramPacket dp = new DatagramPacket(b, b.length);
		ds.receive(dp);
		String s = new String(b);//byte배열을 String으로 만든다
		
		System.out.println(dp.getAddress() + " 주소의 "
		+ dp.getPort() + "포트에서" + s.trim() + "받았습니다.");//나에게보낸 sender의 IP를확인
		System.out.println("[수신자 : 수신 종료");
		
		//응답 send
		String time = new SimpleDateFormat("HH시 mm분 ss초").format(new Date());
		DatagramPacket timedp = new DatagramPacket
				(time.getBytes(), time.getBytes().length,
						dp.getAddress(), dp.getPort());
		ds.send(timedp);
		//byte배열 : -128~127
		ds.close();
		
	}
}
