/*
Created by	: Yana
Time		: 14 Mei 2018 08.57
*/

import java.util.Scanner;

public class ComparingNumbers{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		double first, second;

		System.out.print("GIve me two numbers. First: ");
		first = keyboard.nextDouble();
		System.out.print("Second: ");
		second = keyboard.nextDouble();

		System.out.println("You are: ");

		if ( first < second) {
			System.out.println(first+ " is LESS THAN " +second);
		}
		if ( first <= second) {
			System.out.println(first+ " is LESS THAN/EQUAL TO " +second);
		}if ( first == second) {
			System.out.println(first+ " is EQUAL TO " +second);
		}if ( first >= second) {
			System.out.println(first+ " is GREATER THAN / EQUAL TO " +second);
		}
		if ( first > second) {
			System.out.println(first+ " is GREATER THAN " +second);
		}
		if ( first != second) 
			System.out.println(first+ " is NOT EQUAL TO " +second);
		
	}
}