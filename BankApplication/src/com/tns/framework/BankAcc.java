package com.tns.framework;

public abstract class BankAcc {
	private int accNo;
	private String accName;
	private float accBal;

	public BankAcc(int accNo, String accName, float accBal) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}

	public void withdraw(float withdrawal) {
		if (accBal >= withdrawal) {
			System.out.println(accNo + " " + accName + " " + " withdrawn :" + " " + withdrawal);
			accBal -= withdrawal;
			System.out.println("Balance after withdrawal:" + accBal);
		} else {
			System.out.println(accName + " you cannot withdraw " + withdrawal);
		}
	}

	public void deposit(float deposit) {
		System.out.println(accName + " deposited :" + deposit);
		accBal += deposit;
		System.out.println("Balance after deposit: " + accBal);
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
