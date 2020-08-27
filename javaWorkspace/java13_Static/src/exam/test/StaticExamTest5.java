package exam.test;
/*
 * Singletone Pattern
 * ::
 * Ŭ�����κ��� ���� �� �Ѱ��� �ν��Ͻ��� �����ϰ�
 * �ܺηκ��� ��ü ������ ���� ���ϵ��� ���Ƶδ� ����
 * 
 * �ڵ��ۼ����
 * 1. Ŭ�������� �ϴ� �ϳ��� ��ü�� ���� --- private static ���� �����ؼ� ����
 * 2. �ܺο��� ��ü ������ ���ϵ��� ���´� ---- private ������()
 * 3. �ϳ� ����� ���� ��ü�� �ܺο��� ����� �� �ֵ��� ����д� --- public static ����
 */

class Factory{
	private static Factory factory = new Factory();
	private Factory() {
		System.out.println("Car Factory.... Creating");
	}
	public static Factory getInstance() {
		return factory;
	}
}

public class StaticExamTest5 {
	public static void main(String[] args) {
//		Factory f = new Factory(); //--->��ü�� ���� �� �����ڰ� ����Ǵµ�, �����ڸ� private���� ���Ƴ��� ������ ����
		
		//��ü������ ���ߴ�. ��ü������ �ؼ� �޸𸮸� �÷����ƾ� ���� �ִµ�, ��ü������ �������Ƿ� �����Ҽ� ����.
		//�׷��� getInstance()�տ� static�� ������ ���ٰ����� �� �ֵ��� �ؾ��Ѵ�.
		
		Factory factory1 = Factory.getInstance();
		Factory factory2 = Factory.getInstance();
		Factory factory3 = Factory.getInstance();

	}


}
