 package service;

import vo.Customer;
import vo.Product;

/*
 * ��ǰ�� �����ϴ� ��, ������ ������ ��ǰ�� ���� ��ɵ��� �ٷ�� ���� Ŭ����...
 */
public class OutletStoreService {
/*
 * getAllProductMaker()---> Ư���� ����� ����ǰ�� ��������� ����
 * getAllCustomer()--->��� ���� ��������� ����
 * getACustomer() --->Ư���� ���� ��������� ����
 * maxPriceProduct() --->�ְ� ��ǰ�� ������ �޾ƿ���
 * moreAvgProduct() --->��հ� �̻��� ��ǰ�� ��� (Ư���� ���� ������ ��ǰ�� �߿��� ��հ� �̻�Ǵ� ��ǰ)
 */
	
	int prosize = 4;
	int custsize = 3;
	
	public String[] getAllProductMaker(Customer vo) {
		String[] temp = new String[prosize];
		Product[] pros = vo.getProducts();
		int idx = 0;
		for(Product pro:pros) {
			temp[idx++]=pro.getMaker();
		}
		return temp;
	}
	
	public Customer[] getAllCustomer(Customer[] custs) {
		Customer[] customers = new Customer[custsize];
		int idx = 0;
		for(Customer cus:custs) {
			customers[idx++]=cus;
		}
		return customers;
	}
	
	public Customer getACustomer(Customer[] custs, int ssn) {
		Customer customer = null;
		for(Customer cust:custs) {
			if(cust.getSsn()==ssn) {
				customer = cust;
			}
		}
		return customer;
	}
	
	public int maxPriceProduct(Customer c) {
		int max = 0;
		System.out.println(c.getName()+"���� �����Ͻ� �ְ� ��ǰ��....");
		Product[ ] pros = c.getProducts();
		for(Product p : pros) {
			if(p.getPrice()>max) max = p.getPrice();
		}
		return max;
		
	}

	//�߰�
		public int avgPrice(Customer c) {
			int total = 0;		
			Product[ ] pros = c.getProducts();
			for(Product p : pros) {
				total += p.getPrice();
			}
			return total/pros.length;
		}
		public Product[ ] getMoreAvgProduct(Customer c) {
			Product[ ] temp = new Product[prosize];
			Product[ ] pros=c.getProducts();
			int cnt = 0;
			for(Product p : pros) {
				if(p.getPrice()>=avgPrice(c)) 
					temp[cnt++] = p;			
			}
			return temp;
		}
	
	
	
}
