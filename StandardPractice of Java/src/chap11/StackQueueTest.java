package chap11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {

	public static void main(String[] args) {
		Stack st = new Stack();//�������� ũ�� ��ȭ.�ߺ�����.��������������ִ� (List�Ͱ���) + (stack����Ư¡)LIFO
		st.push(1);
		st.push(2);
		st.push(3);//push(): �����͸������Ѵ�
		while(!st.isEmpty()) {//stack�� ������� ������ pop�� �ݺ��ض�. 
			System.out.println(st.pop());//����� ��ȸ �� ���� 3 2 1
			//System.out.println(st.peek());//����� ��ȸ//33333333333333333
		}//while end
		//System.out.println(st.pop());//3 ��ȸ �� '����'�Ѵ�.
		//System.out.println(st.pop());//2
		//System.out.println(st.pop());//1 > stack�� ������ ����.
		//System.out.println(st.pop());//Exception in thread "main" java.util.EmptyStackException
		
		System.out.println("=================================");
		Queue qu = new LinkedList();//Ÿ���� �������̽��� �ְ�, LinkedList�� ����ü�� �Ἥ �޼����Ȯ���ϱ�
		qu.offer(1);
		qu.offer(2);
		qu.offer(3);
		while(!qu.isEmpty()) {
			System.out.println(qu.poll());//poll(): ť���� ��ü�� ������ ��ȯ(��������ȸ�Ļ���)
		}
	}//main
}//class
