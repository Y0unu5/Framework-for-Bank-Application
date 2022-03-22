package com.tns.framework;
 

public abstract class CurrentAcc extends BankAcc {
	

	protected static final float creditLimit = 25000;
	public CurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal);
		
	}
	
	@Override
	public void withdraw(float withdrawal) {

		if(withdrawal>= creditLimit) {
			System.out.println(accNo+" "+accName+" "+" Cannot withdraw amount because your Credit Limit is"+ creditLimit);
		}
	}

	public static float getCreditlimit() {
		return creditLimit;
	}

	@Override
	public String toString() {
		return "CurrentAcc [accBal=" + accBal + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
