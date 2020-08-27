package oop.javadoc.test;
/*
 * main() ������ ������ �ϴ� ����Ŭ����
 * ����....
 * JavaComment ��ü�� ���� == �޸𸮿� �ø���. ==�ı�(Member-Field,Method)�� �޸𸮿� �ö󰣴�
 * 												JVM > Heap
 * ��ü ������ ���?		����� ��ü�� ��ġ���� ���... 1004
 */

import oop.javadoc.JavaComment;  

public class JavaCommentTest {

	public static void main(String[] args) {

		JavaComment jc = new JavaComment(); //1004
		//jc�� ��������... reference Variable
		System.out.println(jc);
		
		//jc��� �̸��� ��ü�� ������ ����? --> ������, ����ҷ���
		//�ʵ��� --> ���Ҵ�
		//�޼ҵ� ��� --> ȣ��(ȣ���ؾ������� ����� �����Ѵ�)
		
		jc.name = "Lily"; //���Ҵ�
		System.out.println(jc.scoreSum(100, 100)); //METHOD Calling
	}

}
