package oop.encapsulation;

public class MyDate {
	
	//class�� �ִ� �ʵ�� ������  private
	private int month;
	private int day;
	
	
	public int getMonth() {
		return month;
	}
	//���ú����� �ʵ��� �̸��� ���� �� �����ϱ� ���ؼ� �ʵ�տ� this�� �����Ѵ�.
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	

}
