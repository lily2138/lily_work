package chatting.step1.client;
/*
 * Ű����� �Է¹��� ����Ÿ�� �о
 * ������ ����Ѵ�.
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
	BufferedReader br;
	PrintWriter pw;
	
	
	public void go() {
		try {
			s = new Socket("192.168.0.41",60000);
			System.out.println("Client Socket Credating..... ^^");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(),true); //true�� auto flush--->�̰� �����ָ� ���ڿ��̱� ������ �Ȱ���
			
			System.out.println("Client stream Creating......^^");
			
			String line = "";
			while((line=br.readLine())!=null) {
				pw.println(line);
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
