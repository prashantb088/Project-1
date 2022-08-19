package com.bankapp.model;

public class bankModel {
	//public void display() {
	//	System.out.println("this is model ");
	//}
	
	private int accNumber;
	private int accBalance;
	private String accHolderName;
	private String accpassword;
	
	@Override
	public String toString() {
		return "bankModel [accNumber=" + accNumber + ", accBalance=" + accBalance + ", accHolderName=" + accHolderName
				+ ", accpassword=" + accpassword + "]";
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public int getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getAccpassword() {
		return accpassword;
	}
	public void setAccpassword(String accpassword) {
		this.accpassword = accpassword;
	}
	////////////////////////////////////////////
	public void depositAmount(int amount) {
		this.accBalance +=amount;
	}
	
	public void withdrawAmount(int amount) {
		this.accBalance -=amount;
	}

}












