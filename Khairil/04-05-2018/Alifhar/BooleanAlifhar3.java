/*
	 Program     : Boolean Alifhar 3 / Kelulusan
     Creator     : Khairil
     Created At  : 3 Mei 2018 18:55 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanAlifhar3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputPensil, pensilHarus, inputRambut, harusRambut;
		int inputBenar, inputSalah, inputKosong, poinBenar, poinSalah, poinKosong, inputKerapihan, skalaKerapihan, nilaiLulus, maxSoal; 
		double nilaiMin;
		boolean kedisiplinan, kelulusan;

		System.out.print( "Jawaban Benar\t :  " );
		inputBenar = keyboard.nextInt();

		System.out.print( "Jawaban Salah\t :  " );
		inputSalah = keyboard.nextInt();

		System.out.print( "Jawaban Kosong\t :  " );
		inputKosong = keyboard.nextInt();

		System.out.print( "Pensil yang digunakan (HB/2B/3B/4B/5B/6B)\t :  " );
		inputPensil = keyboard.next();

		System.out.print( "Skala Kerapihan (0 sampai 10)\t :  " );
		inputKerapihan = keyboard.nextInt();

		System.out.print( "Rambut (pendek/panjang)\t :  " );
		inputRambut = keyboard.next();

		maxSoal = 60;
		poinBenar = 4;
		poinSalah = -1;
		poinKosong = 0;
		nilaiMin = (inputBenar * poinBenar) + (inputSalah * poinSalah) + (inputKosong * poinKosong);
		nilaiLulus = 130;
		pensilHarus = "2B";
		skalaKerapihan = 8;
		harusRambut = "pendek";

		kedisiplinan = inputPensil.equals(pensilHarus) && inputRambut.equals(harusRambut) && inputKerapihan >= skalaKerapihan;
		kelulusan = kedisiplinan && ( nilaiMin > nilaiLulus && inputBenar + inputSalah + inputKosong == maxSoal);

		System.out.println( "Total Nilai   : " + nilaiMin );		
		System.out.println( "Kedisiplinan  : " + kedisiplinan );		
		System.out.println( "Anda Lulus    : " + kelulusan );		
	}
}