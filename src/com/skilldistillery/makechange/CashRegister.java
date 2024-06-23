package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the price of your item: $");
		double itemPrice = keyboard.nextDouble();

		System.out.print("\nPlease enter the amount of money you will be using: $");
		double amountGiven = keyboard.nextDouble();

		if (amountGiven < itemPrice) {
			System.out.println("Error: not enough money given to complete transaction.");

		} else if (amountGiven > itemPrice) {
			double twenty = 20.00;
			double ten = 10.00;
			double five = 5.00;
			double one = 1.00;
			double quarter = 0.25;
			double dime = 0.10;
			double nickel = 0.05;
			double penny = 0.01;
			
			double changeDue = (amountGiven - itemPrice);
			double modTwenties = (changeDue % twenty);
			double modTens = (modTwenties % ten);
			double modFives = (modTens % five);
			double modOnes = (modFives % one);
			double modQuarters = (modOnes % quarter);
			double modDimes = (modQuarters % dime);
			double modNickels = (modQuarters % nickel);
			double modPennies = (modNickels % penny);

			int numTwenties = (int) ((changeDue - modTwenties) / (twenty));
			int numTens = (int) ((modTwenties - modTens) / (ten));
			int numFives = (int) ((modTens - modFives) / (five));
			int numOnes = (int) ((modFives - modOnes) / (one));
			int numQuarters = (int) ((modOnes - modQuarters) / (quarter));
			int numDimes = (int) ((modQuarters - modDimes) / (dime));
			int numNickels = (int) ((modDimes - modNickels) / (nickel));
			int numPennies = (int) ((modNickels - modPennies) / (penny));

			System.out.println("\nTotal amount of change owed: $" + changeDue);
			if (numTwenties > 0) {
				System.out.println("Number of twenty dollar bills owed: " + numTwenties);
			} else {
				System.out.print("");
			}
			if (numTens > 0) {
				System.out.println("Number of ten dollar bills owed: " + numTens);
			} else {
				System.out.print("");
			}
			if (numFives > 0) {
				System.out.println("Number of five dollar bills owed: " + numFives);
			} else {
				System.out.print("");
			}
			if (numOnes > 0) {
				System.out.println("Number of one dollar bills owed: " + numOnes);
			} else {
				System.out.print("");
			}
			if (numQuarters > 0) {
				System.out.println("Number of quarters owed: " + numQuarters);

			} else {
				System.out.print("");
			}
			if (numDimes > 0) {
				System.out.println("Number of dimes owed: " + numDimes);
			} else {
				System.out.print("");
			}
			if (numNickels > 0) {
				System.out.println("Number of nickels owed: " + numNickels);
			} else {
				System.out.print("");
			}
			if (numPennies > 0) {
				System.out.println("Number of pennies owed: " + numPennies);
			} else {
				System.out.print("");
			}

		} else {
			System.out.println("\nExact amount given: transaction complete, enjoy your purchase!");
		}

		keyboard.close();

	}

}
