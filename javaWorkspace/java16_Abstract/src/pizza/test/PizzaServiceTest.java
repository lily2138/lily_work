package pizza.test;

import java.util.Vector;

import pizza.child.BulgogiPizza;
import pizza.child.EggPizza;
import pizza.child.PotatoPizza;
import pizza.parent.Pizza;
import pizza.service.PizzaService;

public class PizzaServiceTest {

	public static void main(String[] args) {
		
		PizzaService service = new PizzaService();
		Vector<Pizza> v = new Vector<>(); //10ĭ¥�� ���������.
		
		v.add(new PotatoPizza(14000, "Pizza Hut"));
		v.add(new BulgogiPizza(16000, "Domino Pizza"));
		v.add(new EggPizza(11000, "�̽�������"));
		v.add(new PotatoPizza(5900, "��������"));
		
		System.out.println("Vector�ȿ� ����� ������ ��: "+ v.size()); //����� ������ ����
		System.out.println("Vector�� Capacity: "+ v.capacity()); //������ �뷮
		System.out.println("pizza Information :"+v); //��ü����...
		
		service.allMakePizza(v);

	}

}
