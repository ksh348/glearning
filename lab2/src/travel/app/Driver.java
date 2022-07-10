package travel.app;

import java.util.Scanner;

import travel.service.MergeSort;
import travel.service.TravellerPayment;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many currency denominations ");
		int  noOfDenominations = scan.nextInt();
		int denominations[] = new int[noOfDenominations];
		TravellerPayment tpay = new TravellerPayment();
		tpay.getDenominations(denominations);
		

		MergeSort mergeSort = new MergeSort();
		mergeSort.sortDsc(denominations, 0, denominations.length -1);
		
		System.out.println("Enter the amount you want to pay ");
		int amountToPay = scan.nextInt();
		
		tpay.denominationsToPay(denominations, amountToPay);
		scan.close();
	}
}