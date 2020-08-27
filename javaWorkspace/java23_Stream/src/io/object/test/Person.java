package io.object.test;

import java.io.Serializable;
/*
 * ����ȭ
 * ObjectOutPutStream....Sink������ ��ü�� ���󰣴�.
 * ��Ȯ�� ǥ���ϸ� ��ü�� �ʵ尪�� ����ȭ�Ǿ����� ��ü��Ʈ���� ����ϴ� ��.
 * 
 * �̷��� Person�� ��ü��Ʈ���� ����ȭ�� ����ҷ���.....
 * �ݵ��
 */
public class Person implements Serializable{
	private String name;
	private int age;
	private String password;
	
	public Person(String name, int age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", password=" + password + "]";
	}
	
	
	
}
