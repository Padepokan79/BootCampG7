/*
	 Program     : Tugas Do While - Soal 1
     Creator     : Khairil
     Created At  : 18 Mei 2018 12:56 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class SoalDoWhile1 {
	public static void main( String[] args ) {
		int inputAngka, angkaMax = 1000;

		inputAngka = 1; 

		do {
			if( inputAngka % 2 == 1 || inputAngka % 4 == 0 ) {
				System.out.print(inputAngka + ", ");
			}
			inputAngka++;			
		}
		
		while(inputAngka <= angkaMax);

		System.out.println();
	}
}