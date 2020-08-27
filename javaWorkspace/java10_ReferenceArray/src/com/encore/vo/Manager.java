package com.encore.vo;

import com.encore.util.MyDate;

public class Manager {
	private String name;
	private MyDate birthDate;
	private double salary;
	private String dept;
	private int deptNo;
	
	public Manager(String name, MyDate birthDate, double salary, String dept, int deptNo) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
		this.dept = dept;
		this.deptNo = deptNo;
	}

	public String getName() {
		return name;
	}
	
	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDetails() {
		//�Ʒ��� �ڵ带 �����ϸ� birthDate�κ��� �ּҰ����� ���´�.
		//birthDate.toString()�� ����--->toString �� MyDate�� ���µ� ������ �ߵȴ�. ---> ObjectŬ�������� �ڵ������� ��������
		//======> ��� Ŭ������ �θ�Ŭ������ Object�̴�. 
		return name +","+ birthDate+","+salary +","+ dept +","+ deptNo;
		// name +","+ birthDate.getBirthDate+","+salary +","+ dept +","+ deptNo;
	}
	
	
}
