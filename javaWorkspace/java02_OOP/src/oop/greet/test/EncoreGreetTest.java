package oop.greet.test;

//ctrl+shift+O(������) --> import�� �͵� �� ����.
import java.util.Scanner;

import oop.greet.EncoreGreet;
//package�� inner ������ �ƴ�. �ٸ�����. �׷��� import �������.


//����Ŭ����, test class
public class EncoreGreetTest {

	public static void main(String[] args) {

		//��ü���� --> EncoreGreet ������Ҹ� �޸𸮿� �ø��� 
		EncoreGreet en = new EncoreGreet();
		
		//����ó�� �ҽ��ڵ忡 ���� ���� �ϵ��ڵ� ���� �ʰ� ����ÿ� Ű����� �Է¹��� ���� ó���ϵ��� Scanner ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String scName = sc.nextLine();
		en.name = scName;
		
		System.out.println("�޼����� �Է��ϼ���");
		String scMsg = sc.nextLine();
		en.message = scMsg;
		
		//�ʵ带 ���� ���� �Ҵ�, �޼ҵ带 ���� ���� ȣ��
//		en.name="Juliet";
//		en.message="Nice Day~~~!!!";
		en.sayHello();
		
	}

}
