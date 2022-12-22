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
				int data = fis.read();//4byte�� 1byte�� Ȱ��
				if(data == -1) {break;}
				System.out.println((char)data);//���� �Է� ������ ����� ���
			}
			fis.close();
		}
		//catch(FileNotFoundException e) {
		//	System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		//}
		//catch(IOException e) {
			//System.out.println("���� �Է� �� ������ �߻��߽��ϴ�.");
		//}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}