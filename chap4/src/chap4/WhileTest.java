package chap4;

public class WhileTest {

	public static void main(String[] args) {
		/*for(int i = 1; i <=10; i++) {
			int test = (int)(Math.random() * 100) +1;
			System.out.println(test);
		}*/
		/*int i = 1;
		while(i <=10) {
			int test = (int)(Math.random() * 100) +1;
			System.out.println(test);//무한loop
			i++;//이걸 써줘야 원하는갯수만큼나옴
			
		}*/
		/*int test = (int)(Math.random() * 100) + 1;
		System.out.println(test);
		//test변수가 50이면 중단
		while(test != 50) {//50이 아니면 반복
			test = (int)(Math.random() * 100 + 1);
			System.out.println(test);
		}*/
		//test변수가 10이면 중단
		
		//자바의 이동문 break
		/*while(true) {//10이 아니면 반복
			int test = (int)(Math.random() * 20 + 1);
			System.out.println(test);
			if(test == 10) break;//반복종료조건식
			//for, while, do-while 블록 내부 1문장만 포함시 {} 생략 가능하다.
		}*/
		while(true) {//10이 아니면 반복
			int test = (int)(Math.random() * 20 + 1);
			if(test == 10) continue; //10은 출력하지 말라는 뜻.
			if(test % 3 == 0) break;//3의 배수가 나오면 멈춰라
			System.out.println(test);//중단되지while문의 true로 간다.continue밑의문장출력안하고 다시 test만들어서 만족하면 출력하지않고, 만족시 출력.
			//for, while, do-while 블록 내부 1문장만 포함시 {} 생략 가능하다.
		}

	}

}
