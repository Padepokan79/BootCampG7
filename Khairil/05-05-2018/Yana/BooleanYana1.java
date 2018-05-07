/*
	 Program     : Boolean Yana 1 / Lowongan Pekerjaan
     Creator     : Khairil
     Created At  : 3 Mei 2018 15:45 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanYana1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputJK, l, p, inputPend, s1, s2, s3, inputJava, inputAngular, inputPhp, inputPengalaman, y;
		int inputUmur, umurMin;
		boolean qualified;

		System.out.print( "Umur Anda ?  " );
		inputUmur = keyboard.next();		

		System.out.print( "Jenis Kelamin Anda (Pilih L atau P) ?  " );
		inputJK = keyboard.next();		

		System.out.print( "Pendidikan (Pilih S1, S2, S3) ?  " );
		inputPend = keyboard.next();		

		System.out.print( "Bisa Java (Pilih Y atau T) ?  " );
		inputJava = keyboard.next();		

		System.out.print( "Bisa Angular JS (Pilih Y atau T) ?  " );
		inputAngular = keyboard.next();

		System.out.print( "Bisa PHP (Pilih Y atau T) ?  " );
		inputPhp = keyboard.next();

		System.out.print( "Pengalaman (Pilih Y atau T) ?  " );
		inputPengalaman = keyboard.next();

		umurMin = 23;
		l = "L";
		p = "P";
		s1 = "S1";
		s2 = "S2";
		s3 = "S3";
		y = "Y";

		qualified = ( inputUmur >= umurMin && inputJK.equals(l) && (inputPend.equals(s1) || inputPend.equals(s2) || inputPend.equals(s3) ) && ( (inputJava.equals(y) && inputAngular.equals(y)) || (inputJava.equals(y) && inputPhp.equals(y)) ) && inputPengalaman.equals(y) );

		System.out.println( "Diterima ?  : " + qualified );		
	}
}