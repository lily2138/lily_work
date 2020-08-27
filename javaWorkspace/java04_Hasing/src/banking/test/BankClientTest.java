package banking.test;

import banking.Account;
import banking.Customer;

public class BankClientTest {

	public static void main(String[] args) {
		/*
		 * James��� �̸��� ���� ����...�ֹι�ȣ�� 1234
		 * James�� �ܾ� 10000���� ���� ���¸� �ϳ� ����
		 * ���� ���� ���¸� ���ؼ�
		 * 5000��, 12000���� �Ա��մϴ�
		 * 7000�� ���
		 * ���������� James������ �ܾ��� ���
		 */

		Customer custom1 = new Customer("James",1234);
		
		/*Account acc = new Account(10000);
		custom1.setAccount(acc);*/
		custom1.setAccount(new Account(10000));
		
		Account james = custom1.getAccount();
		
		james.deposit(5000);
		james.deposit(12000);
		james.withdraw(7000);
		
		System.out.println(james.getBalance());
		
/*		acc.deposit(5000);
		acc.deposit(12000);
		acc.withdraw(7000);
		
		System.out.println(acc.getBalance());*/
		
		
		
		
		
		
	}

}
