package chap7;

class Employee{//���
	String title = "���";
	int id;
	String name;
	String dept;
	double salary;
	void calcSalary(int salary) {
		this.salary = salary*2;
	}
/*default����*/	void printAll() {
		System.out.printf("��� = %d �̸� = %s �μ��� = %s �޿� = %f\n", id, name, dept, salary);
	}
}

class Manager extends Employee{//������
	String title = "������";
	void test() {//����� ���� �͵� �ƴϸ�, �������̵��� �ƴϸ�, ���� �߰��� �޼����̴�.
		String title = "test�޼ҵ� ����";
		System.out.println(title);//��������
		System.out.println(this.title);//������. ManagerŬ������ �������
		System.out.println(super.title);//��� . ��ӹ��� title
	}
	String job;
	//calcSalary, printAll �޼ҵ� Employee���� ������ ��� ��ӹ޾� ����� �� �ִ�.
	//�޼����� ������ �����ϰ� �ʹ� - �޼ҵ� ���� ���������Ͽ� ��� ������ : overriding
	//printAll�� +job ====> overriding
	
	@Override //'@'�ڹ������Ϸ����� �˷��ִ� �ּ���
/*private�°����ϴ�*/void printAll() {
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
		m.test();

	}

}
