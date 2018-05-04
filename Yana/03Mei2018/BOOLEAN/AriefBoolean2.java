/*
Create by	: Yana
Time 		: 3 Mei 2018 20.05
Update by	:
*/

import java.util.Scanner;

public class AriefBoolean2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int		hari;
		boolean hasil;

		System.out.print("Hari (1/2/3/4/5/6/7): ");
		hari	= keyboard.nextInt();

		hasil	= ( hari >= 1 || hari <= 4 || hari == 6 );

		
		System.out.println("Toko Elektronik Buka " +hasil);
	}
}