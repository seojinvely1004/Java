package chap11;

import java.util.Stack;

public class StackQueueTest {

	public static void main(String[] args) {
		Stack st = new Stack();//�������� ũ�� ��ȭ.�ߺ�����.��������������ִ� (List�Ͱ���) + (stack����Ư¡)LIFO
		st.push(1);
		st.push(2);
		st.push(3);//push(): �����͸������Ѵ�
		while(!st.isEmpty()) {//stack�� ������� ������ pop�� �ݺ��ض�. 
			System.out.println(st.pop());
		}
		//System.out.println(st.pop());//3 ��ȸ �� '����'�Ѵ�.
		//System.out.println(st.pop());//2
		//System.out.println(st.pop());//1 > stack�� ������ ����.
		//System.out.println(st.pop());//Exception in thread "main" java.util.EmptyStackException
	}

}
