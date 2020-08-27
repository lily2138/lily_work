package com.encore.service;

import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeService {
	Manager[] ms;
	int midx; //������� �迭�� ������ --->�ؿ� size�� ������ ������޴°�. 
	
	Engineer[] egs;
	int egidx; //������� �迭�� ������ 
	
	//������ �迭 ����
	public EmployeeService(int size) {
		ms = new Manager[size];
		egs = new Engineer[size];
	}
	
	//String name, String addr, ... 5�� ���� �ִ°� �ƴ�... ��ü�� �ִ°Ŵ�)
	public void addManager(Manager m) {		
		ms[midx++] = m;
	}
	
	public void addEngineer(Engineer eg) {
		egs[egidx++] = eg;
	}
	
	public void deleteManager(String name) {	//	
		for(int i=0; i<midx; i++) {
			if(ms[i].getName().equals(name)) { //������ �̸��� ������
				for(int j=i; j<midx; j++) {  //��ĭ�� ������ ������
					ms[j] = ms[j+1];
				}
				ms[midx] = null; //������ ĭ�� null�� �ٲ۴�.
				midx--; //������ �ϳ� �������鼭 ������ ���������, ������ĭ�� null�̹Ƿ� midx�� �����ϳ� �ش�.
			}
		}
	}
	
	public void deleteEngineer(String name) {	//
		for(int i=0; i<egidx; i++) {
			if(egs[i].getName().equals(name)) { 
				for(int j=i; j<egidx; j++) {  
					egs[j] = egs[j+1];
				}
				egs[egidx] = null; 
				egidx--; 
			}
		}
	}
	
	public void updateManager(double salary, String dept, int deptNo, String name) {
		for(Manager m :ms) {
			if(m==null)
				continue;
			if(m.getName().equals(name)) {
				m.setSalary(salary);
				m.setDept(dept);
				m.setDeptNo(deptNo);
			}
		}
	}
	
	public void updateEngineer(double salary, String tech, int bonus, String name) {
		for(Engineer eg :egs) {
			if(eg==null)
				continue;
			if(eg.getName().equals(name)) {
				eg.setSalary(salary);
				eg.setTech(tech);
				eg.setBonus(bonus);
			}
		}
	}
	
	//Method Overloading
	/*
	 * �ϴ� ���� �Ȱ�����...ó���ϴ� �����͸� �޸��� �� ���� ���
	 * �޼ҵ��� ���ϰ��� �����ϸ鼭�� ���� �ٸ� �����͸� ó���� �� �ְԲ� ���ش�.
	 * --->�޼ҵ� �̸��� �Ȱ����� �޴� ���ڰ��� �ٸ���.
	 */
	public Manager findManager(String name) {
		Manager manager = null;
		for(Manager m:ms) {
			if(m.getName().equals(name)) {
				manager = m;
			}
		}
		return manager;
	}
	
	public Manager[] findManager(int deptno) {
		//�迭�� ������� �����Ƿ� size�� �ƴ� ms.length�� �ִ´�
		Manager [] mans = new Manager[ms.length];
		int idx=0;
		for(Manager m:ms) {
			if(m.getDeptNo()==deptno) {
				mans[idx++] = m;
			}
		}
		return mans;
	}
	
	public Engineer findEngineer(String name) {
		Engineer engineer = null;
		for(Engineer e:egs) {
			if(e.getName().equals(name)) {
				engineer = e;
			}
		}
		return engineer;
	}
	
	/////////////////////////////////////////////////////
	//Ȯ�ο� �߰�
	public void printManagers() {
		for(Manager m :ms) {
			if(m!=null)
				System.out.println(m.getDetails());
		}
	}
	
	public void printEngineers() {
		for(Engineer e :egs) {
			if(e!=null)
				System.out.println(e.getDetails());
		}
	}

}
