package oop.self.test;

import oop.self.Programmer;

public class ProgrammerTest {

	public static void main(String[] args) {
		Programmer pro = new Programmer();
		
		pro.setProgrammer("Lily", 24, 400.0f, 600);
		
		System.out.println("������ ����մϴ�");
		System.out.println(pro.getProgrammer());
		System.out.println("����� ������");
		System.out.println(pro.getAnnualSalary()+" ����");
		
	}

}
