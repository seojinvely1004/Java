package chap11;

import java.util.Arrays;

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
		int [] arr_copy2 = Arrays.copyOfRange(arr, 2, 5);//2���ε��� ~ 5���ε��� ������ range�ֱ� 
		System.out.println(Arrays.toString(arr_copy2));
		System.out.println("��====>" + Arrays.toString(arr));
	}

}
