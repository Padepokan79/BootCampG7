/*
	 Program     : Boolean Richa 2 / Penilaian Diri
     Creator     : Khairil
     Created At  : 3 Mei 2018 19:45 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanRicha2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputNama, inputSenyum, y, t;
		int inputTeman, inputKriminal, sebaiknya, temanBaik, maxJahat;
		boolean orangBaik, yes, no;

		System.out.println( "Hai kamu ingin tahu kan bagaimana orang menilaimu?" );
		System.out.println( "Isi penilaian di bawah ini ya :)");
		System.out.println();
		System.out.println( "++++++++++++++++++++++++++++++++++++++++++++++++++++" );

		System.out.print( "Nama : " );
		inputNama = keyboard.next();

		System.out.print( "Berapa teman baik yang kamu punya, " + inputNama + "  " );
		inputTeman = keyboard.nextInt();

		System.out.print( "Apakah kamu pernah melakukan pelanggaran kriminal sebelumnya? kalo iya, berapa kali?" );
		inputKriminal = keyboard.nextInt();
		
		System.out.print( "Menurutmu kamu murah senyum atau tidak? (Ya/Tidak)" );
		inputSenyum = keyboard.next();

		temanBaik = 13;
		maxJahat = 7;
		y = "Ya";
		t = "Tidak";

		orangBaik = ( inputTeman => temanBaik && inputKriminal < maxJahat ) || ( inputSenyum.equals(y) && inputKriminal < maxJahat ) || ( inputTeman => temanBaik && inputSenyum.equals(y) ) ;

		System.out.println( "Baiklah," );
		System.out.println( "Apakah " + inputNama + " adalah orang yang baik? " + orangBaik );		
		System.out.println( "Terimakasih! teruslah menjadi orang yang baik yaa" );
	}
}