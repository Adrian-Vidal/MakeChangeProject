package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the price of your item: ");
		int userInput = keyboard.nextInt();
		System.out.print("Please enter the amount of money you will be using: ");
		int userInput2 = keyboard.nextInt();

		keyboard.close();
	}

}
