package collection.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CustomerMapTest {

	public static void main(String[] args) {
		HashMap<String, Customer> map = new HashMap<>();
		
		map.put("111", new Customer("kim","������", 40));
		map.put("222", new Customer("seung","������", 35));
		map.put("333", new Customer("lee","�̰��", 55));
		
		System.out.println(map);
		
		///1. 222�� �ش��ϴ� ����� ������ ���
		/*Set<String> keys = map.keySet();
		for(String key: keys) {
			if(key.equals("222"))
				System.out.println(map.get(key));
		}*/
		System.out.println(map.get("222"));
		
		///2. id�� kim�� ����� ã�Ƽ� �׻���� �̸��� ���
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			Customer c = map.get(it.next());
			if(c.getId().equals("kim")) {
				System.out.println(c.getName());
			}
		}
		
		
		///3. map�� ����� ��� key���� ���
		System.out.println(map.keySet());
		
		///4. ��� ����� ������ ���հ� ��տ����� ���
		Set<String> set1 = map.keySet();
		int totalAge = 0;
		for(String s : set1) {
			totalAge+=map.get(s).getAge();
		}
		System.out.println("���� :" + totalAge+"��");
		System.out.println("��տ���:" + totalAge/map.size()+"��");
		
		
	}

}
