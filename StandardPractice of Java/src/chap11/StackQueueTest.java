package chap11;

import java.util.Stack;

public class StackQueueTest {

	public static void main(String[] args) {
		Stack st = new Stack();//�������� ũ�� ��ȭ.�ߺ�����.��������������ִ� (List�Ͱ���) + (stack����Ư¡)LIFO
		st.push(1);
		st.push(2);
		st.push(3);//push(): �����͸������Ѵ�
		System.out.println(st.pop());//3
		System.out.println(st.pop());//2
		System.out.println(st.pop());//1

	}

}
