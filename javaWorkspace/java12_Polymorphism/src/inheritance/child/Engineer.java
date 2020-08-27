package inheritance.child;

import inheritance.parent.Employee;
import inheritance.util.MyDate;

//�ڽ�, child. subŬ����
public class Engineer extends Employee{
	private String tech;
	private double bonus;
	
	//Employee�� �⺻�����ڸ� �����ָ� error�� ����.
	//�ڽĿ��� �θ�Ŭ������ ����� ���� �־�����Ѵ�. 
	public Engineer(String name, double salary, MyDate birthDate,String tech, double bonus) {
		//�ڽ� ������ ù���ο��� �θ������ ȣ���� ������ �Ͼ�� �Ѵ�.
		super(name,salary,birthDate);
		this.tech = tech;
		this.bonus = bonus;
	}
	
	
	public double getBonus() {
		return bonus;
	}

	public void changeTech(String tech) {
		this.tech = tech;
	}
	
	//1.�״�� �����޴´� 2.��ģ��
	public String getDetails() {
		return super.getDetails()+","+tech+","+bonus; //Employee�� getDetails()ȣ��
	}

}
