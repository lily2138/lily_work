package fly.child;

import fly.Flyer;

public class AirPlane implements Flyer{

	@Override
	public void fly() {
		System.out.println("����Ⱑ ����");
		
	}

	@Override
	public void land() {
		System.out.println("����Ⱑ �����Ѵ�");
		
	}

	@Override
	public void take_off() {
		System.out.println("����Ⱑ �̷��Ѵ�");
		
	}
	
}
