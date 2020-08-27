package oop.constructor;
/*
 * Default Construct
 * 1.���ڰ��� ���� ������
 * 2. �����ο��� �ƹ��� �ϵ� ���� �ʴ»�����
 */

public class Shirt {
	//�������ʱ�ȭ
	public String maker; //�⺻���� ������...null
	public boolean longSleeved;
	public char color;
	
	public Shirt() {} //Default Construct
	public Shirt(String m, boolean longs, char c) { //�ʵ��ʱ�ȭ
		maker = m;
		longSleeved = longs;
		color = c;
	}
	public String getDetails() { //worker�޼ҵ� = ������ �ִ� �޼ҵ�
		return maker+", "+longSleeved+", "+color;
	}

}
