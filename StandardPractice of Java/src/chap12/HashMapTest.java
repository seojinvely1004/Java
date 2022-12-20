package chap12;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String[]> map = new HashMap();
		//map.put("hong@email.com","ȫ�浿" );//Ű�� �����ؾ��ϹǷ� email��, ���� �ߺ��� ����ϹǷ� �̸������־���.
		map.put("hong@email.com", new String[] {"ȫ�浿", "010-2222-2222", "031-444-5555", "02-111-2222"});
		map.put("lee@email.com",new String[] {"���ڹ�","2000-12-12"});
		map.put("lee@sba.net", new String[] {"�����", "���ķ�۽�"}); 
		map.put("hong@email.com", new String[]{"ȫ�ڹ�","010-2222-2222","031-444-5555","02-111-2222"});//������ ���Ѵ�.
		
		System.out.println(map.size());//3
		//��ȸ : key�ǰ����� ��ȸ�Ѵ�.
		//Ű���� ��ȸ�Ѵ�
		Set<String> keys = map.keySet();//Ű���� set���� �������� ,�ش�Ű�� ���� ���� map���������´� 
		for(String onekey : keys){//Ű
			String[] value = (String[])(map.get(onekey));//object���� String���� ����ȯ
			System.out.println("Ű = "+ onekey);
			for(String one : value) {//�迭������ ���� ����ϱ�
				System.out.println(one + " : ");
			}
			System.out.println();
			// �ش�Ű�� ���� ���� map���������´�
		}
	}

}
