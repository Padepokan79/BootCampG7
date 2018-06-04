/*
	 Program     : Tugas Do While - Soal 2
     Creator     : Khairil
     Created At  : 18 Mei 2018 13:00 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class SoalDoWhile2 {
	public static void main( String[] args ) {
		int jumlahKue = 200, pieceKue = 3, jamKeMenit = 60, waktuJam = 8, waktuJam2 = 30, totalWaktu;

		jamKeMenit = 60;
		waktuJam   = 8;
		waktuJam2  = 30;
		totalWaktu = 0; 

		do {
			jumlahKue = jumlahKue - pieceKue;
			totalWaktu = totalWaktu + 15;			
		}

		while(totalWaktu <= jamKeMenit * waktuJam + waktuJam2);

		System.out.println("Sisa kue " + jumlahKue);
	}
}