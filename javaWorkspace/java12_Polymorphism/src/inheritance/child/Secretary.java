package inheritance.child;

import inheritance.parent.Employee;
import inheritance.util.MyDate;

//�ڽ�, child. subŬ����
public class Secretary extends Employee{
	private String nameOfBoss;
	
	//Employee�� �⺻�����ڸ� �����ָ� error�� ����.
	//�ڽĿ��� �θ�Ŭ������ ����� ���� �־�����Ѵ�. 
	public Secretary(String name, double salary, MyDate birthDate,String nameOfBoss) {
		//�ڽ� ������ ù���ο��� �θ������ ȣ���� ������ �Ͼ�� �Ѵ�.
		super(name,salary,birthDate);
		this.nameOfBoss = nameOfBoss;
	}
	
	//1.�״�� �����޴´� 2.��ģ��
	public String getDetails() {
		return super.getDetails()+","+nameOfBoss; //Employee�� getDetails()ȣ��
	}

}
