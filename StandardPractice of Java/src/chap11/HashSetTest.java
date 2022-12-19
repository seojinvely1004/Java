package chap11;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet set = new HashSet(5);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(5);
		System.out.println(set.size());
		

	}

}
