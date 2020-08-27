package collection.test1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
 * ::
 * key-value�� ������ �����ϴ� Ư¡�� ������.
 * 
 */
public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("��ȣ��", 90);
		map.put("�̼���",100);
		map.put("�ǿ�", 60);
		map.put("����", 90);
		//���� �ߺ�����. key���� �ߺ��ȵȴ�
		
		System.out.println(map);
		
		//1. Ű�� �޾ƿ´�...keySet()
		Set<String> set = map.keySet();
		
		//Set �÷����� List �÷���ó�� �ε����� ��ü�� �˻��ؼ� �������� �޼ҵ尡 ����
		//��� ��ü ��ü�� ������� �� �� �� �� �������� �ݺ���, Iterator�� �����Ѵ�. 
		//Collection�� ��������.
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name+"===="+map.get(name));
		}
		
		//2. Ű�� �ش��ϴ� value�� ã�Ƽ� ���
		Collection<Integer> col = map.values();	//90,100,80,85
		int total = 0;
		
		Iterator<Integer> it2 = col.iterator();
		while(it2.hasNext()) {
			total += it2.next(); 
		}
		
		System.out.println("���� :" + total);
		
		//3.
		System.out.println("���: "+total/map.size());
		System.out.println("�ְ�����:"+Collections.max(col));
		System.out.println("��������:"+Collections.min(col));

		
		
		
	}
}
