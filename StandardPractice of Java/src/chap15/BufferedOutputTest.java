package chap15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputTest {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("buffer.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		for(int i = 48; i <=57; i++) {//fos�� �־�� bos�� ���� �� �ִ�. 
			bos.write(i);//write(int)-->int  �ش繮�� ����
		}
		bos.close();
		fos.close();

	}

}
