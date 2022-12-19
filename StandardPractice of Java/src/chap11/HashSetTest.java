package chap11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet set = new HashSet(5);
		//100���� ������ ������ �� �ߺ��ȼ������������� �� �ִ� : ArrayList���
		//1~100������ �Ҽ��� ����, �ζǹ�ȣ�� �����ϴ� ���� �ߺ��� ���� : HashSet��� 
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(5);//set�� �ߺ�������������Ƿ� size�� �Ȱ��� 5, ������ �ƿ� �����Ѵ�. 
		System.out.println(set.size());
		System.out.println("=======��������============");
		//lottoSet�� ���� ran�� �����Ͽ� ũ�� 6���� �ݺ��� stop
		HashSet lottoSet = new HashSet(6);
		
		while(true) {
			int ran = (int)(Math.random()*45) + 1;
			System.out.println(ran);
			lottoSet.add(ran);
			System.out.println("����===>" + lottoSet.size());
			if(lottoSet.size() == 6) break;
		}
		System.out.println("=========Iterator====");
		//LOTTOSET ��������ȸ , �������� P411
		//Iterator�� ������ �ݺ������� ��ȸ ��ɸ� �ִ� �÷��� ����(�����ɾ���)
		//hasNext() : �о� �� ���� �����Ͱ� �ִ� ? > boolean
		//���� �����͸� ��ȸ�� �� �ִ�. 
		Iterator it = lottoSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		/*while(true) {
			int ran = (int)(Math.random()*45) + 1;
			System.out.println(ran);
		}*/
		//lottoSet�� ran ������ �����ϰ� , lottoSet ũ�� 6���̸� �ݺ��� stop�ϵ��� �����ϱ�
		
		/*for(int i = 1; i <=6; i ++) {
			int ran = (int)(Math.random()*45) + 1;
			System.out.println(ran);
		}*///�̿Ͱ��� for�����ܼ���6�������� 6���� ���������� �ߺ����� ���� ���� ����. ��������Ǳ����� ��� ���ִ� ���� HashSet
		
	}
}
