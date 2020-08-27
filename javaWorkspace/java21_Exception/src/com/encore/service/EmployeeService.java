package com.encore.service;
import java.util.ArrayList;

import com.encore.exception.DuplicateNameException;
import com.encore.exception.RecordNotFoundException;
import com.encore.vo.Employee;
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
	public void addEmployee(Employee e) throws DuplicateNameException { //DuplicateNameException �߻�
		boolean find = false;
		for(Employee emp:list) {
			if(e.getName().equals(emp.getName())) { //�̹� �׷������ �ִٸ�.
				find = true;
				throw new DuplicateNameException(emp.getName()+"���� �̹� ȸ���̽ʴϴ�.");
			}
		}
		if(find==false) {	//�߰��ϰ��� �ϴ� ������� ������ ����Ʈ���� ����
			list.add(e);
			System.out.println(e.getName()+"���� ȸ������ ��ϵǼ̽��ϴ�.");

		}
	}

	public void deleteEmployee(String name) throws RecordNotFoundException { //RecordNotFoundException �߻�
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
			throw new RecordNotFoundException("�����Ҵ���� �����ϴ�");
		
		
	}
	
	public void updateEmployee(Employee e) throws RecordNotFoundException { //RecordNotFoundException �߻�

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
			throw new RecordNotFoundException("�����Ҵ���� �����ϴ�");
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







