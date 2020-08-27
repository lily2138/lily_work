package com.encore.test;

import com.encore.service.EmployeeService;
import com.encore.util.MyDate;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeServiceTest {
	public static void main(String[] args) {
		//1. Service ��ü�� ����
		EmployeeService service = new EmployeeService(5);
		
		//2. method�� ���� ȣ��..
		//=======================�߰�===================================
		Manager man1 = new Manager("��ȣ��", new MyDate(1991,4,11), 40000, "�λ���", 60);
		Manager man2 = new Manager("�̼���", new MyDate(1994,11,06), 90000, "��ȹ��", 40);
		Manager man3 = new Manager("������", new MyDate(1981,6,15), 36000, "�λ���", 60);
		Manager man4 = new Manager("�̽±�", new MyDate(1986,10,9), 54000, "��ȹ��", 40);
		service.addManager(man1); //---> service.addManager(new Manager("��ȣ��", new MyDate(1991,4,11), 40000, "�λ���", 60));
		service.addManager(man2);
		service.addManager(man3);
		service.addManager(man4);
	
		//service.printManagers();
		
		Engineer eng1 = new Engineer("������", new MyDate(1984,1,11), 36000, "JAVA", 600);
		Engineer eng2 = new Engineer("�̵���", new MyDate(1991,3,9), 56000, "C���", 100);
		Engineer eng3 = new Engineer("������", new MyDate(1990,7,04), 41000, "Python", 400);
		service.addEngineer(eng1);
		service.addEngineer(eng2);
		service.addEngineer(eng3);
		
		//service.printEngineers();
		
		//=======================����===================================
		
		service.deleteManager("�̽±�");
		service.deleteEngineer("������");
		//service.printManagers();
		//service.printEngineers();
		
		//=======================����===================================
		
		service.updateManager(64000, "��ȹ��", 40, "�̼���");
		service.updateEngineer(56000, "JAVA", 600, "�̵���");
		System.out.println("=========�����Ȼ���=========");
		service.printManagers();
		service.printEngineers();
	}

}
