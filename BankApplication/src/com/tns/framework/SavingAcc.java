package com.tns.framework;

public abstract class SavingAcc extends BankAcc {
	public static boolean isSalaried;

	protected static final float MINBAL = 0;

	public SavingAcc() {

	}

	public SavingAcc(int accNo, String accName, float accBal, boolean isSalaried, float MINBAL) {
		super(accNo, accName, accBal);
		this.setSalaried(isSalaried);
	}

	@Override
	public void withdraw(float withdrawal) {

		if (accBal >= withdrawal) {

			System.out.println(accNo + " " + accName + " " + " withdrawn :" + " " + withdrawal);
			accBal -= withdrawal;
			System.out.println("Balance after withdrawal:" + accBal);

		} else {
			System.out.println(accName + " you cannot withdraw " + withdrawal);
		}

	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		SavingAcc.isSalaried = isSalaried;
	}

	public float getMinbal() {
		return MINBAL;
	}

	@Override
	public String toString() {
		return "SavingAcc [accBal=" + accBal + ", isSalaried()=" + isSalaried() + ", getAccBal()=" + getAccBal()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
