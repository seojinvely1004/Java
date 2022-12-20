package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		int [] arr = {0,1,2,3,4};
		int [] [] arr2 = {{1,2}, {3,4,5}, {6,7,8,9}};
		System.out.println(Arrays.toString(arr));//1�����迭�� "toString"[0, 1, 2, 3, 4]
		//System.out.println(Arrays.toString(arr2));//[[I@15db9742, [I@6d06d69c, [I@7852e922]I�� Integer
		System.out.println(Arrays.deepToString(arr2));//2�����̻�迭�� "deepToString" [[1, 2], [3, 4, 5], [6, 7, 8, 9]]
		
		System.out.println("============copyOf========");
		int [] arr_copy = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr_copy));//�����ۿ��������ϰ�, ������ ù��°���� ��ȸ�����ϴ�. //[0,1,2]
		System.out.println("��====>" + Arrays.toString(arr));//��====>[0, 1, 2, 3, 4]
		//String.join(":", String[])
		
		System.out.println("============copyOfRange========");
		int [] arr_copy2 = Arrays.copyOfRange(arr, 2, 5);//2���ε��� ~ 5���ε��� ������ range�ֱ� [2, 3, 4]
		System.out.println(Arrays.toString(arr_copy2));
		System.out.println("��====>" + Arrays.toString(arr));
		
		System.out.println("============�迭�� ����sort()========");
		int ran [] = {45,1,23,889,99};
		Arrays.sort(ran);
		System.out.println(Arrays.toString(ran));//[1, 23, 45, 99, 889]
		
		System.out.println("============�迭�� List�� ��ȯ - asList(Object...a)========");
		//Ÿ�� ��ȯ - �迭�� ArrayList(����/����
		List list = Arrays.asList(ran);//�迭�ε� list�� ��ȯ�Ϸ��� ran
		//list.add(100);������ ���� �ƴ�. �Ʒ��� �����ϱ����� �ּ�ó��/list�� �������̽�Ÿ���̴�. �������̽���ü�� ��ü�����Ұ��ϴ�.�迭�� �����ִ� ������ �״�� ����� ������, �������̽�Ÿ������ ����ȯ�Ǿ��ٰ� �����ؾ��Ѵ�.
		System.out.println("============ArrayList�� �迭�� ��ȯ========");
		//ArrayList�� �迭�� ��ȯ
		ArrayList list2 = new ArrayList(5);
		list2.add("java");
		list2.add(10);
		list2.add(3.14);
		Object [] list_arr = new Object[list2.size()];
		list2.toArray(list_arr);//list2�� ����(size)��ŭ list_arr�� ����.
		System.out.println(Arrays.toString(list_arr));
		
		
	}

}
