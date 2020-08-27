package oop.encapsulation;
/*
 * ���� ���� �Է� : 1~12������ ���� �ް�..�� �̿��� ���� ������ �ʵ忡 �Ҵ���� �ʵ��� ������ �ۼ�
 * ��¥ �Է�:
 * 1,3,5,7,8,10,12�� : 1~31��
 * 2��:1~28��
 * 4,6,9,11�� : 1~30�ϱ����� ���� ����ϵ��� �� ���� ��¥�� �ԷµǸ� �ʵ� ������� �ʵ��� ������ �ۼ�
 */

public class MyDate {
	private int month;
	private int day;
	
	
	public int getMonth() {
		return month;
	}
	//���ú����� �ʵ��� �̸��� ���� �� �����ϱ� ���ؼ� �ʵ�տ� this�� �����Ѵ�.
	public void setMonth(int month) {
		//���...���
		if (month>=1 && month<=12)
			this.month = month;
		else
			System.out.println("�߸��ԷµǾ����ϴ�");
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day>=1 && day<=31)
				this.day = day;
			else
				System.out.println("�߸��ԷµǾ����ϴ�");
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			if (day>=1 && day<=30)
				this.day = day;
			else
				System.out.println("�߸��ԷµǾ����ϴ�");
		}else if(month == 2){
			if (day>=1 && day<=28)
				this.day = day;
			else
				System.out.println("�߸��ԷµǾ����ϴ�");
		}else
			System.out.println("�߸��ԷµǾ����ϴ�");
	}
	
	

}
