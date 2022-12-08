package chap5;

public class ArrayTest {

	public static void main(String[] args) {
		int []ar = new int[5];
		System.out.println("ar배열의 길이는 = " + ar.length);

		System.out.print("정수배열의 자동 초기화값");
		//for(int i = 0; i <= 5; i++) : ArrayIndexOutOfBoundsException 
		//배열의 길이를 5라고 선언해줬으며 변경 불가하다.
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "-");
		}
		System.out.println();
		System.out.print("정수배열의 사용자 저장값");
		for(int i = 0; i < ar.length; i++) {
			//ar[i] = (i+1)*10;
			ar[i] = (int)(Math.random() * 50) +1;//1~50
			System.out.print(ar[i] + "-");
		}
		System.out.println();
		int min = 1000;//찾은것중의 최소값으로 바꾸기 
		//ar===>[23, 49, 50, 1, 5]
		for(int i = 0; i <ar.length; i++) {
			if(min > ar[i]) {
				//min과 ar의 i번째 인덱스를 바꾸기
				int temp = ar[i];
				ar[i] = min;
				min = temp;
				//i=0 1000과 23비교 : (min>ar[i]만족) > 1000, 49, 50, 1, 5 
				// i=1 49 와 23 비교 : 불만족
				//i=2 불만족, i=3만족 i=4불만족 >1000,49,50,23,5이며 i=1이다.
			}
			//System.out.println(i + "번째 데이터 반복 후 " + min);
			System.out.println("최소값 = " + min);
		}
	}
}
	/*int min = 1000;
	//ar===>[23, 49, 50, 1, 5]
	for(int i = 0; i <ar.length; i++) {
		if(min > ar[i]) {
			//min과 ar의 i번째 인덱스를 바꾸기
			int temp = ar[i];
			ar[i] = min;
			min = temp;

		}

	}*/


