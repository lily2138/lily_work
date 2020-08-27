package com.encore.service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.encore.vo.Employee;
// Manager[ ]�� ArrayList<Employee> ���
public class EmployeeService {
	
	//�߰�...
	private Map<Integer, Employee> map;
	
	//�̱���
	private static EmployeeService service = new EmployeeService();	
	private EmployeeService(){
		map = new HashMap<Integer, Employee>();
	}
	public static EmployeeService getInstance() {
		return service;
	}
	
	
	//�߰�
	public void getEmployee() {
		Set<Integer> set = map.keySet(); //key�� �ҷ��ͼ� set�� ����
		/*Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key+"Employee infp::"+map.get(key));
			
		}*/
		for(Integer e : set)
			System.out.println(e+"==="+map.get(e));
		
	}	
	
	
	public void addEmployee(Employee e) {
		if(map.containsKey(e.getSsn())) {
			System.out.println(e.getName()+"���� �̹� ȸ���̽ʴϴ�.");
			return;
		}else {
			map.put(e.getSsn(),e);
			System.out.println(e.getName()+"���� ȸ������ ��ϵǼ̽��ϴ�.");
		}
		
		
	}	
	public void deleteEmployee(int ssn) {	
		Object emp = map.remove(ssn);
		if(emp==null) {//������ ����� �������� �ʴ´�.
			System.out.println("������ ����� �������� �ʽ��ϴ�.");
			return;
		}else {
			System.out.println("�����Ǿ����ϴ�");
		}
		
		//�����޼ҵ�� ���� for���� �����ʿ䰡 ����
		
/*		boolean find = false;
		Set<Integer> set = map.keySet();
		for(Integer key : set) {
			if(key==ssn) {
				find = true;
				map.remove(ssn);
				return;
			}
		}
		if(find==false) {	
			System.out.println("������ ����� �����ϴ�");
		}*/
		
	}	
	public void updateEmployee(Employee e, int ssn) {
		if(map.containsKey(ssn)) {
			map.put(ssn, e); //key�� �̹� �����Ƿ� ������ �ȴ�.
			System.out.println(e.getName()+"���� ������ �����Ǿ����ϴ�");
		}else {
			System.out.println("������ ����� �������� �ʽ��ϴ�.");
			return;
		}
		
		
		
/*		map.get(ssn).setBirthDate(e.getBirthDate());
		map.get(ssn).setName(e.getName());
		map.get(ssn).setSalary(e.getSalary());
		map.get(ssn).setSsn(ssn);*/
		
	}	
	
	
	public Employee findEmployee(int ssn) {
		return map.get(ssn);
	}	
	
	public ArrayList<Employee> findEmployee(double sal) {

		ArrayList<Employee> temp = new ArrayList<Employee>();
		
		Collection<Employee> col = map.values();	
		
		for(Employee e : col) {
			if(e.getSalary()==sal) {
				temp.add(e);
			}
		}
		
		//�ι�° �ڵ�
/*		ArrayList<Employee> temp = new ArrayList<>();
		Set<Integer> set=map.keySet();
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			int key = it.next();
			Employee e = map.get(key);
			if(e.getSalary()==sal) temp.add(e);
		}*/
		
		return temp;
	}	
	
}







