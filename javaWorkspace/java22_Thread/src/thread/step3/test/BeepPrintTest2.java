package thread.step3.test;

import java.awt.Toolkit;
/*
 * BeepPrintTest1 ����Ŭ����....�ϳ��� ���μ���
 * �� �ȿ��� ���ξ����� �ϳ��ۿ� ������.
 * �����۾��� �Ұ����ߴ�.
 * --------------------------------------------------------
 * BeepPrintTest2 ����Ŭ����....�ϳ��� ���μ���
 * �̾ȿ� ���ξ����� + �۾������带 �ϳ� �� �߰�
 * 1)���ξ����� : beep()�� 5�� ---- ������� 5�� �߻�
 * 2)�۾������� : BeepPrintThread ---- ���� 5�� ���
 */

class BeepPrintThread extends Thread{
	public void run() {
		//5�� ����ϴ� ����....
		//�������� 5�� ����ϴ� �۾�
		for(int i=0; i<5; i++) {
			System.out.println("��~~~~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}//run
}//class

public class BeepPrintTest2 {
	public static void main(String[] args) {
		
		BeepPrintThread beepT = new BeepPrintThread();
		beepT.start(); //�����۾�(�����۾�)�� ����Ǵ� ����.
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		//����� 5�� �︮�� �۾�....
		for(int i=0; i<5; i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
		
		
	}

}
