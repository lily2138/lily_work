package com.encore.service;
import java.util.ArrayList;

import com.encore.vo.Employee;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;
//Manager[]�� ArrayList<Employee> ���
public class EmployeeService {
	
	//�߰�...
	private ArrayList<Employee> list;
	
	//�̱���...
	private static EmployeeService service = new EmployeeService();
	private EmployeeService(){
		list = new ArrayList<>();
	}
	public static EmployeeService getInstance() {
		return service;
	}
	
	
	//
	public void addEmployee(Employee e) {
		boolean find = false;
		for(Employee emp:list) {
			if(e.getName().equals(emp.getName())) { //�̹� �׷������ �ִٸ�.
				find = true;
				System.out.println(e.getName()+"���� �̹� ȸ���̽ʴϴ�.");
				return;
			}
		}
		if(find==false) {	//�߰��ϰ��� �ϴ� ������� ������ ����Ʈ���� ����
			list.add(e);
			System.out.println(e.getName()+"���� ȸ������ ��ϵǼ̽��ϴ�.");

		}
	}

	public void deleteEmployee(String name) {
		boolean find = false;
		for(Employee e:list) {
			if(e.getName().equals(name)) {
				find = true;
				System.out.println(e.getName()+"���� �����մϴ�"); //�����ϱ� ���� ����Ѵ�. �����ϰ� ���� �̸��� ��ã�´�
				list.remove(e);
				break;
			}
		}
		if(find==false)
			System.out.println("������ ����� �������� �ʽ��ϴ�.");

		
/*		for(Employee e:list) {
			if(e.getName().equals(name)) {
				System.out.println(e.getName()+"���� �����մϴ�"); 
				list.remove(e);
				break;
			}
			else {
				System.out.println("������ ����� �������� �ʽ��ϴ�.");
				break;
			}
		}*/
		
		
	}
	
	public void updateEmployee(Employee e) {
//		boolean find = false;
//		for(Employee emp:list) {
//			if(e.getName().equals(emp.getName())) {
//				emp.setName(e.getName());
//				emp.setBirthDate(e.getBirthDate());
//				emp.setSalary(e.getSalary());
//			}
//		}
		boolean find = false;
		for(int i=0 ; i<list.size(); i++) {
			if(list.get(i).getName().equals(e.getName())) {
				find = true;
				System.out.println(e.getName()+"���� �����մϴ�");
				list.set(i, e);
				break;
			}
		}
		if(find==false)
			System.out.println("������ ����� �������� �ʽ��ϴ�.");
	}
	
	
	public ArrayList<Employee> findEmployee(double salary) {
		ArrayList<Employee> findList= new ArrayList<>();
		for(Employee e:list) {
			if(e.getSalary()==salary) {
				findList.add(e);
			}
		}
		return findList;
	}
	
	
	//�߰�
	public void getEmployee() {
		for(Employee e : list)
			System.out.println(e);
	}
}







