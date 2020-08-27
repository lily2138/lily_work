package exception.user.test;

import java.util.Scanner;

class UnderAgeException extends Exception{
	UnderAgeException(){
		this("This is UnderAgeException...");
	}
	UnderAgeException(String message){
		super(message);
		
	}
}


class AdultMovie{
	public void entrance(int age) throws UnderAgeException{
	/*
	 * �Էµ� ���̰� 19�� �̸��̸� ���ο�ȭ �����Ұ���Ű��
	 * 19�̻��̸� ������ ����ϵ��� ������ �����մϴ�...
	 * �̶�
	 * ����� ���� ���� Ŭ����...UnderAgeExcetion���� �մϴ�.	
	 */
		if(age<19) {
			throw new UnderAgeException("19�� �̸��� ������ �Ұ����մϴ�!!!");
		}else {
			System.out.println("������ ����մϴ�");
		}
	
	}
}

public class UserExceptionTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���̸� �Է�>>>");
		int age = sc.nextInt();
		
		
		AdultMovie am = new AdultMovie();
		System.out.println("���ο�ȭ�� ���忩�θ� �Ǵ��մϴ�");
		
		try {
			am.entrance(age);
		} catch (UnderAgeException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
