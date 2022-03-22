package com.tns.framework;

public interface BankFactory {
	
	public abstract SavingAcc getNewSavingAccount(int accNo, String accName, float accBal, boolean isSalaried, float MINBAL);

	public abstract CurrentAcc getNewCurrentAccount(int accNo, String accName, float accBal, float creditLimit);

	
	
	
	
}
