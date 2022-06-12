package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.Customer;
import service.CustomerService;

public class BankApp {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(new Customer(1111111, "oneone"));
		customerList.add(new Customer(2222222, "twotwo"));
		customerList.add(new Customer(3333333, "threethree"));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Account number ");
		long accoutNumber = scan.nextLong(); // enter
		
		scan.nextLine();
		
		System.out.println("Enter the password ");
		String passwd = scan.nextLine();
		
		Customer customer = new Customer(accoutNumber, passwd);

		boolean exists = false;
		
		for(int index =0; index < customerList.size(); index++) {
			if((customerList.get(index).getBankAccountNo() == customer.getBankAccountNo())
					&& (customerList.get(index).getPassword().equals(customer.getPassword())))
					exists = true;
		}
		
		if(exists) {
			CustomerService service = new CustomerService(customer);
			System.out.println("1. Deposit");
			System.out.println("2. withdraw");
			System.out.println("3. Transfer");
			System.out.println("4. Logout");
			
			System.out.println("Enter your choice ");
			int choice = scan.nextInt();
			double amount;
			switch(choice){
			case 1:
				System.out.println("Enter amount to deposit ");
				amount = scan.nextDouble();
				service.deposit(amount);
				break;
			case 2:
				System.out.println("Enter amount to withdraw ");
				amount = scan.nextDouble();
				service.withdraw(amount);
				break;
			case 3:
				System.out.println("Enter amount to transfer ");
				amount = scan.nextDouble();
				service.transfer(amount);
				break;
			case 4: 
				service.logout();
				break;
			default: System.out.println("Invalid choice ");
			}
		}
		else {
			System.out.println("Not valid customer ");
		}
	}
}