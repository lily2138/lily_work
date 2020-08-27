package collection.test2;

import java.util.ArrayList;

public class PersonListTest {

	public static void main(String[] args) {
		//List�ȿ� �������� Person���� ����... �������...
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("�̼���", "���ǵ�", 66));
		list.add(new Person("������", "��õ", 41));
		list.add(new Person("��������", "����", 19));
		list.add(new Person("�̼���1", "���ǵ�", 61));
		list.add(new Person("������1", "��õ1", 44));
		list.add(new Person("��������1", "���ǵ�", 31));
		
		System.out.println(list); //Person class�� toString ���ϸ� �ּҰ����γ��´�
		
		//1. �ι�° �屺�� ã�Ƽ� ������ ���
		System.out.println(list.get(1));
		
		//2. ����Ʈ�� ����ִ� �屺���� ���� ���
		System.out.println(list.size());
		
		//3. ����Ʈ�� ����� �屺���� ��� ������ ���
		int total = 0;
		for(Person p: list)
			total += p.getAge();
		
		System.out.println(total/list.size());
		
		//4. ����� �屺���� �̸��� ���
		for(Person p:list)
			System.out.println(p.getName());
		
		//5. ���ǵ��� ��� ����� ���
		for(Person p:list) {
			if(p.getAddr().equals("���ǵ�")) {
				System.out.println(p.getName());
			}
		}

	}

}
