package service;

import java.util.Scanner;

import model.Customer;

public class CustomerService {

	private Customer customer;
	
	public CustomerService(Customer customer) {
		super();
		this.customer = customer;
	}
	public double deposit(double amount) {
		customer.setBalance(customer.getBalance()+amount);
		return customer.getBalance();
	}
	
	public double withdraw(double amout) {
		if(amout < customer.getBalance()) {
			customer.setBalance(customer.getBalance()-amout);
		}
		else {
			System.out.println("Sorry in sufficient balance ");
		}
		return customer.getBalance();
	}
	
	public double transfer(double amount) {
		System.out.println("Enter account number to transfer ");
		Scanner scan = new Scanner(System.in);
		long accountNumber = scan.nextLong();
		
		int otpGenerated = generateOTP();
		
		System.out.println("Generated OTP : " + otpGenerated);
		
		System.out.println("Enter OTP ");
		int otp = scan.nextInt();
		
		if(otpGenerated == otp) {
			customer.setBalance(customer.getBalance()-amount);
			System.out.println(amount + " transfered successfully to " + accountNumber);			
		}
		scan.close();
		return customer.getBalance();
	}
	
	private int generateOTP() {
		int number = 0;
		while(! (number >= 1000 && number <= 9999))
			number = (int)(Math.random()*10000);
		return number;
	}
	
	public void logout() {
		System.out.println("Logged off ...");
	}
}