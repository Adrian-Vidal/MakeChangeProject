package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the price of your item: ");
		double userInput = keyboard.nextInt();
		System.out.print("Please enter how much money you will be using: ");
		double userInput2 = keyboard.nextInt();

		keyboard.close();
	}

}
