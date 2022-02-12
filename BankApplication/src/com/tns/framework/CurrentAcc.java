package com.tns.framework;

class creditLimit {
	private creditLimit() {

	}

	public final creditLimit obj = new creditLimit();
}

public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;

	public static float getCreditLimit(float creditLimit) {

		return creditLimit;

	}

	public CurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal);
		this.creditLimit = creditLimit;
	}

	@Override
	public void withdraw(float withdrawal) {

		super.withdraw(withdrawal);
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
