package test;

public class test3 {

	public static void main(String[] args) {
		int books = 100;//������ ��
		int cntOfStu = 12;//�л���
		//12���� �л����� xx�Ǿ��� �������ݴϴ�. 
		//���� å�� xx���Դϴ�.
		int quotienBook = books/cntOfStu;
		int remainder = books%cntOfStu;
		
		/*System.out.println(cntOfStu +"���� �л����� " + quotienBook + "���� �������ݴϴ�.\n "
				+ "���� å��" + remainder + "�� �Դϴ�.");*/
		System.out.printf("%d���� �л����� %d�Ǿ� ������ �ݴϴ�. ���� å�� %d�� �Դϴ� ", cntOfStu, quotienBook, remainder);

	}

}
