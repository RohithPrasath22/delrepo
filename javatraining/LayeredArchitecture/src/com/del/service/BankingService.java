package com.del.service;

import com.del.exception.BankingException;

public interface BankingService {

	void depositAmount(double amount) throws BankingException;

	double getBalance();

	double getAmount(double amount) throws BankingException;

	boolean authenticate(String login, String password);

}
