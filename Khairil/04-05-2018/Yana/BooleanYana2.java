/*
	 Program     : Boolean Yana 2 / Bidikmisi S3
     Creator     : Khairil
     Created At  : 3 Mei 2018 15:50 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanYana2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputJK, l, p, y, inputPend, s2, inputAkreditasi, akreditasiA, akreditasiB;
		double inputIpkS1, ipkMin, inputIpkS2; 
		boolean qualified;

		System.out.print( "Jenis Kelamin Anda (Pilih L atau P) ?  " );
		inputJK = keyboard.next();		

		System.out.print( "Pendidikan ?  " );
		inputPend = keyboard.next();		

		System.out.print( "IPK S1 ?  " );
		inputIpkS1 = keyboard.nextDouble();		

		System.out.print( "IPK S2 ?  " );
		inputIpkS2 = keyboard.nextDouble();

		System.out.print( "Akreditasi Kampus ?  " );
		inputAkreditasi = keyboard.next();

		l = "L";
		p = "P";
		s2 = "S2";
		y = "Y";
		ipkMin = 3.25;
		akreditasiA = "A";
		akreditasiB = "B";

		qualified = ( (inputJK.equals(l) || inputJK.equals(p)) && ( inputIpkS1 >= ipkMin && inputIpkS2 >= ipkMin) && inputPend.equals(s2) && (inputAkreditasi.equals(akreditasiA) || inputAkreditasi.equals(akreditasiB)) );

		System.out.println( "Diterima ?  : " + qualified );		
	}
}