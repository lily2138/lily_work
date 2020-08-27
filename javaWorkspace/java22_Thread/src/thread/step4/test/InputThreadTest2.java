package thread.step4.test;

import javax.swing.JOptionPane;
/*
 * step2
 * ::
 * ī���� �۾��� ī���� �۾����
 * �˾�â �Է��� �˾�â �Է´��
 * ���������� �۾��� ����
 * ::
 * ���ξ�����
 * �۾������� -- ī���� ó�� -- CountingThread(implements Runnable)
 */

class CountingThread implements Runnable{

	@Override
	public void run() {
		//2. ������ ī���� �۾�....
		for(int i=10; i>0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			System.out.println(i);
		}	
	}
}

public class InputThreadTest2 {
	public static void main(String[] args) { 
		CountingThread countT = new CountingThread();
		Thread t = new Thread(countT); //runnable implements �Ҷ��� ���۾� �Ѵ�
		
		t. start(); //���⼭ �����۾�����
		
		//1. ����Ÿ �Է��۾�....
		String input = JOptionPane.showInputDialog("�����ζ� ��ȣ�� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ���ڴ� "+ input + " �Դϴ�.");
		
		
	}

}
