package chap12;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String[]> map = new HashMap();
		//map.put("hong@email.com","홍길동" );//키는 유일해야하므로 email로, 값은 중복을 허용하므로 이름으로주었다.
		map.put("hong@email.com", new String[] {"홍길동", "010-2222-2222", "031-444-5555", "02-111-2222"});
		map.put("lee@email.com",new String[] {"이자바","2000-12-12"});
		map.put("lee@sba.net", new String[] {"김새싹", "용산캠퍼스"}); 
		map.put("hong@email.com", new String[]{"홍자바","010-2222-2222","031-444-5555","02-111-2222"});//수정을 뜻한다.
		
		System.out.println(map.size());//3
		//조회 : key의값으로 조회한다.
		//키들을 조회한다
		Set<String> keys = map.keySet();//키값은 set에서 가져오고 ,해당키에 대한 값은 map에서가져온다 
		for(String onekey : keys){//키
			String[] value = (String[])(map.get(onekey));//object에서 String으로 형변환
			System.out.println("키 = "+ onekey);
			for(String one : value) {//배열내부의 값들 출력하기
				System.out.println(one + " : ");
			}
			System.out.println();
			// 해당키에 대한 값은 map에서가져온다
		}
	}

}
