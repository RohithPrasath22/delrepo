package com.del.dao;

import com.del.exception.BankingException;

public interface BankingDao {


	void depositAmount(double amount);

	double getBalance();

	double getAmount(double amount) throws BankingException;

	boolean authenticate(String login, String password);

}
