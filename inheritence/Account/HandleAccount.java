package com.monocept.inheritence.Account;
import java.util.*;

public class HandleAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter the type of account you want to create (saving/current)");
		String type=scanner.next();
		
		if(type.equalsIgnoreCase("saving")) {
			
			Saving saving=new Saving();
			System.out.println("Enter account Number ,name and balance");
			
			int accountNumber=scanner.nextInt();
			String accountName=scanner.next();
			int balance=scanner.nextInt();
			
			
			saving.setSavingAccount(accountNumber,accountName, balance);
			
			saving.showSavingAccount();
			
			return ;
			
		}
		
		Current current=new Current();
		
		System.out.println("Enter account number,name and rate of interest ");
		int accountNumber=scanner.nextInt();
		String accountName=scanner.next();
		int roi=scanner.nextInt();
		
		current.setCurrentAccount(accountNumber,accountName, roi);
		current.showCurrentAccount();
		
		

	}

}
