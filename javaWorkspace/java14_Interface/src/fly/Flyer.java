package fly;
//�Ϻ��� �߻�ȭ...������ ���� �ϳ��� ����� �������̽��̴�.
//���ø� �޼ҵ��... �ʵ嵵 ���� ������ ����� ��
//�������̽� ������� = �߻�޼ҵ� + ���

public interface Flyer {
	public static final int SIZE=100;
	//������ �Ͱ� ���õ� ����� Template�� ����...
	public abstract void fly();
	void land(); //������ �տ� public abstract�� �����ȴ�.
	void take_off();
	
	
	
}
