//Created by : Hendra Kurniawan
//Date : 20 Mei 2018 Time : 10:36 AM
//Modified by :
import java.util.Scanner;

public class Ex16Drills1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double first, second;

		System.out.print( "Give me two numbers. First : ");
		first = keyboard.nextDouble();
		System.out.print( "Second : ");
		second = keyboard.nextDouble();

		if(first < second){
			System.out.println( first + " is LES THAN " + second);
		}
		if(first <= second){
			System.out.println( first + " is LESS THAN/EQUAL TO " + second);
		}
		if(first == second){
			System.out.println( first + " is EQUAL TO " + second);
		}
		if(first >= second){
			System.out.println( first + " is GREATER THAN/EQUAL TO " + second);
		}
		if(first > second){
			System.out.println( first + " is GREATER THAN " + second);
		}
		if(first != second)
			System.out.println( first + " is NOT EQUAL TO " + second);
			System.out.println( "Hey ");
	}

}
//kata "hey" tidak termasuk bagian dari if statement sehingga kata "hey" akan terus muncul/tercetak
//walaupun kondisi dari if statement diatasnya tidak terpenuhi