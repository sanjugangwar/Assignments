package com.monocept.july5;

import java.util.Scanner;

public class CurrencyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Withdrawl amount");
		Scanner scanner=new Scanner(System.in);
		int amount=scanner.nextInt();
		
		if(amount>0 && amount%100 == 0 && amount<=50000) {
			
			if(amount>=2000) {
				System.out.println("Two Thousand: "+amount/2000);
				amount%=2000;
			}
			if(amount>=500) {
				System.out.println("Five Hundred: "+amount/500);
				amount%=500;
			}
			if(amount>=200) {
				System.out.println("Two Hundred: "+amount/200);
				amount%=200;
			}
			if(amount>=100) {
				System.out.println("Hundred: "+amount/100);
				amount%=100;
			}
			
			
		}
		else if(amount>50000) {
			System.out.println("Amount exceeds withdrwal limit of 50000");
		}
		else {
			System.out.println("Amount should be multiple of 100");
		}
		

	}

}
