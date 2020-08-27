package inheritance.test;

import inheritance.child.Manager;
import inheritance.parent.Employee;
import inheritance.util.MyDate;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//�θ�ü�� ����
		Employee e1 = new Employee("�̼���");
		Employee e2 = new Employee("��ȣ��", 11000.0, new MyDate(1999,6,5));
		
		//�ڽ� ��ü�� ����
		Manager m = new Manager("James",230000.0,new MyDate(1999,4,11),"���ߺ�");
		
		System.out.println(m.getDetails());
		System.out.println(e1.getDetails());
		System.out.println(e2.getDetails());

	}

}
