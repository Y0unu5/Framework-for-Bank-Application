package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accName, float accBal, float creditLimit) {

		MMCurrentAcc currentAcc = new MMCurrentAcc(accNo,accName,accBal,creditLimit);
		return currentAcc;
	}

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accName, float accBal, boolean isSalaried, float MINBAL) {

		MMSavingAcc savingAcc = new MMSavingAcc(accNo,accName,accBal,isSalaried,MINBAL);
		return savingAcc;
	}

}
