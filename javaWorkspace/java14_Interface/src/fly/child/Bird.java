package fly.child;

import fly.Flyer;

/*
 * Flyer(�������̽�)�� ��ӹ��� �ڽ� Ŭ����...
 * �������̽��� �θ�� �� �ڽ��� (Bird) �ݵ�� �θ� ���� ��� �߻�޼ҵ带 �� �����ؾ߸� �Ѵ�.
 */
//Ŭ������ �߻��� 1�� ������Ѵ�. Ŭ������ �޼ҵ�θ� �����Ҽ��ִ�. 
public /*abstract*/ class Bird implements Flyer{
	/*public void fly() {};
	public void land(); //������ �տ� public abstract�� �����ȴ�.
	public void take_off();*/

	@Override
	public void fly() {
		System.out.println("���� ����");
		
	}

	@Override
	public void land() {
		System.out.println("���� �����Ѵ�");
		
	}

	@Override
	public void take_off() {
		System.out.println("���� �̷��Ѵ�");
		
	}

	public String layEggs() {
		return "���� ���";
	}
	
}
