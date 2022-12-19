package chap11;

import java.util.Stack;

public class StackQueueTest {

	public static void main(String[] args) {
		Stack st = new Stack();//동적으로 크기 변화.중복저장.데이터저장순서있다 (List와같다) + (stack만의특징)LIFO
		st.push(1);
		st.push(2);
		st.push(3);//push(): 데이터를저장한다
		System.out.println(st.pop());//3
		System.out.println(st.pop());//2
		System.out.println(st.pop());//1

	}

}
