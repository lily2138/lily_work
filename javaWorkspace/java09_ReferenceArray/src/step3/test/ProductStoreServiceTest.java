package step3.test;

import service.ProductStoreService;
import vo.Product;

public class ProductStoreServiceTest {
	public static void main(String[] args) {
		ProductStoreService service = new ProductStoreService();
		
		Product[] pros = {
				new Product("HP", 120000, 2),
				new Product("SAMSUNG", 230000, 3),
				new Product("LG", 500000, 13),
				new Product("LG", 490000, 16)
		};
		
		System.out.println("1.��� ��ǰ�� maker�� ����մϴ�");
		service.printProductMakers(pros);
		
		System.out.println("2.��� ��ǰ�� �Ѱ����� ����մϴ�");
		System.out.println(service.getTotalPrice(pros));
		
		System.out.println("3.��ǰ���� ��հ��� ����մϴ�");
		System.out.println(service.getAvgPrice(pros));
		
		System.out.println("4.Ư���ݾ� �̻�Ǵ� ��ǰ�� ������ ����մϴ�");
		service.printOverPrice(pros,160000);
		
		System.out.println("5.Ư��ȸ�� ��ǰ���� ������ ����մϴ�");
		Product[] products=service.getCertainMaker(pros, "LG");
		for(Product p:products) {
			if(p==null)
				continue;
			System.out.println(p.getMaker()+" "+p.getPrice());
		}
			
		
	}

}
