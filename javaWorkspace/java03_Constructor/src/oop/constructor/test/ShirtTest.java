package oop.constructor.test;
/*
 * ShirtTest
 * ������ ���δٸ� ���� ��ü�� 3�� �������.
 * �׷��� ���δٸ� �ּҰ��� ��Ÿ������....
 * ��ü�� �����ɶ� ������ �ȿ� ���ڰ��� �־����� �ʾұ� ������
 * ������� ���� ������ �ʴ� ����Ʈ ��ü�� �����Ǿ���.
 * ::
 * �����ڸ� ���ؼ� ���� �Է� +
 * ��ü�� �����ʰ� ���ÿ� ���� �������� ������ ����...
 */

import oop.constructor.Shirt;

public class ShirtTest {
	public static void main(String[] args) {
		/*Shirt roundT = new Shirt();
		Shirt jumpa = new Shirt();
		Shirt banpalT = new Shirt();*/
		
		//�޸𸮿� �ö󰡼� �츮�� ����Ҽ� �ִ� ��ü...Instance...����������� �Ҵ�
		Shirt roundT = new Shirt("����Ŭ��", true, 'B');
		Shirt jumpa = new Shirt("������", true, 'B');
		Shirt banpalT = new Shirt("aaa", false, 'w');
		
		//���� �ٸ� ���� ��ü�� ��������ٸ� Heap ������ ��ü 3���� �ε�Ǿ����� ���̰�
		//������ ��ġ�� ���� �ٸ��� ������ ���������� �ּҰ����� ���� �ٸ��� ���;��Ѵ�.
		System.out.println(roundT);
		System.out.println(jumpa);
		System.out.println(banpalT);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(roundT.getDetails());
		System.out.println(jumpa.getDetails());
		System.out.println(banpalT.getDetails());
	}

}
