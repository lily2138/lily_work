package exam.test;
/*
 * 
 * final Ű���� + static Ű����
 * final :: ���� �������̾� ~~~ 
 * final + ���� : ���� ������ ������ ~~~ ---> ����� �ǹ� static final int COUNTER =1;
 * final + Ŭ���� : ���� ������ Ŭ������ ~~~ ---> ��ӱ���
 * final + �޼ҵ� : ���� ������ �޼ҵ��~~~ ---> �������̵� ����
 */

class A{
	public final static int BASE_SALARY = 300;
	public final String test() {
		return "Overriding ����";
	}
}

final class B{ //��ӱ���
	
}

//class B�� final�̱� ������ ��Ӹ���.
/*class C extends B{
	
}
*/

class D extends A{
/*	public final String test() {
		return "Overriding ����";
	}*/
}


public class StaticExamTest4 {
	
	public static void main(String[] args) {
		
		
	}


}
