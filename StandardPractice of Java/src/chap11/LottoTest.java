package chap11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LottoTest {

	public static void main(String[] args) {
		HashSet lottoSet = new HashSet(6);

		for(int i = 0; lottoSet.size()<6; i++) {
			int num = (int)(Math.random()*45) +1;
			lottoSet.add(new Integer(num));
		}

		List ran = new LinkedList(lottoSet);
		Collections.sort(ran);
		System.out.println(ran);

	}

}
