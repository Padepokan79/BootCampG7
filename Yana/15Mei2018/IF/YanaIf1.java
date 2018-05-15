/*
Created by	: Yana
Time		: 14 Mei 2018 23.02
*/

import java.util.Scanner;

public class YanaIf1{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int	uangBudi, hargaTas, hargaDompet, hargaSepatu, 
		hargaJas, hargaKemeja, hargaDasi, totalBelanja;

		hargaTas	= 60000;
		hargaDompet	= 40000;
		hargaSepatu	= 120000;
		hargaJas	= 250000;
		hargaKemeja = hargaTas + hargaDompet;
		hargaDasi	= hargaDompet;


		System.out.print("Masukkan uang Budi: ");
		uangBudi = keyboard.nextInt();


		if ( uangBudi > 500000) {			
			System.out.println("Budi membeli jas seharga Rp. " +hargaJas);	
			System.out.println("Budi membeli kemeja seharga Rp. " +hargaKemeja);	
			System.out.println("Budi membeli dasi seharga Rp. " +hargaDasi);

			totalBelanja = hargaJas + hargaKemeja + hargaDasi;
			uangBudi	 = uangBudi - totalBelanja;

			System.out.println("Sisa uang Budi Rp. " +uangBudi);		
		}
		else if ( uangBudi > 90000) {
				System.out.println("Budi membeli tas seharga Rp. " +hargaTas);
			if ( uangBudi > 200000) {
				System.out.println("Budi membeli sepatu seharga Rp. " +hargaSepatu);

				totalBelanja = hargaTas + hargaSepatu;
				totalBelanja = totalBelanja - (totalBelanja*10/100);
				uangBudi	 = uangBudi - totalBelanja;

				System.out.println("Sisa uang Budi adalah Rp. " +uangBudi);					
			}
			else if ( uangBudi > 100000) {
				System.out.println("Budi membeli dompet seharga Rp. " +hargaDompet);

				totalBelanja = hargaTas + hargaDompet;
				totalBelanja = totalBelanja - (totalBelanja*10/100);
				uangBudi	 = uangBudi - totalBelanja;

				System.out.println("Sisa uang Budi adalah Rp. " +uangBudi);					
			}
			else{
				totalBelanja = hargaTas - (hargaTas*10/100);
				uangBudi	 = uangBudi - totalBelanja;

				System.out.println("Sisa uang Budi adalah Rp. " +uangBudi);

			}
		}

	}
}