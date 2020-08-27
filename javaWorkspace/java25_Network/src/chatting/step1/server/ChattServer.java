package chatting.step1.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Ŭ���̾�Ʈ�� ���� �޼����� �޾Ƽ�
 * �ڽ��� �ܼ�â�� ���� �޼����� ���
 * ::
 * ������ ����
 * 1. ServerSocket ����(port 6000)
 * 2. Ŭ���̾�Ʈ�� ������ �����ϸ� accept�� �޾Ƽ�
 * 	  Socket�� �ϳ� ����.
 * 3. �������κ��� ��Ʈ�� ����
 * 
 */
public class ChattServer {
	ServerSocket server;
	Socket s;
	BufferedReader br;
	
	public void go() {
		try {
			server = new ServerSocket(60000);
			System.out.println("Server Ready......");
			
			s=server.accept();
			System.out.println("Client Socket...Returning...");
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			//getInputStream()�� system.in�� �ٸ���
			//System.in�� Ű���� �ȿ� �ִ°��� �о���̴� ���̴�
			//getInputStream()�� �ܺε����ͷ� �޾Ƶ鿩�� �д°��̴�.
			
			
			String line = null;
			while((line = br.readLine())!=null) {
				System.out.println("Client�� ���� �޼���"+line);
			}
			br.close();
		}catch(Exception e) {
			System.out.println("Client���� ������ ���������ϴ�...");
		}
	}
	
	public static void main(String[] args) {
		ChattServer cs = new ChattServer();
		cs.go();

	}

}








