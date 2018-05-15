/*
	Created By Vikri
	13/05/2018
	18:25
*/
import java.util.Scanner;

public class SoalBooleanRicha1 {
	public static void main  (String[] args) {
		String nama;
		int uang, tanggal;
		boolean kriteria;
		
		Scanner input = new Scanner (System.in);

		System.out.println ("=============== WELCOME TO TRAVEL CHOICE CLUB ===================");
		System.out.println (" Are you able to go Lombok this week? Please fill our form below!");

		System.out.print("What's your name? ");
		nama = input.next();

		System.out.print("How much budget do you have " +nama+ " ? (in dollar)");
		uang = input.nextInt();

		System.out.println ("Enter available date you have! (you may only choose 1 day, in number)");
		tanggal = input.nextInt();

		kriteria = uang>520 && (tanggal >= 1 && tanggal <= 5);

		System.out.println ("\n==================================================================");
		System.out.println ("This is your result, " + nama + "....");
		System.out.println ("Are you allowed go to lombok? " + kriteria);
	}
}