package io.object.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * ����ȭ �ڵ�...
 * Serialization :: Data Unpack
 * Person��ü�� Sink������ ������.
 * 1. ObjectOutputStream ����
 * 2. wrtieObject(object);
 */
public class PersonObjectOutputTest1 {

	public static void main(String[] args) throws Exception {
		//1. ��Ʈ������
		String fileName = "src\\person.obj";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
		
		//2. ��ü����
		Person p = new Person("�迬��",28,"kim99");
		
		//3. ������.
		oos.writeObject(p);
		
		//4. �ڿ��ݳ�..
		oos.close();
		System.out.println("person.obj���Ͽ� ������ ������ �����߽��ϴ�.");
		System.out.println("������ Ȯ���Ϸ��� ������ȭ�ؼ� Ȯ�ιٶ��ϴ�.");
	}

}
