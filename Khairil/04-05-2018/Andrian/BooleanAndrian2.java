/*
	 Program     : Boolean Andrian 2 / Triangle
     Creator     : Khairil
     Created At  : 3 Mei 2018 13:40 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanAndrian2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String jk, l, p, inputKTP, ktpY;
		int inputUsia, usiaMin, inputPenghasilan, penghasilan, inputTinggi, tinggiL, tinggiP;
		boolean triangle;

		System.out.print( "Kamu Laki-laki apa Perempuan ? Input L atau P  :  " );
		jk = keyboard.next();

		System.out.print( "Usia kamu  :  " );
		inputUsia = keyboard.nextInt();

		System.out.print( "Punya KTP ? Input Y atau T  :  " );
		inputKTP = keyboard.next();

		System.out.print( "Penghasilan kamu  :  " );
		inputPenghasilan = keyboard.nextInt();

		System.out.print( "Tinggi kamu  :  " );
		inputTinggi = keyboard.nextInt();

		ktpY = "Y";
		l = "L";
		p = "P";
		usiaMin = 25;
		penghasilan = 3000000;
		tinggiL = 160;
		tinggiP = 153;

		triangle = ( ((jk.equals(l) && inputTinggi > tinggiL ) || ( jk.equals(p) && inputTinggi > tinggiP  )) && inputUsia >= usiaMin && inputKTP.equals(ktpY) && inputPenghasilan > penghasilan );
		System.out.println( "Boleh masuk ga : " + triangle );		
	}
}