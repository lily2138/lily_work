package thread.step3.test;

import java.awt.Toolkit;

/*
 * �ش��ڵ忡���� ������ �����带 �ۼ����� �ʰ� ����....
 * ������� �߻���Ű�� / ���ÿ� ������� �ַܼ� �������ϴ� �۾�
 * �ΰ��� ���� main �Ʒ����� ó���ϵ��� �Ұ��̴�.
 */
public class BeepPrintTest1 {

	public static void main(String[] args) {
		Toolkit tool = Toolkit.getDefaultToolkit();
		//����� 5�� �︮�� �۾�....
		for(int i=0; i<5; i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
		//�������� 5�� ����ϴ� �۾�
		for(int i=0; i<5; i++) {
			System.out.println("��~~~~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
	}

}
