package oop.greet;
//EncoreGreet Ŭ���� �뵵
/*
 * EncoreGreet��
 * Encore ������Ÿ  �������鿡�� ���ϴ� �λ縻�� �����ϰ� �ִ� ��������
 */
public class EncoreGreet {
	//valuable ���� ����Ǵ� '����' = ����
	//Field
	public String name; //Initialization �ʱ�ȭ
	public String message;
	
	//�ʵ��߰�...
	public int classRoom;
	public String subject;
	
	//Method(���)
	public void sayHello() {
		int a = 0;
		System.out.println(name+", "+message);
	}
	//�޼ҵ� �߰�
	public String getEncore() {
		return name+"\t"+message+"\t"+classRoom+"\t"+subject;
	}
	//�Լ��߰�..'�������� ��'�� �ѹ��� �ʵ忡 �����ϴ� ����� ����
	//�޼ҵ� ���� = �޼ҵ� ����� + �޼ҵ� ������
	public void setEncore(String n, String m, int c, String s) {
		name = n; //field �ʱ�ȭ
		message = m;
		classRoom = c;
		subject = s;
	}
}

