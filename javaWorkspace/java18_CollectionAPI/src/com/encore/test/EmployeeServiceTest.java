package com.encore.test;

import java.util.ArrayList;

import com.encore.service.EmployeeService;
import com.encore.util.MyDate;
import com.encore.vo.Employee;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeServiceTest {
	public static void main(String[] args) {
		//1. Service ��ü�� ������ �ƴ϶� ������ ��ü�� �ϳ� �޾ƿ´�(�̱���)
		EmployeeService service = EmployeeService.getInstance();
		
		//2. method�� ���� ȣ��..
		System.out.println("============ 1. add ============ ");
		Manager m1 = new Manager("�̼���", new MyDate(1978, 1, 1), 10000.0, "���ߺ�", 10); 
		Manager m2 = new Manager("��ȣ��", new MyDate(1975, 2, 1), 34000.0, "��ȹ��", 20);
		Manager m3 = new Manager("���ϴ�", new MyDate(1980, 3, 3), 40000.0, "������", 30);
		
		Engineer eg1 = new Engineer("������", new MyDate(1995,3,4), 360000.0, "Java", 200.0);
		Engineer eg2 = new Engineer("��ä��", new MyDate(1995,7,2), 360000.0, "Java", 200.0);
		
		service.addEmployee(m1);
		service.addEmployee(m2);
		service.addEmployee(m3);
		service.addEmployee(eg1);
		service.addEmployee(eg2);
		
		service.getEmployee();
		
		System.out.println("============ 2. delete ============ ");
		service.deleteEmployee("���ϴ�");
		service.getEmployee();
		
		System.out.println("============ 3. update ============ ");
		service.updateEmployee(new Manager("��ȣ��", new MyDate(1975, 2, 1), 34000.0, "�ѹ���", 100));
		service.getEmployee();
		
		System.out.println("======================== 4. find ================================== ");
		ArrayList<Employee> retList=service.findEmployee(360000.0);
		System.out.println(retList);
	}
}







