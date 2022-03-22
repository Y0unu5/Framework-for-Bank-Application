package com.tns.framework;

public abstract class BankAcc {
	public BankAcc() {
		
	}

	protected static  int accNo;
	protected static String accName;
	protected static float accBal;
	
	

	public static int getAccNo() {
		return accNo;
	}

	public static void setAccNo(int accNo) {
		BankAcc.accNo = accNo;
	}

	public static String getAccName() {
		return accName;
	}

	public static void setAccName(String accName) {
		BankAcc.accName = accName;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	public BankAcc(int accNo, String accName, float accBal) {
		
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
		return "BankAcc [accBal=" + accBal + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	

}
