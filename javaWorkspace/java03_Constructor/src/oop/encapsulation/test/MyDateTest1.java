package oop.encapsulation.test;
/*
 * Encapsulation �ۼ�����
 * 1. �ʵ��--->private
 * 2. setter()/getter() ---> public
 * 3. setter(){
 * 		ù���ο���(�ʵ��ʱ�ȭ �ϱ� ������) ���� Ÿ�缺�� �˻��ϴ� ����� ���ؼ� valid�� ���� �ʵ忡 �Ҵ�ǵ��� �Ѵ�. 
 *
 */

import oop.encapsulation.MyDate;

public class MyDateTest1 {
	
	public static void main(String[] args) {
		MyDate md = new MyDate();
		//�ʵ忡 ���������� ���� �Ҵ�-->�ʵ� ���� private �̾ �Ҵ� ����.
		/*md.month = 13;
		md.day = 33;*/
		
		//set �Լ��� ���� �Ҵ�
		md.setMonth(13);
		System.out.println(md.getMonth());

		
	}

}
