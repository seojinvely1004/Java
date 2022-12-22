package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileViewer {

	public static void main(String[] args) {
		try {
			//FileInputStream fis = new FileInputStream("C:\\Users\\HostAd\\Desktop");
			FileInputStream fis = new FileInputStream("src/chap15/FileViewer.java");
			while(true) {
				int data = fis.read();//4byte중 1byte만 활용
				if(data == -1) {break;}
				System.out.println((char)data);//파일 입력 내용을 모니터 출력
			}
			fis.close();
		}
		//catch(FileNotFoundException e) {
		//	System.out.println("해당 파일은 존재하지 않습니다.");
		//}
		//catch(IOException e) {
			//System.out.println("파일 입력 중 오류가 발생했습니다.");
		//}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
