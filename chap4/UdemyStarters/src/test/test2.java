package test;

public class test2 {
	//�����ڸ� ����Ͽ� ����ϱ�.//�ʸ� �ð�,��,�ʷ� ����ϱ�.
	public static void main(String[] args) {
		//��->�ð� 60*60���� ������
		//��->�� 60���� ������
		//��->60���� ���� ������
		int time = 10000;//�ʴ��� �ð�.
		int hour = time/(60*60);
		int minute = time/60 - (hour*60);
		int second = time%60;
		//System.out.println(time + "�ʴ�" + hour + "�ð�" + minute + "��" + second + "���Դϴ�.");
		System.out.printf("%d�ʴ� %d�ð� %d�� %d���Դϴ�.", time, hour, minute, second);
	}

}
