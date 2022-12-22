package chap16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args){
		//windows ipconfig
		try {
			InetAddress[] iparr =  InetAddress.getAllByName("www.naver.com");
			for( InetAddress ip : iparr) {
				System.out.println(ip);
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
