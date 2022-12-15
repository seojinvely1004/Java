package chap9;

import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {
		//대한민국 공공정보 공개 사이트 - 공공포탈api
		String address = "서울시 용산구 청파동 전자월드 3층 새싹아카데미";
		String[] result = address.split(" ");
		System.out.println(Arrays.toString(result));
	}

}
