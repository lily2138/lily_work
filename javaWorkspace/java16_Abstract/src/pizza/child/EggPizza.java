package pizza.child;

import pizza.parent.Pizza;

public class EggPizza extends Pizza {

	
	public EggPizza(int price, String storeName) {
		//�θ��� �ʵ尡 proctected���� super�Ƚᵵ �ȴ�.
		this.price = price;
		this.storeName = storeName;
	}
	
	
	@Override
	public void topping() {
		System.out.println("Egg Topping Pizza...");
		
	}
	
	

}
