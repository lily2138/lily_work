package oop.greet.test;
/*
 * EncoreGreetTest1������ �ʵ忡 ���� ���������� �Է��ߴ�.
 * �׷��� �ʵ��� ������ �þ�ٸ�?
 * �ʵ尡 20���� �ʰ��Ѵٸ�?
 * �̷���� ������ �ʵ忡 ���� �Է��ϴ� ����� �ʹ� ��ȿ�����̴�.
 * 
 * �ذ�å
 * :
 * ��� �ʵ��� ���� �ѹ��� �޾Ƽ� �Ҵ����ִ� ����� ���� �Լ��� ���Ӱ� ����
 * Test2������ �� �Լ��� ȣ���ϴ� ����� �������
 */

//ctrl+shift+O(������) --> import�� �͵� �� ����.
import java.util.Scanner;

import oop.greet.EncoreGreet;
//package�� inner ������ �ƴ�. �ٸ�����. �׷��� import �������.


//����Ŭ����, test class
public class EncoreGreetTest2 {

	public static void main(String[] args) {
		//��ü���� --> EncoreGreet ������Ҹ� �޸𸮿� �ø��� 
		EncoreGreet en = new EncoreGreet();
		//field�� �� �Ҵ�...
		en.setEncore("James", "Hello~~~", 4, "Java");  //Method Calling
		
		System.out.println(en.getEncore()); //Method Calling
		
		en.sayHello();
		
	}

}
