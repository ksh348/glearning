package travel.service;

//import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;

public class TravellerPayment {

	public void getDenominations(int denominations[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the currency denominations value ");
		for(int index=0; index < denominations.length; index++) {
			denominations[index] = scan.nextInt();
		}
		scan.close();
	}


	public void denominationsToPay(int denominations[], int amountToPay) {	
		int denominationsToPay[] = new int[denominations.length];

		int amount = amountToPay;

		for(int index =0; index < denominations.length; index++) {
			denominationsToPay[index] = amount / denominations[index];
			amount -= (denominations[index] * denominationsToPay[index]);
		}
		if(amount != 0) {
			System.out.println("Sorry can’t make exact payment");
			return;
//			denominationsToPay[denominations.length-1]++;
		}

		System.out.println("To pay amountToPay Pay in ");
		for(int index=0; index < denominations.length; index++) {
			if(denominationsToPay[index] != 0) {
				System.out.println(denominations[index] + " : " + denominationsToPay[index]);
			}
		}

	}
}