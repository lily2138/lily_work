package step4.test;

import service.OutletStoreService;
import vo.Customer;
import vo.Product;

public class OutletStoreServiceTest {
	public static void main(String[] args) {
		//1. ���� ���� ����....2������
		Customer[] customers = new Customer[3];
		customers[0] = new Customer(123,"�̳���","��赿");
		customers[1] = new Customer(321,"������","���ʵ�");
		customers[2] = new Customer(456,"����","��赿");
		
		
		Product[] pros1 = {
				new Product("�����", 8000, 2),
				new Product("����ƾ��ǻ", 18000, 1),
				new Product("�ް�", 5000, 1),
		};
		

		Product[] pros2 = {
				new Product("�ƽ�Ŀ��", 36000, 4),
				new Product("���İ�Ƽ�ҽ�", 66000, 1),
				new Product("�ް�", 6000, 2),
				new Product("����û����",46000,1)
		};
		
		//�̳����� Ŀ��,���İ�Ƽ,�ް�,����û���⸦ ���� | ������ �����,����ƾ��Ǫ,�ް��� �����ϵ��� ����
		//�̺κп��� Customer�� Product���� Hasing�� �Ͼ��.Has a Relation
		customers[0].buyProducts(pros2);
		customers[1].buyProducts(pros1);
		
		//4. Service ��ü�� ����.... �޼ҵ带 ȣ��
		OutletStoreService service = new OutletStoreService();
		
		String[ ] str=service.getAllProductMaker(customers[0]);
		System.out.println(customers[0].getName()+" ���� �����Ͻ� ��ǰ�� �Դϴ�.");
		for(String s : str) {
			if(s==null) continue;
			System.out.print(s+" ");
		}
		
		System.out.println("\n========= 2. ������ ��� ==============");
		Customer[ ] retCust=service.getAllCustomer(customers);		
		for(Customer c : retCust) {
			System.out.println(c.getCustomer());
			if(c.getProducts()!=null) {
				System.out.println("������ �����Ͻ� ��ǰ�����Դϴ�.");
				for(Product p : c.getProducts()) 
					System.out.println(p.getProduct());					
			}	
			System.out.println("-----------------------------------");
		}
		
		System.out.println("\n======  3. Ư�� �� �˻� =============");
		Customer aCust=service.getACustomer(customers, 123);
		System.out.println(aCust.getCustomer());
		
		System.out.println("\n======  4. Ư�� ���� �ְ� ��ǰ �˻� =============");
		int retMax=service.maxPriceProduct(customers[0]);
		System.out.println(retMax+" ���Դϴ�.");
		
		System.out.println("\n======  5. ��հ� �̻�Ǵ� ��ǰ �˻� =============");
		Product[ ] avgPro=service.getMoreAvgProduct(customers[0]);
		System.out.println("�ش� ��ǰ�� ��հ��� "+service.avgPrice(customers[0])+"�� �Դϴ�");
		System.out.println(customers[0].getName()+" ���� ��ǰ�߿� ��հ� �̻�Ǵ� ��ǰ�Դϴ�.");
		for(Product p : avgPro) {
			if(p==null)continue;
			System.out.println(p.getProduct());
		}
		
		
	}

}
