/*
	 Program     : Boolean Andrian 3 / Perumahan
     Creator     : Khairil
     Created At  : 3 Mei 2018 13:55 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanAndrian3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputRenov, renovY, renovT, inputKota, kotaWajib;
		int inputLantai, lantai, inputMobilGarasi, mobilGarasi, inputKolam, kolam, inputFlora, flora, floraAlternate;
		double inputLuas, luas, luasAlternate;
		boolean perumahan;

		System.out.print( "Kota yang dimaksud  :  " );
		inputKota = keyboard.nextDouble();

		System.out.print( "Input Luas Rumah dalam Ha  :  " );
		inputLuas = keyboard.nextDouble();

		System.out.print( "Bisa Direnovasi ? (Pilih Y atau T) :  " );
		inputRenov = keyboard.next();

		System.out.print( "Input jumlah lantai  :  " );
		inputLantai = keyboard.nextInt();

		System.out.print( "Input kapasitas Garasi  :  " );
		inputMobilGarasi = keyboard.nextInt();

		System.out.print( "Input jumlah kolam renang  :  " );
		inputKolam = keyboard.nextInt();

		System.out.print( "Input jumlah jenis flora  :  " );
		inputFlora = keyboard.nextInt();

		kotaWajib = inputKota.equals("Heidelberg");
		luas = 0.3;
		luasAlternate = 0.7;
		renovY = "Y";
		renovT = "T";
		lantai = 3;
		mobilGarasi = 3;
		kolam = 2;
		flora = 5;
		floraAlternate = 8;

		perumahan = ( kotaWajib && (inputKolam < kolam && inputFlora >= floraAlternate) || (inputLantai < lantai && inputLuas >= luasAlternate) || (inputLuas >= luas && inputRenov.equals(renovY) && inputMobilGarasi > mobilGarasi && inputKolam >= kolam && inputFlora >= flora  ) );
		System.out.println( "Masuk kriteria ga : " + perumahan );		
	}
}