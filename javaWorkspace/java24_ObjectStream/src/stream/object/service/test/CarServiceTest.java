package stream.object.service.test;

import java.util.ArrayList;

import stream.object.service.CarService;
import stream.object.vo.Car;

public class CarServiceTest {

	public static void main(String[] args) throws Exception {
		String path = "src\\list.obj";
		
		CarService service = new CarService();
		
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Car("������", 3500));
		list.add(new Car("�ƹ݋�", 1500));
		list.add(new Car("���ݽ�", 6000)); 
		
		service.outputCar(list, path);
		System.out.println("list.obj�� �ڵ����� ������ ����߽��ϴ�...");
		System.out.println("====================================");
		
		ArrayList<Car> returnCar = service.inputCar(path);
		System.out.println("������ȭ�� �ڵ��� ������ �����ͼ� ����߽��ϴ�...");
		for(Car c:returnCar)
			System.out.println(c);
			
	}

}







