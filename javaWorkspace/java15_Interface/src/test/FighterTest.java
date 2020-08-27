package test;

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		if(f instanceof Unit) {
			System.out.println("f�� Unit�� �ڼ��Դϴ�...");
		}
		if(f instanceof Movable) {
			System.out.println("f�� Movable�� �ڼ��Դϴ�...");
		}
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable�� �ڼ��Դϴ�...");
		}
	}

}

class Unit{
	int currentHP; //������ ü��
	int x;		   //������ ��ġ(x��ǥ)
	int y;		   //������ ��ġ(y��ǥ)
}

interface Movable{
	void move(int x, int y);
	
}

interface Attackable{
	void attack(Unit u);
}

//�������̽� ������ extends �ؾ��Ѵ�. implements�ϸ� �ȵȴ�. implements�� ��üȭ�� �ؾ��ϱ� �����̴�.
//�������̽��� ���߻�� �ȴ�.
interface Fightable extends Movable, Attackable{
}

//implements�� extends�� ���ÿ� �̷������. 
class Fighter extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}
	
}













