package pizza.parent;
/*
 * �߻�Ŭ���� �뵵
 * ::
 * 1. ���������� ���ڵ��� ���� ��,
 * 	  ���ڷμ��� �������� �κ�(�ʵ�,�޼ҵ�)�� �θ� ���� ������ �ڽĿ��� �״�� �����ְ�
 * 2. �ݸ鿡 ���� �ٸ� ���ڰ� ��������� �������� �κ��� �߻�޼ҵ�� �ڽĿ��� �����־
 *   �ڽ��� ���ο� �µ��� ���������ϵ��� �Ѵ�.
 */
public abstract class Pizza {
	protected int price;
	protected String storeName;
	
	
	public Pizza(int price, String storeName) {
		super();
		this.price = price;
		this.storeName = storeName;
	}
	
	public Pizza() {}
	
	public void makePizza() {
		dough();
		topping();
		bake();
		cut();
		box();
	}
	
	public void dough() {
		System.out.println("���� ���װ� �Բ� ���츦 ����");
	}
	public void box() {
		System.out.println("���� boxing");
	}
	public void bake() {
		System.out.println("���ڸ� 180������ 10�а� �������ϴ�");
	}
	public void cut() {
		System.out.println("���ڸ� 8������� �ڸ��ϴ�");
	}
	
	public abstract void topping();

	@Override
	public String toString() {
		return storeName+" "+price+"��";
	}
	
	
	
	
	
}
