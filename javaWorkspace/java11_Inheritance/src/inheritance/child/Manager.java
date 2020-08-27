package inheritance.child;

import inheritance.parent.Employee;
import inheritance.util.MyDate;

//�ڽ�, child. subŬ����
public class Manager extends Employee{
	private String dept;
	
	//Employee�� �⺻�����ڸ� �����ָ� error�� ����.
	//�ڽĿ��� �θ�Ŭ������ ����� ���� �־�����Ѵ�. 
	public Manager(String name, double salary, MyDate birthDate,String dept) {
		//�ڽ� ������ ù���ο��� �θ������ ȣ���� ������ �Ͼ�� �Ѵ�.
		super(name,salary,birthDate);
		this.dept = dept;
	}
	
	//1.�״�� �����޴´� 2.��ģ��
	public String getDetails() {
		return super.getDetails(); //Employee�� getDetails()ȣ��
	}

}
