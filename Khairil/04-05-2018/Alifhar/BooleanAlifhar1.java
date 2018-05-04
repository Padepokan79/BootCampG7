/*
	 Program     : Boolean Alifhar 1 / Partner Kerja
     Creator     : Khairil
     Created At  : 3 Mei 2018 18:45 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanAlifhar1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int inputUsia, minUsia, inputPengalaman, minPengalaman;
		double inputBekerjaCepat, minBekerjaCepat, inputPenampilan, minPenampilan;
		boolean balance;

		System.out.print( "Bekerja Cepat (Skala 0.0 - 10.0) ?  " );
		inputBekerjaCepat = keyboard.nextDouble();

		System.out.print( "Penampilan (Skala 0.0 - 10.0) ?  " );
		inputPenampilan = keyboard.nextDouble();

		System.out.print( "Usia Partner ?  " );
		inputUsia = keyboard.nextInt();

		System.out.print( "Pengalaman Kerja ?  " );
		inputPengalaman = keyboard.nextInt();

		minBekerjaCepat = 8.0;
		minPenampilan = 9.0;
		minUsia = 30;
		minPengalaman = 3;

		balance = ( inputBekerjaCepat > minBekerjaCepat && inputPenampilan >= minPenampilan ) && ( inputUsia > minUsia || inputPengalaman >= minPengalaman );

		System.out.println( "Sesuai ?  : " + balance );		
	}
}