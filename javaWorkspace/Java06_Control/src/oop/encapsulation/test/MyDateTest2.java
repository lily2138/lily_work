package oop.encapsulation.test;
import java.util.Scanner;

/*
 * Scanner ��ü�� ���ؼ� ���� ��¥�� �Է¹޵���
 * �������� ������ 4�� 22���Դϴ�.
 * �̷������� ���
 * 
 * ���࿡ �߸��� ���̳� ��¥�� �Էµ� ��쿡��
 * �߸��� ��¥�Դϴ�.
 */

import oop.encapsulation.MyDate2;

public class MyDateTest2 {
	public static void main(String[] args) {
		
		MyDate2 md = new MyDate2();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		int month = sc.nextInt();;
		System.out.println("��¥�� �Է��ϼ���");
		int day = sc.nextInt();
		
		md.setMonth(month);
		md.setDay(day);
		
		if(md.getMonth()==0 || md.getDay()==0)
			System.out.println("�߸��ԷµǾ����ϴ�.");
		else
			System.out.println(md.getMonth()+"��"+md.getDay()+"�� �Դϴ�");

		
	}

}
