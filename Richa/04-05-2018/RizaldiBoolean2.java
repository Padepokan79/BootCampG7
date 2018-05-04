/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 11.28 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class RizaldiBoolean2 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		String makanan, minum, berak;
		boolean yaMinum, yaBerak, rumput, dedak, tidur;

		System.out.println ("Kucing Sasuke");

		System.out.print ("Makanan (rumput/dedak): ");
		makanan = keyboard.next ();

		rumput = makanan.equals ("rumput");
		dedak = makanan.equals ("dedak");

		System.out.print ("Minum air hujan? (ya/tidak) ");
		minum= keyboard.next ();

		yaMinum = minum.equals ("ya");

		System.out.print ("Berak di pasir? (ya/tidak) ");
		berak= keyboard.next ();

		yaBerak = berak.equals ("ya");

		tidur = ((rumput || dedak)&& yaBerak && yaMinum);

		System.out.println ("Kucing Sasuke tidur? " + tidur);
	}
}
