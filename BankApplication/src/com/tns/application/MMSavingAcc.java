package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	
	public MMSavingAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal, isSalaried);

	}

	

	@Override
	public void withdraw(float withdrawal) {

		super.withdraw(withdrawal);
	}



	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
}
