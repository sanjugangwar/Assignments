package com.monocept.inheritence.Account;

public class Saving  extends Account{
	
	int balance;
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	void setSavingAccount(int accountNumber,String accountName ,int balance) {
		this.setAccountNumber(accountNumber);
		this.setAccountName(accountName);
		this.setBalance(balance);
	}
	
	void showSavingAccount() {
		System.out.println("Account Number "+this.getAccountNumber());
		System.out.println("Account Name "+this.getAccountName());
		System.out.println("Balance "+this.getBalance());
	}
	
}
