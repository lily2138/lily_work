package thread.step4.test;

import javax.swing.JOptionPane;
/*
 * ���ξ����常 �����Ǵ� ����....
 * �����۾��� �ȵȴ�.
 * �ζ� ��ȣ�� �Է¹ٵ� �۾���
 * ī���� �۾��� ���������� ����Ǿ���Ѵ�.
 * -----------------------------------
 * 10�ʾȿ� �������� �ζ� ��ȣ�� �ԷµǾ����� �Ѵ�.
 */
public class InputThreadTest1 {
	public static void main(String[] args) {
		//1. ����Ÿ �Է��۾�....
		String input = JOptionPane.showInputDialog("�����ζ� ��ȣ�� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ���ڴ� "+ input + " �Դϴ�.");
		
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
