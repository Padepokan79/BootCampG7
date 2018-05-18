/*
	 Program     : Tugas While - Soal 1
     Creator     : Khairil
     Created At  : 17 Mei 2018 12:49 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class SoalWhile1 {
	public static void main( String[] args ) {
		int inputAngka, angkaMax = 1000;

		inputAngka = 1; 

		while(inputAngka <= angkaMax) {
			if( inputAngka % 2 == 1 || inputAngka % 4 == 0 ) {
				System.out.print(inputAngka + ", ");
			}
			inputAngka++;
		}

		System.out.println();
	}
}