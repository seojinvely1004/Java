package chap11;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("hong@email.com","ȫ�浿" );//Ű�� �����ؾ��ϹǷ� email��, ���� �ߺ��� ����ϹǷ� �̸������־���.
		map.put("lee@email.com","���ڹ�");
		map.put("lee@sba.net","�����");
		map.put("hong@email.com", "ȫ�ڹ�");//������ ���Ѵ�.
		System.out.println(map.size());//3
		//��ȸ : key�ǰ����� ��ȸ�Ѵ�.
		Object o = map.get("hong@email.com");//
		System.out.println(o);//ȫ�ڹ�
	}

}
