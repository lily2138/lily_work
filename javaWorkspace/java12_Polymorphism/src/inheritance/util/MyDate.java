package inheritance.util;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
/*
 * �޼ҵ� Overriding
 * 1step. Object�� ����� �״�� �޾Ƽ�
 * 2step. �ױ���� �ڽ� ���ο��� �µ��� ���ľ���.
 */
//---------> getter �ʿ���Եƴ�
	@Override 	
	public String toString() {
		return year+"-"+month+"-"+day;
	}
}
