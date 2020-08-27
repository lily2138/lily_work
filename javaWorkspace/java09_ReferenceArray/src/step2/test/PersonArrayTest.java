package step2.test;

import vo.Product;

public class PersonArrayTest {
	public static void main(String[] args) {
		//1.�迭�� ������ �ʱ�ȭ�� �ѹ���...
		Product[] pros = {
				new Product("HP", 120000, 2),
				new Product("SAMSUNG", 230000, 3),
				new Product("LG", 500000, 13)
		};
		
		//2.Product ��ǰ���� ����� ���...��ǰ��
		System.out.println("��ǰ����Ŀ������ ����մϴ�...");
		for(Product pro:pros) {
			System.out.print(pro.getMaker()+" "+"\n");
		}
		
		//3. ��ǰ�� �߿��� ���ݴ밡 20������ ȣ���ϴ� ��ǰ�� ����Ŀ�� ������ ���
		System.out.println("20�����̻� ��ǰ�Դϴ�.");
		for(Product pro:pros) {
			if(pro.getPrice()>=200000) {
				System.out.println(pro.getMaker()+pro.getPrice());
			}
		}
		
		//4. ��ü��ǰ�� �Ѱ����� ���� ���
		int total = 0;
		for(Product pro:pros) {
			total+=pro.getPrice();
		}
		System.out.println("�Ѱ�����"+total+"�Դϴ�");
	}
}
