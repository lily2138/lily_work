package fly.test;

import fly.Flyer;
import fly.child.AirPlane;
import fly.child.Bird;
import fly.child.SuperMan;

public class FlyerTest {

	public static void main(String[] args) {
//		Flyer f1 = new Flyer();
//		Flyer�� ���� Ÿ���̴�. ��ü ������ �� ����
//		������
		//�߻�Ŭ������ ���� ��ü���� �Ұ��ϴ�. �������̽��� ��������. 
		//interface�� �Ϻ��� �̿ϼ��̰� abstract class�� �κ����� �̿ϼ��̴�.
		Flyer bird = new Bird();
		Flyer ap = new AirPlane();
		Flyer sp = new SuperMan();
		
		bird.fly(); //Virtual Method Invocation����... �������̵� �� �޼ҵ忡���� ��Ÿ����.
//		bird.layEggs(); ---> type�� Flyer�̹Ƿ� �̰� �ȵȴ�. flyer���� ���� ���� �޼ҵ尡 ���� �����̴�.
		String ret = ((Bird) bird).layEggs(); //--->�׷��� bird���� casting �ؾ��Ѵ�. 
		System.out.println(ret);
		
	}

}


