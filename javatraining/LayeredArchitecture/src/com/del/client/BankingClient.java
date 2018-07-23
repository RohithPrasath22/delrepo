package com.del.client;

import java.util.InputMismatchException;

import java.util.Scanner;

import com.del.exception.BankingException;
import com.del.service.BankingService;
import com.del.service.BankingServiceImpl;

public class BankingClient {
	private BankingService bService;

	public BankingClient() {

		bService = new BankingServiceImpl();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		System.out.println("please enter your login: ");
		String login = scan.nextLine();
		System.out.println("enter your password");
		String password = scan.nextLine();
		boolean check = bService.authenticate(login, password);
		if (check) {
			System.out.println("welcome to banking system");

			while (true) {
				choice = getchoice(scan);
				switch (choice) {
				case 1:
					System.out.println("Deposit Amount");
					System.out.println("Enter amount to be deposited");
					double amount = 0;
					try {
						amount = scan.nextDouble();
						bService.depositAmount(amount);
					} catch (InputMismatchException e) {
						System.err.println("enter only numbers");
						scan.nextLine();
					} catch (BankingException e) {
						System.err.println(e.getMessage());
					}
					break;
				case 2:
					System.out.println("Withdraw Amount");
					System.out.println("Enter the amount to be withdrawn");
					try {
						amount = scan.nextDouble();
						double amountWithdrawn = 0;
						amountWithdrawn = bService.getAmount(amount);
						System.out.println("you have withdrawn" + amountWithdrawn);
					} catch (InputMismatchException e) {
						System.err.println("enter only numbers");
						scan.nextLine();
					} catch (BankingException e) {

						System.err.println(e.getMessage());
					}
					break;
				case 3:
					System.out.println("Check Balance");
					double balance = bService.getBalance();
					System.out.println("The balance is " + balance);
					break;
				case 4:
					System.out.println("Exiting program...Thank you and have a nice day");
					System.exit(0);
					break;

				default:
					System.err.println("Invalid option...Please try again");
					break;
				}
			}
		} else {
			System.err.println("login or password is wrong");
		}

	}

	private int getchoice(Scanner scan) {
		int choice = 0;
		System.out.println("Enter your choice from 1 to 4");
		System.out.println("1.Deposit Amount");
		System.out.println("2.Withdraw Amount");
		System.out.println("3.Check balance");
		System.out.println("4.Quit program");
		try {
			choice = scan.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("please enter only numbers!!");
			scan.nextLine();
		}

		return choice;

	}

	public static void main(String[] args) {
		new BankingClient();

	}

}
