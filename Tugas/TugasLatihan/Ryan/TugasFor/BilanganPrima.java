/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmad N
     * Created By :	Ryan Ahmad N
     * Created At : 17 May 2018 07:52
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class BilanganPrima{
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);

		int batas, bilAwal, angka=0;
		String bilanganPrima="";

		System.out.println("Menampilkan bilangan prima dengan batas yang ditentukan");
		System.out.println("========================================================");
		System.out.print("\nBatas\t: ");
		batas = key.nextInt();
		
		for (bilAwal = 1;bilAwal <= batas ;bilAwal++ ) {
			int pencacah = 0;
			for (angka = bilAwal; angka >= 1 ;angka-- ) {
				if (bilAwal%angka == 0) {
					pencacah = pencacah+1;
				}
			}
			if (pencacah == 2) {
				bilanganPrima = bilanganPrima+bilAwal+" ";
			}
		}
		System.out.println();
		System.out.println(bilanganPrima);
	}
}