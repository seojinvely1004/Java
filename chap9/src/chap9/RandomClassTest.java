package chap9;

import java.util.Random;

public class RandomClassTest {

	public static void main(String[] args) {
		int mathran = (int)(Math.random()*100) + 1;//1~100임의의수생성
		System.out.println("Math.random()정수 = " + mathran);
		Random ran = new Random();
		System.out.println("Random 정수 = " + ran.nextInt(100));
		System.out.println("Random 정수 = " + ran.nextDouble(100.0));		
	}
}
