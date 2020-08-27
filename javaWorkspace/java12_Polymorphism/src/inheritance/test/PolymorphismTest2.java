package inheritance.test;

import inheritance.child.Engineer;
import inheritance.child.Manager;
import inheritance.child.Secretary;
import inheritance.parent.Employee;
import inheritance.service.PolymorphismService;
import inheritance.util.MyDate;

public class PolymorphismTest2 {
	public static void main(String[] args) {
	
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("======Polymorphism ������� ��ü ����------");
		Employee e2 = new Manager("��ȣ��2", 14000.0, new MyDate(1999, 4, 11),"ü����");
		Employee e3= new Engineer("�ڳ���2", 56000.0, new MyDate(1981,9,19),"C", 400);
		Employee e4= new Secretary("�ں���2", 46000.0, new MyDate(1981,9,19),"��ȣ��");
		Employee e5 = new Manager("��ȣ��3", 14000.0, new MyDate(1999, 4, 11),"ü����");

		//Heterogeneous Collection
		Employee[] emps = {e2,e3,e4,e5};
		
		//���� ����
		PolymorphismService service = new PolymorphismService();
		service.handleEmployee(emps);
		
		//���࿡ employee�� �������� �迭 ���� ���ƾ��Ѵ�.--->�̷��� �ϸ� �Ѳ����� ������ �� �ִ�.
		for(Employee e : emps) {
			System.out.println(e.getDetails());
		}
	}

}
