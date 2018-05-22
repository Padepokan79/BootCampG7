/*
	 Program     : Tugas For - Soal 1
     Creator     : Khairil
     Created At  : 16 Mei 2018 11:36 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class SoalFor1 {
	public static void main( String[] args ) {
		int inputAngka, angkaMax = 1000;

		for(inputAngka = 1; inputAngka <= angkaMax; inputAngka++) {
			if( inputAngka % 2 == 1 || inputAngka % 4 == 0 ) {
				System.out.print(inputAngka + ", ");
			}
		}
	}
}