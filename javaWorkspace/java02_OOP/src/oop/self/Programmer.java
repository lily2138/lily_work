package oop.self;

public class Programmer {
	
	//�ʵ� ����
	public String name;
	public int age;
	public float salary;
	public int bonus;
	
	//�ʵ忡 ���� �� ����ֱ�
	public void setProgrammer(String n, int a, float s, int b) {
		name = n;
		age = a;
		salary = s;
		bonus = b;
	}
	
	public String getProgrammer() {
		return name+","+age+","+salary+","+bonus;
	}
	
	public float getAnnualSalary() {
		return salary*12 + bonus;
	}

}
