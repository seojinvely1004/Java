package chap7;
class A{
	int i;
	A(){
		i = 10;//�����ڰ��� 10���� �ʱ�ȭ
		System.out.println("A������ ȣ��");
	}
}
class B extends A{
	int j;
	B(){
		j = 20;//�����ڰ��� 20���� �ʱ�ȭ
		System.out.println("B������ ȣ��");
	}
}
public class SuperTest {

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
		

	}

}
