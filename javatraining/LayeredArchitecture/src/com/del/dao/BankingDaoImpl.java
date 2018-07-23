package com.del.dao;

import com.del.exception.BankingException;
import com.del.util.Message;

public class BankingDaoImpl implements BankingDao {
	private double balance;
	private double minBalance = 10000;
	private String login = "Deloitte";
	private String password = "del123";

	@Override
	public void depositAmount(double amount) {
		balance += amount;

	}

	@Override
	public double getAmount(double amount) throws BankingException {
		double bal = balance - amount;

		if (bal < minBalance) {
			throw new BankingException(Message.LOW_BALANCE);
		} else
			balance = bal;
		return amount;

	}

	@Override
	public double getBalance() {

		return balance;

	}

	@Override
	public boolean authenticate(String clogin, String cpassword) {
		if (login.equals(clogin) && password.equals(cpassword)) {
			return true;
		} else
			return false;
	}

}
