package com.monocept.assignment1;

import java.util.Scanner;

public class WaterBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n\n===================================Water Bill Generator ===============================================\n\n");
		
		int meterCharge=75;
		int bill=0;
		int totalBill=meterCharge;
		
		System.out.println("Your Meter Charge Is: "+meterCharge);
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter The Number Of Units You Consumed: ");
		int consumedUnit=scanner.nextInt();
		
		
		if(consumedUnit<=100) {
			bill+=consumedUnit*5;
		}
		else if(consumedUnit<=250) {
			bill+=consumedUnit*10;
		}
		else {
			bill+=consumedUnit*20;
		}
		
		totalBill+=bill;
		
		System.out.println("Your Total Bill is "+totalBill);
		
	}

}
