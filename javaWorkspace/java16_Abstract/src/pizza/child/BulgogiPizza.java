package pizza.child;

import pizza.parent.Pizza;

public class BulgogiPizza extends Pizza {

	
	public BulgogiPizza(int price, String storeName) {
		//�θ��� �ʵ尡 proctected���� super�Ƚᵵ �ȴ�.
		this.price = price;
		this.storeName = storeName;
	}
	
	
	@Override
	public void topping() {
		System.out.println("Bulgogi Topping Pizza...");
		
	}
	
	

}
