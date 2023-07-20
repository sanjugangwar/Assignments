package com.monocept.inheritence.Account;

public class Current extends Account {
	
	private int roi;
	
	public int getRoi() {
		return roi;
	}

	public void setRoi(int roi) {
		this.roi = roi;
	}

	void setCurrentAccount(int accountNumber,String accountName ,int roi) {
		this.setAccountNumber(accountNumber);
		this.setAccountName(accountName);
		this.setRoi(roi);
	}
	
	void showCurrentAccount() {
		System.out.println("Account Number "+this.getAccountNumber());
		System.out.println("Account Name "+this.getAccountName());
		System.out.println("Roi "+this.getRoi());
	}
	

}
