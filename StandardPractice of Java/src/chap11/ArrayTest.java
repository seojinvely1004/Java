package chap11;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int [] arr = {0,1,2,3,4};
		int [] [] arr2 = {{1,2}, {3,4,5}, {6,7,8,9}};
		System.out.println(Arrays.toString(arr));//1차원배열은 "toString"[0, 1, 2, 3, 4]
		//System.out.println(Arrays.toString(arr2));//[[I@15db9742, [I@6d06d69c, [I@7852e922]I는 Integer
		System.out.println(Arrays.deepToString(arr2));//2차원이상배열은 "deepToString" [[1, 2], [3, 4, 5], [6, 7, 8, 9]]
		
		System.out.println("============copyOf========");
		int [] arr_copy = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr_copy));//갯수밖에지정못하고, 무조건 첫번째부터 조회가능하다. //[0,1,2]
		System.out.println("비교====>" + Arrays.toString(arr));//비교====>[0, 1, 2, 3, 4]
		//String.join(":", String[])
		
		System.out.println("============copyOfRange========");
		int [] arr_copy2 = Arrays.copyOfRange(arr, 2, 5);//2번인덱스 ~ 5번인덱스 전까지 range주기 
		System.out.println(Arrays.toString(arr_copy2));
		System.out.println("비교====>" + Arrays.toString(arr));
	}

}
