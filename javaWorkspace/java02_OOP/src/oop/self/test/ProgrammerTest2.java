package oop.self.test;

import java.util.Scanner;

import oop.self.Programmer;

public class ProgrammerTest2 {

	public static void main(String[] args) {
		Programmer pro = new Programmer();
		

		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("�̸��� �Է��ϼ���");
			String name = sc.nextLine();
			System.out.println("���̸� �Է��ϼ���");
			int age = sc.nextInt();
			
			pro.setProgrammer(name, age, 400.0f, 600);
			
			System.out.println("������ ����մϴ�");
			System.out.println(pro.getProgrammer());
			System.out.println("����� ������");
			System.out.println(pro.getAnnualSalary()+" ����");
			
			
		}
		
	}

}
