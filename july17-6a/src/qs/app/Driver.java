package qs.app;

import java.util.NoSuchElementException;
import java.util.Scanner;

import qs.service.MyStack;

public class Driver {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		int userChoice = 0;
		int data = 0;
		Scanner scan = new Scanner(System.in);
		while(userChoice != 6) {
			System.out.println("**** STACK DEMO *****");
			System.out.println("1. Push Element ");
			System.out.println("2. Pop Element ");
			System.out.println("3. Display ");
			System.out.println("4. Get Size");
			System.out.println("5. Is Empty ");
			System.out.println("6. Exit ");
			System.out.println("Enter Your Choice ");
			userChoice = scan.nextInt();

			switch (userChoice) {
			case 1:
				System.out.println("Enter data to Push ");
				data = scan.nextInt();
				myStack.push(data);
				break;
			case 2:
				try {
				System.out.println("Poped Element is : " + myStack.pop());
				}catch (NoSuchElementException ex) {
					System.out.println("No Elements to Pop ");
				}
				break;

			case 3:
				myStack.dispaly();
				break;
			case 4: System.out.println("Size of Stack is : " + myStack.getSize());
			break;
			case 5: 
				System.out.println(myStack.isEmpty() ? "Yes, it is Empty " : "Not Empty");
				break;
			case 6:
				System.out.println("Bye ");
				break;
			default:
				System.out.println("Invalid Choice ");
			}
		}

	}
}