package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class ClientTest {

	public static void main(String[] args) {

		MMBankFactory mmfactory = new MMBankFactory();
		mmfactory.getNewCurrentAccount(101, "Yunus", 40000, 25000);
		mmfactory.getNewSavingAccount(201, "Sam", 10000, true, 1000);

		MMSavingAcc mmSav = new MMSavingAcc();
		mmSav.getAccNo();
		mmSav.getAccName();
		mmSav.getMinbal();
		mmSav.getAccBal();

		mmSav.toString();
		mmSav.deposit(20000);
		mmSav.withdraw(200);

		MMCurrentAcc mmCurr = new MMCurrentAcc(291, "Rohit", 30000, 40000);
		mmCurr.getAccBal();
		mmCurr.getAccName();
		mmCurr.getCreditlimit();
		mmCurr.withdraw(15000);
		mmCurr.toString();

	}

}
