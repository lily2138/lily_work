package exam.test;
//�ʵ�� static ������ ��� �ٸ����� Ȯ���ϰ� ����...
//static ������ ������ ��ü���� ���� �����Ѵ�...!!!...�ǹ̸� ��Ȯ�ϰ� ����

class Car{
	int serialNumber;
	static int counter;
	
	Car(){
		counter++; //1
		serialNumber = counter;
		
	}
}

public class StaticExamTest2 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println("======field======");
		System.out.println(car1.serialNumber);
		System.out.println(car2.serialNumber);
		System.out.println(car3.serialNumber);
		
		System.out.println("======static======");
		System.out.println(Car.counter);
		System.out.println(car1.counter);
		System.out.println(car2.counter);
		System.out.println(car3.counter);


	}

}
