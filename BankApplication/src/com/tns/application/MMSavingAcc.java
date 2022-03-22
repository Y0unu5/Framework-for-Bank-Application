package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
private static final float MINBAL = 0;

	public  float getMinbal() {
	return MINBAL;
}

	public MMSavingAcc(int accNo, String accName, float accBal, boolean isSalaried, float MINBAL) {
		super(accNo, accName, accBal, isSalaried, MINBAL);

	}

	public MMSavingAcc() {
		super(accNo, accName, MINBAL, isSalaried, MINBAL);
	}

	@Override
	public void withdraw(float withdrawal) {
		// TODO Auto-generated method stub
		super.withdraw(withdrawal);
	}

	@Override
	public boolean isSalaried() {
		// TODO Auto-generated method stub
		return super.isSalaried();
	}

	@Override
	public void setSalaried(boolean isSalaried) {
		// TODO Auto-generated method stub
		super.setSalaried(isSalaried);
	}

	@Override
	public String toString() {
		return "MMSavingAcc []";
	}

}
