package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	public MMCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal,creditLimit);

	}

	
	@Override
	public void withdraw(float withdrawal) {
		// TODO Auto-generated method stub
		super.withdraw(withdrawal);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc []";
	}

}
