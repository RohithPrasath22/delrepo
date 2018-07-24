package com.del.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.del.exception.MobileException;
import com.del.service.MobileService;
import com.del.service.MobileServiceImpl;

public class MobileClient {
	private MobileService mService;

	public MobileClient() {
		mService = new MobileServiceImpl();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		System.out.println("Welcome to Mobile Payment System");
		System.out.println("Enter Login ID");
		String login = scan.nextLine();
		System.out.println("Enter Password");
		String password = scan.nextLine();
		boolean loginSuccess = mService.authenticate(login, password);
		if (loginSuccess) {
			while (true) {
				choice = getChoice(scan);
				switch (choice) {
				case 1:
					System.out.println("DEPOSIT BILL AMOUNT AND MODE OF PAYMENT");
					System.out.println("Enter Mode Of Payment");
					String mode=scan.nextLine();
					System.out.println("Enter Amount To Be deposited");
					double amount = 0;
					try {
						amount = scan.nextDouble();
						mService.depositAmount(amount,mode);
					} catch (MobileException e) {
						System.err.println(e.getMessage());
					} catch (InputMismatchException e) {
						System.err.println("Enter Number Only");
						scan.nextLine(); 
					}
					break;
				case 2:
					System.out.println("CHECK UNPAID BALANCE");
					double balance = mService.getBalance();
					System.out.println("Balance: " + balance);
					break;
				case 3:
					System.out.println("Exiting The Service... Thank you.");
					System.exit(0);
					break;
				default:
					System.out.println("Enter A Valid Choice");
					break;
				}
			}
		}
		else {
			System.out.println("Either Login Or Password Is Wrong");
		}
	}

	private int getChoice(Scanner scan) {
		int choice = 0;
		System.out.println("MOBILE PAYMENT SYSTEM");
		System.out.println("1. Deposit Amount");
		System.out.println("2. Check Balance");
		System.out.println("3. Quit Program");
		System.out.println("Enter a choice 1 to 3");
		try {
			choice = scan.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Please Enter Numbers Only");
			scan.nextLine();
		}
		return choice;
	}

	public static void main(String[] args) {
		new MobileClient();
	}
}
