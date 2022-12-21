package chap15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {//내가 처리하진 않을 거고, 알아서 예외처리해줘.
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		while(true) {
			int data = fis.read();//1byte만 활용
			if(data == -1) break;
			fos.write(null);//file Copy	
		}
		fis.close();
		fos.close();
	}

}
