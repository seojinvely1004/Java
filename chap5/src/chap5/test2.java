package chap5;

public class test2 {

	public static void main(String[] args) {
		/**입력변수 (min5~max10개 라고가정한다.)
		 * 45 89 100 23 234 567 
		 * 입력된 변수 갯수 오름차순으로 정렬 결과 출력한다.
		 * > int형변환, 정렬(asc) 
		 */
		int[] arr = {45,89,100,23,234,567};
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j <arr.length;j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			if(i + 1 != arr.length) {
				System.out.println(",");
			}
		}

	}

}
