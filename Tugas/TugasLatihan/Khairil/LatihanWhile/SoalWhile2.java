/*
	 Program     : Tugas While - Soal 2
     Creator     : Khairil
     Created At  : 17 Mei 2018 12:52 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class SoalWhile2 {
	public static void main( String[] args ) {
		int jumlahKue = 200, pieceKue = 3, jamKeMenit = 60, waktuJam = 8, waktuJam2 = 30, totalWaktu;

		jamKeMenit = 60;
		waktuJam   = 8;
		waktuJam2  = 30;
		totalWaktu = 0; 

		while(totalWaktu <= jamKeMenit * waktuJam + waktuJam2) {
			jumlahKue = jumlahKue - pieceKue;
			totalWaktu = totalWaktu + 15;
		}

		System.out.println("Sisa kue " + jumlahKue);
	}
}