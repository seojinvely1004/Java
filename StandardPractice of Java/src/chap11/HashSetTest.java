package chap11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet set = new HashSet(5);
		//100명의 성적을 저장할 땐 중복된성적점수가있을 수 있다 : ArrayList사용
		//1~100사이의 소수를 저장, 로또번호를 생성하는 것은 중복이 없다 : HashSet사용 
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(5);//set은 중복허용하지않으므로 size는 똑같이 5, 저장을 아예 무시한다. 
		System.out.println(set.size());
		System.out.println("=======난수생성============");
		//lottoSet에 변수 ran을 저장하여 크기 6개면 반복문 stop
		HashSet lottoSet = new HashSet(6);
		
		while(true) {
			int ran = (int)(Math.random()*45) + 1;
			System.out.println(ran);
			lottoSet.add(ran);
			System.out.println("갯수===>" + lottoSet.size());
			if(lottoSet.size() == 6) break;
		}
		System.out.println("=========Iterator====");
		//LOTTOSET 데이터조회 , 순서없다 P411
		//Iterator는 데이터 반복적으로 조회 기능만 있는 컬렉션 종류(저장기능없다)
		//hasNext() : 읽어 올 다음 데이터가 있니 ? > boolean
		//다음 데이터만 조회할 수 있다. 
		Iterator it = lottoSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		/*while(true) {
			int ran = (int)(Math.random()*45) + 1;
			System.out.println(ran);
		}*/
		//lottoSet에 ran 변수를 저장하고 , lottoSet 크기 6개이면 반복문 stop하도록 구현하기
		
		/*for(int i = 1; i <=6; i ++) {
			int ran = (int)(Math.random()*45) + 1;
			System.out.println(ran);
		}*///이와같이 for문만단순히6번돌리면 6번간 랜덤난수가 중복되지 않을 수가 없다. 사용자정의구현을 대신 해주는 것이 HashSet
		
	}
}
