package chap7;

class Employee{//���
	int id;
	String name;
	String dept;
	double salary;
	void calcSalary(int salary) {
		this.salary = salary*2;
	}
	void printAll() {
		System.out.printf("��� = %d �̸� = %s �μ��� = %s �޿� = %f\n", id, name, dept, salary);
	}
}

class Manager extends Employee{//������
	String job;
	//calcSalary, printAll �޼ҵ� Employee���� ������ ��� ��ӹ޾� ����� �� �ִ�.
	//�޼����� ������ �����ϰ� �ʹ� - �޼ҵ� ���� ���������Ͽ� ��� ������ : overriding
	//printAll�� +job ====> overriding
	//
	@Override //'@'�ڹ������Ϸ����� �˷��ִ� �ּ���
	void printAll() {
		System.out.printf("��� = %d �̸� = %s �μ��� = %s �޿� = %.2f �������� = %s\n", id, name, dept, salary, job);
		
	}
}
public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.id = 100;//���
		m.name = "ũ��";//���
		m.dept = "������";//���
		m.job = "��������";//�ڽ�
		m.calcSalary(50000);//���
		m.printAll();//��ӹ޾Ƽ� �޼ҵ� ������ = overriding
		/*System.out.printf
		("��� =%d �̸� =%s �μ��� =%s ��������=%s\n",
				m.id, m.name, m.dept, m.job);*/

	}

}
