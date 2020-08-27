package thread.step5;
/*
 * MegaBoxUser�� MegaBox���� �¼��� �����ϴ� ���� �����ϴ� �������� ����...
 * reserve() ��� ����� �ϳ� �ۼ�... ���ŷ����� �ۼ�...
 */
public class MegaBoxUser implements Runnable {
	private boolean seat = false; //�¼����Ű� ������ true�Ҵ�
	
	@Override
	public void run() {
		//�����ϴ� ���...
		try {
			reserve();
		} catch (InterruptedException e) {
			
		}
		
	}

	public synchronized void reserve() throws InterruptedException {
		String tName = Thread.currentThread().getName();
		System.out.println(tName+"��, �����Ϸ� ���̽��ϴ�...!");
		
		if(seat==false) { //�¼��� ����ٸ�...
			Thread.sleep(2000);
			System.out.println(tName+"��, �¼����ż���");
			seat = true;
		}else { //���Ű� �̹� �Ϸ� �Ǿ��ٸ�,
			System.out.println(tName + "��, �ش��¼��� �̹� ���� �Ϸ� �� �¼��Դϴ�.");
			
		}
	}
}
