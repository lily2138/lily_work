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
public class MapTest2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("��ȣ��", 90);
		map.put("�̼���",100);
		map.put("�ǿ�", 60);
		map.put("����", 90);
		//���� �ߺ�����. key���� �ߺ��ȵȴ�
		
		
		Set<String> key = map.keySet();
		
		for(String name:key) {
			System.out.println(map.get(name));
		}
		


		
		
		
	}
}
