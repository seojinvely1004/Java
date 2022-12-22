package chap16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest2 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:8080/html/board.html");
			InputStream is = url.openStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			while(true) {
				String line = br.readLine();
				if(line == null)break;
				System.out.println(line);
			}
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
