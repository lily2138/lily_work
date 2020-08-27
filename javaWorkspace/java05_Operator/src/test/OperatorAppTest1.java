package test;
/*
 * ����� ��ġ�� ���� ��������
 * 			Field��				 Local ������ ���� 
 * 
 * 1. Ŭ���� �ٷ� ��, �޼ҵ� �ٱ�	|   �޼ҵ�{��
 * 2. �⺻���� �ִ�				|	�⺻���� ����.. �ݵ�� �ʱ�ȭ �ϰ� ���...
 * 3. Heap �޸�				|	Stack
 * 4. Member Variable		|	��������, Temporary V, Automatically V
 * 	   �ν��Ͻ� ����, ��ü ����		|
 *    �������� X
 */

public class OperatorAppTest1 {
	public static void main(String[] args) {
		//Local ���� ����
		int i=5;
		int j=3;
		
		Operator o1 = new Operator();
		Operator o2 = new Operator();
		
		o1 = o2; //�ּҰ��� 02�� ����������. --> �ּҰ��� �����ϴٴ� ���� ���� ��ü
		
		System.out.println("o1�ּҰ�: "+o1);
		System.out.println("o2�ּҰ�: "+o2);
		
		System.out.println(o1==o2);
		
		System.out.println("������% :: "+ i%j); //2
		System.out.println(i==j); //false
		System.out.println(i!=j); //true
		
		boolean flag = false;
		System.out.println(flag);//false
		System.out.println(!flag);//true
		
		int k = 10;
		System.out.println(k++); //1������.. 10
		System.out.println(k); //11
		
		int m = 10;
		System.out.println(++m);//����1������.. 11
		System.out.println(m); //11
		
		//Short Circuit
		System.out.println(o1.test1() || o1.test2()); //true
		System.out.println(o1.test2() && o2.test1()); //flase
		
	}

}
//class�� ������ ���޾Ƽ� ���� ���� 'public'�� �ϳ��� class���� �������ִ�. -->main method�� ������ �ִ� class���� �����ִ�.
//�� public ���� class�̸����θ� �����ؾ��Ѵ�.
class Operator{
	public boolean test1() {
		System.out.println("test1() call......");
		return true;
	}
	
	public boolean test2() {
		System.out.println("test2() call......");
		return false;
	}
}








