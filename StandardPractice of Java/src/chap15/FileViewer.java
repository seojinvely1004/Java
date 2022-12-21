package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileViewer {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c:\\test\\a.java");
			while(true) {
				int data = fis.read();//4byte�� 1byte�� Ȱ��
				if(data == -1) {break;}
				System.out.println(data);//���� �Է� ������ ����� ���
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
		catch(IOException e) {
			System.out.println("���� �Է� �� ������ �߻��߽��ϴ�.");
		}
	}
}
