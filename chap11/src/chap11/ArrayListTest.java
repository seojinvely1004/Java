package chap11;
import java.util.ArrayList;
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);
		list.add("java");
		list.add(10);
		list.add(3.14);
		System.out.println(list.size());
		
		for(int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i).getClass().getName() + ":");
			System.out.println(list.get(i));
		}
		
		

	}

}
