package inheritance.test;
/*
 * ����������
 * ::
 * poly + morphism
 * ::
 * �ϳ��� ��ü������ �������� ���� ����� ������ �ɷ�
 * ::
 * �θ�Ÿ������ �ڽİ�ü �����ϴ� ��
 * 
 * Virtual Methods(�ڽ��� �޼ҵ�) Invocation ����
 * : ��� + �������̵��� �޼ҵ忡���� ��Ÿ���� ����
 * 1) ������ ���� �޼ҵ� -- Employee�� getDetails()�� ȣ��
 * 2) ���� ���� �޼ҵ� -- �ڽ��� getDetails()�� ȣ��
 * 
 * Object Casting
 */

import inheritance.child.Engineer;
import inheritance.child.Manager;
import inheritance.child.Secretary;
import inheritance.parent.Employee;
import inheritance.util.MyDate;

public class PolymorphismTest1 {
	public static void main(String[] args) {
		Employee e1 = new Employee("�̼���", 14000.0, new MyDate(1999, 4, 11));
		Manager m1 = new Manager("��ȣ��", 19000.0, new MyDate(1984, 1, 16), "ü����");
		Engineer eg1 = new Engineer("�ڳ���", 56000.0, new MyDate(1981,9,19),"JAVA", 400);
		Secretary s1 = new Secretary("�ں���", 36000.0, new MyDate(1991,6,16), "��ȣ��");
		
		m1.ChangeDept("��ȹ��");
		
		
		System.out.println("======������ ����մϴ�.------");
		System.out.println(e1.getDetails());
		System.out.println(m1.getDetails());
		System.out.println(eg1.getDetails());
		System.out.println(s1.getDetails());
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("======Polymorphism ������� ��ü ����------");
		Employee e2 = new Manager("��ȣ��2", 14000.0, new MyDate(1999, 4, 11),"ü����");
		Employee e3= new Engineer("�ڳ���2", 56000.0, new MyDate(1981,9,19),"C", 400);
		Employee e4= new Secretary("�ں���2", 46000.0, new MyDate(1981,9,19),"��ȣ��");
		
		//�߰� 
		((Engineer) e3).changeTech("�ڹ�");
		
		//Object Casting
		/*Engineer eg3 = (Engineer)e3;
		eg3.changeTech("Java");*/
		
		
		System.out.println("======������ ����մϴ�2.------");
		System.out.println(e2.getDetails());
		System.out.println(e3.getDetails());
		System.out.println(e4.getDetails());
			

	}

}
