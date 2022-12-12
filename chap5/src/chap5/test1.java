package chap5;

public class test1 {

	public static void main(String[] args) {
		/* 입력받은 변수와 별의 관계 / 입력받은 변수와 공백의 관계 ==>중첩for문이용하기.
		 *  공백4개 별1개
		 *** 공백3개 별3개
		 ***** 공백2개 별5개
		 ******** 공백1개 별7개
		 **********공백0개 별9개
		 * */
		//1. 공백 없는 별i 찍기 
		/*int k = 0;
		for(int j = 0; j < 10; j ++) {
			for(int i = 0; i <=k; i++) {//*찍기 변수 i (1~ ++)
				System.out.print("*");
			}
			k++;
			System.out.printf("\n");
		}*/

		/*int k = 0;
		for(int j = 0; j<10; j++) {
			for(int m = 0; m<k; m--) {
				System.out.println(" ");
			}
			for(int i = 0; i<=k; i++) {
				System.out.println("*");
			}			
		}*/
		//2.공백m 찍기
		for(int i = 1; i <=10; i ++) {
			for(int j = 0; j<10-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
