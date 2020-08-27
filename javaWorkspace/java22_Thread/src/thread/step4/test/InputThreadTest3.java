package thread.step4.test;
/*
 * ī���� �۾� - CountThread
 * �����Է��۾�  - InputThread
 * ::
 * �� �����尣�� Communication �� ���μ����� �ڿ����� �ؾ��Ѵ�.
 * 
 */
import javax.swing.JOptionPane;

class CountThread extends Thread{
	private InputThreadTest3 process;
	
	public CountThread(InputThreadTest3 process) {
		this.process = process;
	}
	
	public void run() {
		//2. ������ ī���� �۾�....
		for(int i=10; i>0; i--) {
			if(process.inputCheck) break;
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}//for
		
		if(!process.inputCheck) {
			System.out.println("10�� ����Ǿ����ϴ�... ���Է� �ð��ʰ�!!");
			System.exit(0);
		}
	}
}

class InputThread extends Thread{
	private InputThreadTest3 process;
	
	public InputThread(InputThreadTest3 process) {
		this.process = process;
	}


	public void run() {
		//1. ����Ÿ �Է��۾�....
		String input = JOptionPane.showInputDialog("�����ζ� ��ȣ�� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ���ڴ� "+ input + " �Դϴ�.");
		
		process.inputCheck = true;
	}
	
}

//process....
public class InputThreadTest3 {
	boolean inputCheck = false;

	public static void main(String[] args) {
		InputThreadTest3 process = new InputThreadTest3();
		
		CountThread countT = new CountThread(process);
		InputThread inputT = new InputThread(process);
		
		countT.start(); //���⼭ �����۾�����
		inputT.start();
	}

}
