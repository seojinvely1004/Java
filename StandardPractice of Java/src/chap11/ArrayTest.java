package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		int [] arr_copy2 = Arrays.copyOfRange(arr, 2, 5);//2번인덱스 ~ 5번인덱스 전까지 range주기 [2, 3, 4]
		System.out.println(Arrays.toString(arr_copy2));
		System.out.println("비교====>" + Arrays.toString(arr));
		
		System.out.println("============배열의 정렬sort()========");
		int ran [] = {45,1,23,889,99};
		Arrays.sort(ran);
		System.out.println(Arrays.toString(ran));//[1, 23, 45, 99, 889]
		
		System.out.println("============배열을 List로 변환 - asList(Object...a)========");
		//타입 변환 - 배열과 ArrayList(정적/동적
		List list = Arrays.asList(ran);//배열인데 list로 변환하려는 ran
		//list.add(100);컴파일 오류 아님. 아래를 수행하기위해 주석처리/list는 인터페이스타입이다. 인터페이스자체는 객체생성불가하다.배열이 갖고있는 내용을 그대로 복사는 되지만, 인터페이스타입으로 형변환되었다고 생각해야한다.
		System.out.println("============ArrayList를 배열로 변환========");
		//ArrayList를 배열로 변환
		ArrayList list2 = new ArrayList(5);
		list2.add("java");
		list2.add(10);
		list2.add(3.14);
		Object [] list_arr = new Object[list2.size()];
		list2.toArray(list_arr);//list2의 갯수(size)만큼 list_arr에 복사.
		System.out.println(Arrays.toString(list_arr));
		
		
	}

}
