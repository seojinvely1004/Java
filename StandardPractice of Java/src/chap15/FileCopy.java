package chap15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {//���� ó������ ���� �Ű�, �˾Ƽ� ����ó������.
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		while(true) {
			int data = fis.read();//1byte�� Ȱ��
			if(data == -1) break;
			fos.write(null);//file Copy	
		}
		fis.close();
		fos.close();
	}

}
