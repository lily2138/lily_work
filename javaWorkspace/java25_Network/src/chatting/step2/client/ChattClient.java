package chatting.step2.client;
/*
 * Ű����� �Է¹��� ����Ÿ�� �о
 * ������ ������
 * ---------------------------------------------
 * �ٽ� ������ ���� �޼����� �޾Ƽ� 
 * Ŭ���̾�Ʈ �ڽ��� �ܼ�â�� ����Ѵ�.
 * ::
 * �Է� 2
 * ��� 2 ...socket
 * ::
 * Client�� ����
 * 1. ���ϻ���
 * 2. ��Ʈ��...
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChattClient {
	Socket s;
	BufferedReader br, br1; //�Էµΰ��ʿ��ϴ�. ������ �����͵� �޾ƾ��ϱ� ������
	PrintWriter pw;
	
	
	public void go() {
		try {
			s = new Socket("192.168.0.33",60000);
			System.out.println("Client Socket Credating..... ^^");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(),true); //true�� auto flush--->�̰� �����ָ� ���ڿ��̱� ������ �Ȱ���
			br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			System.out.println("Client stream Creating......^^");
			
			while(true) {
				String line = br.readLine(); //Ű����� �Է¹��� ������ �о...
				pw.println(line); //������ ����.
				
				///////////////////////////////////////////////////////////////
				String serverMsg = br1.readLine();
				System.out.println("������ ���� �޼���"+ serverMsg);
			}
			
		}catch(Exception e) {
			System.out.println("�������� ���ῡ�� �����߽��ϴ�....");
		}
	}	
	public static void main(String[] args) {
		ChattClient cc = new ChattClient();
		cc.go();

	}

}
