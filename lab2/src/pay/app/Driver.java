package pay.app;

import java.util.Scanner;

import pay.service.PayMoneyProblem;

public class Driver {

	public static void main(String[] args) {
		int noOfTranasactions = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the size of transaction array");
		noOfTranasactions = scan.nextInt();
		
		int transactionAmounts[] = new int[noOfTranasactions];
		
		System.out.println("enter the values of array");
		for(int index=0; index< transactionAmounts.length; index++) {
			transactionAmounts[index] = scan.nextInt();
		}
		
		PayMoneyProblem pmp = new PayMoneyProblem();
		pmp.transaction(transactionAmounts);
		scan.close();
	}

}
