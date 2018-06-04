/*
	 Program     : Tugas For - Soal 2
     Creator     : Khairil
     Created At  : 16 Mei 2018 11:40 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class SoalFor2 {
	public static void main( String[] args ) {
		int jumlahKue = 200, pieceKue = 3, jamKeMenit = 60, waktuJam = 8, waktuJam2 = 30, totalWaktu;

		jamKeMenit = 60;
		waktuJam   = 8;
		waktuJam2  = 30;

		for(totalWaktu = 0; totalWaktu <= jamKeMenit * waktuJam + waktuJam2 ; totalWaktu+=15) {
			jumlahKue-=3;
			if(totalWaktu == jamKeMenit * waktuJam + waktuJam2) {
				System.out.println("Sisa kue " + jumlahKue);
			}
		}
	}
}