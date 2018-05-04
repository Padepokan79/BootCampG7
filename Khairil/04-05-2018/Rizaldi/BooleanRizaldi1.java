/*
	 Program     : Boolean Rizaldi 1 / Universitas Gajah Duduk
     Creator     : Khairil
     Created At  : 3 Mei 2018 15:00 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanRizaldi1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double inputNilaiA, inputNilaiB, inputNilaiC, inputNilaiD, inputNilaiE, inputNilaiF, inputNilaiG, inputNilaiH, kriteriaLulus, kriteriaWajib; 
		boolean kelulusan;

		System.out.print( "Input nilai A :  " );
		inputNilaiA = keyboard.nextDouble();
		System.out.print( "Input nilai B :  " );
		inputNilaiB = keyboard.nextDouble();
		System.out.print( "Input nilai C :  " );
		inputNilaiC = keyboard.nextDouble();
		System.out.print( "Input nilai D :  " );
		inputNilaiD = keyboard.nextDouble();
		System.out.print( "Input nilai E :  " );
		inputNilaiE = keyboard.nextDouble();
		System.out.print( "Input nilai F :  " );
		inputNilaiF = keyboard.nextDouble();
		System.out.print( "Input nilai G :  " );
		inputNilaiG = keyboard.nextDouble();
		System.out.print( "Input nilai H :  " );
		inputNilaiH = keyboard.nextDouble();

		kriteriaLulus = 6;
		kriteriaWajib = 7;

		kelulusan = ( (inputNilaiA >= kriteriaWajib && inputNilaiC >= kriteriaWajib && inputNilaiD >= kriteriaWajib && inputNilaiE >= kriteriaWajib ) && ((inputNilaiA >= kriteriaLulus && inputNilaiB >= kriteriaLulus && inputNilaiC >= kriteriaLulus && inputNilaiD >= kriteriaLulus && inputNilaiE >= kriteriaLulus && inputNilaiF >= kriteriaLulus && inputNilaiG >= kriteriaLulus && inputNilaiH >= kriteriaLulus ))  );

		System.out.println( "Lulus ?  : " + kelulusan );		
	}
}