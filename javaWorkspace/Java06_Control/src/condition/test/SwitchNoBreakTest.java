package condition.test;
/*
 * Math.random()�� �Բ�
 * switch�������� breakŰ���忡 ���ؼ� ���캸��
 */

public class SwitchNoBreakTest {
	public static void main(String[] args) {
//		double d = Math.random();
//		int d = (int)(Math.random()*4)+1;
		int time = (int)(Math.random()*4)+8;
		System.out.println("[����ð� : " + time + " ��]");

		switch(time) {
		case 8:
			System.out.println("����մϴ�.");
		case 9:
			System.out.println("����ȸ���մϴ�.");
		case 10:
			System.out.println("�����������ϴ�.");
		case 11:
			System.out.println("�ܱٳ����ϴ�.");
		}
				
	}

}
