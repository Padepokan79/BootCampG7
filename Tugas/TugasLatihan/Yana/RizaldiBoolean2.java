/*
Create by	: Yana
Time 		: 3 Mei 2018 15.14
Update by	:
*/

import java.util.Scanner;

public class RizaldiBoolean2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		Scanner line	 = new Scanner(System.in);

		String	makan, minum, berak;
		boolean hasil;


		System.out.print("Makan Apa? ");
		makan	= keyboard.next();
		System.out.print("Minum Apa? ");
		minum	= keyboard.next();
		System.out.print("Berak di? ");
		berak	= keyboard.next();

		hasil	= ( ( makan.equals("Rumput") || makan.equals("Dedak") ) && minum.equals("AirHujan") && berak.equals("Pasir") );

		System.out.print("BISA TIDUR : "+hasil);

	}
}