package inheritance.service;

import inheritance.child.Engineer;
import inheritance.child.Manager;
import inheritance.child.Secretary;
import inheritance.parent.Employee;

//��ɸ��� ��Ƴ��� ���� Ŭ����...
public class PolymorphismService {
	
	/*	
	//1. step - ���� ����
    public void handleManager(Manager m) {}
	public void handleEngineer(Engineer eg) {}
	public void handleSecretary(Secretary se) {}
	*/
	
	
	/*
	//2. step - �����ε� - ��������� ������ ������ �Ȱ���
	public void handleEmployee(Manager m) {}
	public void handleEmployee(Engineer eg) {}
	public void handleEmployee(Secretary se) {}
	*/
	
	//3. step ���
	//���ڰ��� employee �迭�� �ִ´�(�θ� �ִ°���)
	public void handleEmployee(Employee[] earr) {
		//1.���࿡ earr�� ����ִ� ������ ��ȣ���̶��...�μ��� �ѹ��η� �ٲٰ�...�������
		for(Employee e : earr) {
			if(e instanceof Manager) {//e��� ��ü�� Manager���
				if(e.getName().equals("��ȣ��2")) {
					//e.changeDept("�ѹ���")�� casting �ϸ� �Ʒ��ڵ�ó�� ��.
					((Manager) e).ChangeDept("�ѹ���");
				}
			}
			if(e instanceof Engineer) {//e��� ��ü�� Engineer���

			}
			if(e instanceof Secretary) {//e��� ��ü�� Secretary���
				
			}
		}
		//2.
		
	}
	
	
}
