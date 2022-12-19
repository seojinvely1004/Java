package chap11;

import java.util.Stack;

public class StackQueueTest {

	public static void main(String[] args) {
		Stack st = new Stack();//동적으로 크기 변화.중복저장.데이터저장순서있다 (List와같다) + (stack만의특징)LIFO
		st.push(1);
		st.push(2);
		st.push(3);//push(): 데이터를저장한다
		while(!st.isEmpty()) {//stack이 비어있지 않으면 pop을 반복해라. 
			System.out.println(st.pop());
		}
		//System.out.println(st.pop());//3 조회 후 '삭제'한다.
		//System.out.println(st.pop());//2
		//System.out.println(st.pop());//1 > stack에 데이터 없다.
		//System.out.println(st.pop());//Exception in thread "main" java.util.EmptyStackException
	}

}
