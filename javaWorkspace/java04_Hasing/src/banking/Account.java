package banking;
/*
 * ������ ������ �����ϴ� Ŭ����...
 */

public class Account {
	
	private double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {
		balance += amt;
	}
	
	public void withdraw(double amt) {
		balance -= amt;
	}
	
}