package com.tns.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;

	private static final float MINBAL = 1000;

	public SavingAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public void withdraw(float withdrawal) {

		super.withdraw(withdrawal);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
