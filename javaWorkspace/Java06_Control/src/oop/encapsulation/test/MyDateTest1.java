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
import oop.encapsulation.MyDate;

public class MyDateTest1 {
	public static void main(String[] args) {
		
		MyDate md = new MyDate();
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		md.setMonth(sc.nextInt());
		System.out.println("��¥�� �Է��ϼ���");
		md.setDay(sc.nextInt());
		
		System.out.println(md.getMonth()+"��"+md.getDay()+"�� �Դϴ�");

		
	}

}
