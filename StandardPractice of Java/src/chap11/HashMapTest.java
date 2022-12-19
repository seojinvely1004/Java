package chap11;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("hong@email.com","홍길동" );//키는 유일해야하므로 email로, 값은 중복을 허용하므로 이름으로주었다.
		map.put("lee@email.com","이자바");
		map.put("lee@sba.net","김새싹");
		map.put("hong@email.com", "홍자바");//수정을 뜻한다.
		System.out.println(map.size());//3
		//조회 : key의값으로 조회한다.
		Object o = map.get("hong@email.com");//
		System.out.println(o);//홍자바
	}

}
