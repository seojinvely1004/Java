package chap7;

class Employee{//���
	int id;
	String name;
	String dept;
	double salary;
}
class Manager extends Employee{//������
	String job;
	
}
public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.id = 100;//���
		m.name = "ũ��";//���
		m.dept = "������";//���
		m.job = "��������";//�ڽ�
		System.out.printf
		("��� =%d �̸� =%s �μ��� =%s ��������=%s\n",
				m.id, m.name, m.dept, m.job);

	}

}
