package model;

public class Customer { // java.lang.Object
	private long bankAccountNo; 
	private String password;
	private double balance;
	
	public Customer(long bankAccountNo, String password) {
		super();
		this.bankAccountNo = bankAccountNo;
		this.password = password;
		this.balance = 2000;
	}
	public long getBankAccountNo() {
		return bankAccountNo;
	}
//	public void setBankAccountNo(long bankAccountNo) {
//		this.bankAccountNo = bankAccountNo;
//	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}