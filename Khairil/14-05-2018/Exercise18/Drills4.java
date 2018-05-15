/*
	 Program     : Exercise 18 - Drills4
     Creator     : Khairil
     Created At  : 14 Mei 2018 09:50 AM     
     Updated By  : 
     Update Date : 


     60
     45
     32
     18
     12
     6
*/
import java.util.Scanner;

public class Drills4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String bis60, bis45, bis32, bis18, bis12, bis6;
		int jumlahPenumpang;

		System.out.print( "Masukkan Jumlah Penumpang ?  : " );
		jumlahPenumpang = keyboard.nextInt();

		bis60 = "Bis Dengan Kursi 60";
		bis45 = "Bis Dengan Kursi 45";
		bis32 = "Bis Dengan Kursi 32";
		bis18 = "Bis Dengan Kursi 18";
		bis12 = "Bis Dengan Kursi 12";
		bis6  = "Bis Dengan Kursi 6";

		if( jumlahPenumpang >= 60 ) {
			System.out.println( bis60 );
		}
		if( jumlahPenumpang >= 45 ) {
			System.out.println( bis45 );
		}
		if( jumlahPenumpang >= 32 ) {
			System.out.println( bis32 );
		}
		if( jumlahPenumpang >= 18 ) {
			System.out.println( bis18 );
		}
		if( jumlahPenumpang >= 12 ) {
			System.out.println( bis12 );
		}						
		if( jumlahPenumpang >= 6 || jumlahPenumpang >= 1) {
			System.out.println( bis6 );
		}
	}
}