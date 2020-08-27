package service;

import vo.Product;

/*
 * ProductStore�� �ִ� �پ��� ��ǰ���� �ٷ�� ����� ��Ƴ��� ���� Ŭ����...
 * �� Ŭ�������� �ٷ�� ��ɵ�...
 * 1)�پ��� ��ǰ���� maker�� ���
 * 2)��ǰ���� �� �ݾ��� ����
 * 3)��ǰ���� ��հ��� ����
 * 4)Ư���ݾ� �̻�Ǵ� ��ǰ�� ������ ���
 * 5)Ư��ȸ�� ��ǰ���� ����
 */
public class ProductStoreService {
	
	public void printProductMakers(Product[] pros) {
		for(Product pro : pros) {
			System.out.println(pro.getMaker());
		}
	}
	
	public int getTotalPrice(Product[] pros) {
		int total = 0;
		for(Product pro : pros) {
			total += pro.getPrice();
		}
		return total;
	}
	
	public double getAvgPrice(Product[] pros) {
/*		int total = 0;
		for(Product pro:pros) {
			total += pro.getPrice();
		}
		return total/pros.length;*/
		//���� ����� �����Ƿ� �װ� ȣ���ؼ� �����ش�.
		return getTotalPrice(pros)/pros.length;
	}
	
	public void printOverPrice(Product[] pros, int price) {
		for(Product pro:pros) {
			if(pro.getPrice()>=price) {
				System.out.println(pro.getMaker()+" "+pro.getPrice());
			}
		}
	}
	
	public Product[] getCertainMaker(Product[] pros, String maker) {
		//���ο� �迭�� ���� Ư��ȸ���� ��ǰ���� �ִ´�.
		Product[] products = new Product[pros.length];
		int idx = 0;
		for(Product pro:pros) {
			if(pro.getMaker().equals(maker)) {
				/*products[idx]=pro;
				idx++;*/
				products[idx++]=pro;
			}
		}
		return products;
	}
	
	
	
}
